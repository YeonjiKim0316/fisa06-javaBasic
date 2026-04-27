package computerInterface;

// interface를 상속받는 것을 extends가 아닌
// "구현" implements 라는 키워드로 연결해서 사용
public class Laptop implements Computer {

    // 인스턴스 변수 선언
    String power1;

    @Override
    public void powerOn() {
        this.power1 = "on";
        System.out.println("키보드의 전원이 눌려서" + this.power1 + " 상태입니다");
    }

    @Override
    public void powerOff() {
        this.power1 = "off";
        System.out.println("키보드의 전원이 눌려서" + this.power1 + " 상태입니다");
    }
}
