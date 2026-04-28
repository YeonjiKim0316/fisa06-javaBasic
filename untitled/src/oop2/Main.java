package oop2;

/*
class의 경우
접근 제어자	같은 클래스의 멤버	/ 같은 패키지의 멤버 /자식 클래스의 멤버 / 그 외의 영역
public	        ○	              ○	                ○           	○
protected	    ○	              ○	                ○	            X
default	        ○	              ○	                X           	X
private	        ○	              X	                X           	X
*/
public class Main {
    public static void main(String[] args) {
        MyPublic mp1 = new MyPublic();
        mp1.print(); // 인스턴스 메서드
        System.out.println(mp1.msg); // 인스턴스 변수
        // 클래스 변수, 클래스 메서드는 인스턴스로 접근 불가
        System.out.println(MyPublic.hello); // 클래스 변수
        MyPublic.pprint(); // 클래스 메서드

        System.out.println("========== MyProtected을 상속한 자식클래스: MyMyPublic =======");
        MyMyPublic mp2 = new MyMyPublic();
        mp2.print(); // 인스턴스 메서드
        System.out.println(mp2.msg); // 인스턴스 변수
//        System.out.println(MyMyPublic.hello); // 클래스 변수
//        MyMyPublic.pprint(); // 클래스 메서드

        System.out.println("====== protected 접근 제어자 =====");
        MyProtected mp3 = new MyProtected();
        mp3.print(); // 같은 패키지 안이라서 ok
        System.out.println(mp3.msg);

    }
}
