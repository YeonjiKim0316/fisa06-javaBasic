package paymentEx;


//### **1. 추상 클래스 - `Payment`**
//
//        - 모든 결제 수단이 가져야 할 **공통 속성**과 **기능**을 정의합니다.
//        1. **필드**:
//        - `amount` (double): 결제 금액 (**접근 제어자** 사용)
//2. **메서드**:
//        - **추상 메서드** `processPayment()` – 결제를 처리합니다.
//        - **일반 메서드** `displayAmount()` – 결제 금액을 출력합니다.
//3. **정적 필드**와 **정적 메서드**를 사용해 **전체 결제 건수**를 관리합니다.
// 결제와 관련된 추상, 구상 메서드가 함께 작성됩니다.
// 추상클래스에 올 수 있는 것: 생성자, static 메서드 / static 변수, 인스턴스 (구상) 메서드. 인스턴스 추상 메서드, 인스턴스 변수

public abstract class Payment {

    static int count; // 클래스 필드

    private double amount; // private 접근제어자는 같은 클래스 안에서만 접근 가능

    abstract void processPayment();

    void displayAmount() {
        System.out.println("결제 금액은 "+ this.amount + "입니다. ");
    }

    static void getCount() {
        System.out.println("총 결제 건수는 "+ count + "건 입니다.");
    }

}
