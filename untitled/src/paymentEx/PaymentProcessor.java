package paymentEx;

//  결제 처리 (정적 메서드 사용) : 외부에서 이 모듈을 사용한다거나, 결제 자체를 위한 각종 기능들을 묶어서 사용하는 클래스
public class PaymentProcessor {

    private static int count; // 실제 결제 완료 건수를 count

    public static void process(Payment payment) {
        payment.process(); // 결제 금액을 보여주고
        System.out.println(payment.displayAmount() + "를 실제로 결제 완료했습니다.");// 실제 결제를 진행하는 순서로 동작
        count++;
    }

    public static void getFinalCount() {
        System.out.println("총 결제 완료 건수는 "+ count + "건 입니다.");
    }

}
