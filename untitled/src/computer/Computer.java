package computer;

// 추상클래스: 상속받아서 이용할 기능들을 점검하는 점검표(추상적)
// 추상메서드는 함수 시그니처만 작성하고
// 구상메서드, 구상변수도 함께 적어줄 수 있습니다.
// 추상메서드는 abstract 라는 키워드로 구분합니다.
// 세부내용은 부모클래스를 상속받은 자식클래스에서 구현하기 위한 명세
public abstract class Computer {
    String power;

    // 생성자
    Computer() {
        this.power = "off";
    }

    // 구상메서드
    void login() {
        System.out.println("로그인 완료");
    }
    void openChrome() {
        System.out.println("크롬을 켭니다");
    };

    // abstract 추상 메서드 <-> 구상메서드
    abstract void powerOn();

    abstract void powerOff();


    // 메서드의 순서를 정의하는 메서드: 템플릿 메서드라고 부릅니다.
    void run() {
        powerOn();
        openChrome();
        login();
        powerOff();
    }
}