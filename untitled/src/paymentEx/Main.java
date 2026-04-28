package paymentEx;

public class Main {
    public static void main(String[] args) {
        // 신용카드와 NaverPay 결제 객체 생성
//        Payment creditCard = new CreditCardPayment();
        Payment creditCard = new CreditCardPayment(50000);
//        creditCard.process();
        Payment naverPay = new NaverPayPayment(30000);
//        naverPay.processPayment();

//        // 결제 처리 (정적 메서드 사용)
        PaymentProcessor.process(creditCard);
        PaymentProcessor.process(naverPay);

        Payment.getCount(); // 결제 예정 건수
        // 실제 결제 성공 건수, 성공 금액은 PaymentProcessor에서 별도의 static 메서드로 관리합니다.
        PaymentProcessor.getFinalCount();

        System.out.println();

        // Payment 자료형으로 만든 인스턴스에서는 Refundable 인터페이스에서 물려받은 구상메서드를 사용할 수 없습니다.
        CreditCardPayment orderCreditPay = new CreditCardPayment(20000);
        orderCreditPay.refund();

        // 환불 기능 테스트 (다운캐스팅 사용)
        // instanceof 연산자는 객체가 null인 경우 false를 반환합니다.
        // instanceof 연산자를 사용하여 타입을 확인한 후, 안전하게 다운캐스팅할 수 있습니다.
        if (creditCard instanceof Refundable) {
            ((Refundable) creditCard).refund();
        }

        if (naverPay instanceof Refundable) {
            ((Refundable) naverPay).refund();
        }
    }
}
