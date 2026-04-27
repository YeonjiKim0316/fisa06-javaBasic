package computer;

public class Main {
    public static void main(String[] args) {
        // Computer = new Computer(); // abstract이며, 인스턴스화할 수 없습니다
        LapTop pc1 = new LapTop();
        pc1.run();
        System.out.println("=================");

        DeskTop pc2 = new DeskTop();
        pc2.run();
    }
}
