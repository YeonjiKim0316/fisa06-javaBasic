package paymentEx1;
// ### 팩토리 패턴

// **핵심 아이디어:** 객체를 생성하는 책임을 별도의 클래스에 위임합니다.
// 클라이언트(`Main`)는 어떤 구체 클래스가 만들어지는지 알 필요가 없습니다.

// 새로운 결제 수단(`KakaoPayPayment`)이 추가될 때 `Main`은 건드리지 않고 `PaymentFactory`만 수정하면 됩니다.
public class PaymentFactory {
    public static Payment create(String type, double amount) {
        if (type.equals("credit")) return new CreditCardPayment(amount);
        if (type.equals("naver"))  return new NaverPayPayment(amount);
//        if (type.equals("kakao"))  return new KakaoPayPayment(amount);
        throw new IllegalArgumentException("알 수 없는 결제 수단: " + type);
    }
}

