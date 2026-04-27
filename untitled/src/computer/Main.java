package computer;

public class Main {
    public static void main(String[] args) {
        // Computer = new Computer(); // abstract이며, 인스턴스화할 수 없습니다
        LapTop pc1 = new LapTop();
        pc1.powerOn();
        pc1.openChrome();
        pc1.login();
        pc1.powerOff();
    }
}
