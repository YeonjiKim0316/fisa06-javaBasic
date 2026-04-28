package paymentEx;

// 환불과 관련된 추상 메서드(점검표)
//### **2. 인터페이스 - `Refundable`**
//
//        - **환불 기능**을 제공해야 하는 결제 수단을 구분합니다.
//        1. **메서드**:
//        - `refund()` – 결제를 환불합니다.

// 기준이 "없음"(추상), final로 선언된 변수, default로 접근제어자를 작성한 구상 메서드, static 변수
public interface Refundable {

    void refund(); // 기준이 추상이므로 abstract 라는 키워드를 사용할 필요가 없습니다.
}
