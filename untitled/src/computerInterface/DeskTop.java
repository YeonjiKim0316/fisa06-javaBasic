package computerInterface;

public class DeskTop implements Computer {
    @Override
    public void powerOn() {
        System.out.println("전원을 켭니다");
    }

    // 구현(또는 상속)받은 부모클래스보다 좁은 권한 줄 수 없음
    @Override
    public void powerOff() {
        System.out.println("전원을 끕니다");

    }
}
