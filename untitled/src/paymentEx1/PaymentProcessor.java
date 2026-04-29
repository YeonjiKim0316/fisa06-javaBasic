package paymentEx1;


// 1. 싱글톤(Singleton) 패턴
// 클래스의 인스턴스가 프로그램 전체에서 단 하나만 존재하도록 관리하는 패턴
// 1. 생성자를 private으로 막아서 프로그램 전체에서 단 한번만 생성되도록 보장합니다.
// 2. 클래스 내부에 자기 자신의 유일한 인스턴스를 static 필드로 보관합니다.
// 3. getInstance() 라는 static 메서드로만 그 인스턴스에 접근할 수 있게 됩니다.
// SpringBoot : @Controller, @Service 등의 어노테이션으로 아래처럼 클래스를 단 하나의 인스턴스로 메모리에 올려두고
// 재사용하도록 동작

// 프로그램 전체에서 하나의 인스턴스를 가지고 결제와 관련된 기능을 전담하도록
//  결제 처리 (정적 메서드 사용) :
//  외부에서 이 모듈을 사용한다거나, 결제 자체를 위한 각종 기능들을 묶어서 사용하는 클래스

public class PaymentProcessor {

    // 유일한 인스턴스를 담는 클래스 변수
    private static PaymentProcessor instance;

    // 실제 결제 완료 건수
    private int count;

    // private static int count; // 실제 결제 완료 건수를 count


    // 외부에서 new PaymentProcessor() 호출 불가
    // 객체 생성 비용 감소, 일관된 상태 관리, DI/테스트 편의성, 책임 분리
    private PaymentProcessor() {
        this.count = 0;
    }

    // 인스턴스가 없으면 딱 한 번만 생성하고, 이후에는 같은 인스턴스를 반환합니다.
    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    // 아래 모든 static method 들을 instance method로 전환
    // public static void process(Payment payment) {
    public void process(Payment payment) {
        payment.process(); // 결제 금액을 보여주고
        System.out.println(payment.displayAmount() + "를 실제로 결제 완료했습니다.");// 실제 결제를 진행하는 순서로 동작
        // count++;
        this.count++;

    }

    public void getFinalCount() {
        System.out.println("총 결제 완료 건수는 "+ this.count + "건 입니다.");
    }

    public void refund(Payment payment) {

        // 환불 기능 테스트 (다운캐스팅 사용)
        // instanceof 연산자는 객체가 null인 경우 false를 반환합니다.
        // instanceof 연산자를 사용하여 타입을 확인한 후, 안전하게 다운캐스팅할 수 있습니다.
        if (payment instanceof Refundable) {
            ((Refundable) payment).refund();
        }
        this.count--;
    }

}
