package computer;

import computerInterface.Laptop;

public class Main {
    public static void main(String[] args) {
        // Computer = new Computer(); // abstract이며, 인스턴스화할 수 없습니다
        LapTop pc1 = new LapTop();
        pc1.run();
        System.out.println("=================");

        DeskTop pc2 = new DeskTop();
        pc2.run();

        System.out.println("=================");

        Ipad pc3 = new Ipad();
        pc3.run();

        System.out.println("===== 외부 패키지의 Laptop 확인 ====");
        Laptop pc4 = new Laptop();
        pc4.powerOff();
        pc4.powerOn();
        // 은닉성을 사용해서 openChrome, login 이라는 메서드가 있는지도 모르게 됩니다.
        pc4.run();
    }
}
