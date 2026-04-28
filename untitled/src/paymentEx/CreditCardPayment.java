package paymentEx;

public class CreditCardPayment extends Payment implements Refundable{

    CreditCardPayment(double payAmount) {
        super(payAmount);
    }

    // 생성자를 작성하지 않으면 default 생성자만 만들어줌.

    @Override
    void processPayment() {
        displayAmount();
    }

    @Override
    public void refund() {
        System.out.println("amount가 부모클래스에서 private 변수이기 때문에 접근이 불가");
    }
}
