package oop2;

// 클래스 변수, 클래스 메서드
// 인스턴스 변수, 인스턴스 메서드
public class MyPublic {

    public static String hello = "퍼블릭클래스변수"; // 클래스 변수

    public static void pprint() { // 클래스 메서드
        System.out.println(hello);
    }

    public String msg = "퍼블릭변수"; // 인스턴스 변수
    public void print() { // 인스턴스 메서드
        System.out.println(this.msg);
    }

}
