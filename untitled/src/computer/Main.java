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


        System.out.println("====컴퓨터 인터페이스에서 가져온 DeskTop=====");
        computerInterface.DeskTop pc5 = new computerInterface.DeskTop();
        pc5.run(); // 인터페이스의 default는 public이므로 외부 패키지에서도 메서드 사용 가능
        // 확실한 것만을 작성하고 기준은 '추상'이므로
    }
}
