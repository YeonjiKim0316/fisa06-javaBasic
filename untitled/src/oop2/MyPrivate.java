package oop2;

// 클래스는 함수와 변수를 담는 자바의 최소단위입니다.
// 클래스를 private, protected가 허용되지 않습니다. (만들어놓고 잠궈버리는 셈이니까)
// 클래스는 public / 아무것도 선언하지 않으면 default(패키지안에서만 접근 가능) 까지의 접근 제어자만 가능
public class MyPrivate {

    private String msg = "프라이빗 변수"; // 인스턴스 변수
    public void print() { // 인스턴스 메서드
        System.out.println(this.msg);
    }

}
