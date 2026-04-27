package computer;

public class LapTop extends Computer {
    @Override
    void powerOn() {
        this.power = "on";
        System.out.println("키보드의 전원이 눌려서 " + this.power+" 상태입니다.");
    }

    @Override
    void openChrome() {
        System.out.println("크롬을 켭니다");
    }

    @Override
    void powerOff() {
        this.power = "off";
        System.out.println("키보드의 전원이 눌려서 " + this.power + "상태입니다" );
    }

    // 'run()'은(는) 'computer.Computer'에서 'run()'을(를) 재정의할 수 없습니다. 재정의된 메서드는 final입니
//    void run() {
//
//    }
}
