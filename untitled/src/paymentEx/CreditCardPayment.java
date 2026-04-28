package paymentEx;

public class CreditCardPayment extends Payment implements Refundable{

    CreditCardPayment(double payAmount) {
        super(payAmount);
    }

    // 생성자를 작성하지 않으면 default 생성자만 만들어줌.

    @Override
    void processPayment() {
        System.out.println("결제 금액은 " + displayAmount() + "원 입니다");
    }

    @Override
    public void refund() {
        System.out.println("환불 금액은 " + displayAmount() + "원 입니다");
    }

}
