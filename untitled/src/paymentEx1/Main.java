package paymentEx1;

// 코드를 덜 고치면서 앞으로 이 서비스를 개선해나갈 수 있는 방법으로
// 1. main 함수는 되도록 손대지 않는다.
// 2. 객체를 새로 만들거나 클래스 변수 같은 것들에 대한 접근을 최소화한다
public class Main {
    public static void main(String[] args) {
        // 싱글톤: 유일한 인스턴스를 가져옵니다.
        PaymentProcessor processor = PaymentProcessor.getInstance();

        // 같은 인스턴스인지 확인 (true 출력)
        System.out.println("같은 인스턴스인가? " + (processor == PaymentProcessor.getInstance()));

        // 팩토리: 구체 클래스를 직접 new 하지 않고 타입 문자열을 넘깁니다.
        Payment creditCard = PaymentFactory.create("credit", 50000);
        Payment naverPay   = PaymentFactory.create("naver",  30000);

        processor.process(creditCard);
        processor.process(naverPay);

        Payment.getCount();
        processor.getFinalCount();

        System.out.println();

        // 환불 가능 여부는 PaymentProcessor가 instanceof로 판단합니다.
        Payment orderCreditPay = PaymentFactory.create("credit", 20000);
        processor.refund(orderCreditPay);

        System.out.println("========= refund 후 최종 결제 건수 ======");
        processor.getFinalCount();
    }
}
