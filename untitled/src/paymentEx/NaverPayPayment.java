package paymentEx;

public class NaverPayPayment extends Payment implements Refundable{

    NaverPayPayment(double payAmount) {
        super(payAmount);
    }

    @Override
    void processPayment() {
        System.out.println("네이버 페이로 " + this.displayAmount() + "원이 결제됩니다.");
    }

    @Override
    public void refund() {
        System.out.println("네이버 페이로 결제한 "+ this.displayAmount()+ "원이 환불됩니다.");
    }
}
