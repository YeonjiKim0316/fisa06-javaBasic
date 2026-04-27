package computerInterface;

// 추상클래스의 추후에 나온 개념
// 상속받은 자식클래스에서 실제 동작을 채워넣습니다.
// 없음이 기준: 있으면 특이(확정된 값)
public interface Computer {
    // 변수에는 final 이 선언됩니다.
    // 클래스 변수로만 선언이 가능합니다.
    String power = "off";

    // 추상메서드가 기본값이므로
    // 구상메서드에 default 라는 접근제어자를 붙입니다.
    default void login() {
        System.out.println("로그인 완료");
    }
    default void openChrome() {
        System.out.println("크롬을 켭니다");
    };

    // 제어자 'abstract'은(는) 인터페이스 메서드에 불필요합니다
    abstract void powerOn();

    void powerOff();

    default void run() {
        powerOn();
        openChrome();
        login();
        powerOff();
    }
}
