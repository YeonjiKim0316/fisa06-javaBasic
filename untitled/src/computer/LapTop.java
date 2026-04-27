package computer;

public class LapTop extends Computer {
    @Override
    void powerOn() {
        this.power = "on";
        System.out.println(this.power+" 상태입니다.");
    }

    @Override
    void openChrome() {
        System.out.println("크롬을 켭니다");
    }

    @Override
    void powerOff() {
        this.power = "off";
        System.out.println(this.power + "상태입니다" );
    }
}
