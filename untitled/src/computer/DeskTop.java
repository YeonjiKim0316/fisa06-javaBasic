package computer;

public class DeskTop extends Computer {
    @Override
    void powerOn() {
        this.power = "on";
        System.out.println("본체에 딸린 전원이 눌려서" + this.power +"상태입니다");
    }

    @Override
    void powerOff() {
        this.power = "off";
        System.out.println("본체에 딸린 전원이 눌려서" + this.power +"상태입니다");
    }
}
