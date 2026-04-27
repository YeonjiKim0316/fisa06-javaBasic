package computer;

// Computer를 상속받아서 "모서리에 전원 있고", "터치로 크롬에 들어갑니다"
public class Ipad extends Computer {
    @Override
    void powerOn() {
        this.power = "on";
        System.out.println("모서리의 버튼을 눌러서 " + this.power + "상태입니다.");
    }

    @Override // 부모 클래스의 메서드를 재정의했어요
    void openChrome() {
        System.out.println("터치로 크롬에 들어갑니다");
        super.openChrome();
    }

    @Override
    void powerOff() {
        this.power = "off";
        System.out.println("모서리의 버튼을 눌러서 " + this.power + "상태입니다.");


    }
}
