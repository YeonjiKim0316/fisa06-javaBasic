package computer;

// 세부내용은 부모클래스를 상속받은 자식클래스에서 구현하기 위한 명세
public abstract class Computer {
    String power;

    // 생성자
    Computer() {
        this.power = "off";
    }

    // abstract 추상 메서드 <-> 구상메서드
    abstract void powerOn();

}