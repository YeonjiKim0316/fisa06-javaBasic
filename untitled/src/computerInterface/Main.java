package computerInterface;

import computer.LapTop;
import oop2.MyDefault;
import oop2.MyMyPublic;
import oop2.MyProtected;
import oop2.MyPublic;

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
        // DeskTop을 Computer 인터페이스를 구현해서 작성해보세요.
        // 접근제어자를 바꿔가면서 computer.Main.main 에서는 동작 안 하고
        // computerInterface.Main.main에서는 동작하는 메서드,
        // 확인 가능한 변수들을 직접 확인해보십시오.
        System.out.println(DeskTop.power); // static 변수(클래스 변수)
//        DeskTop.power = "on";  // final 변수 'power'에 값을 대입할 수 없습니다.

        DeskTop pc1 = new DeskTop();
        pc1.powerOff(); // 자식클래스에서 재정의
        pc1.powerOn(); // 재정의
        pc1.run();// 부모 인터페이스에 구상메서드로 정의

        // 외부클래스에서 가져온 LapTop
        //  cannot be accessed from outside package
        LapTop pc2 = new LapTop();
//        pc2.run();


        MyPublic mp1 = new MyPublic();
        mp1.print(); // 인스턴스 메서드
        System.out.println(mp1.msg); // 인스턴스 변수
        System.out.println(MyPublic.hello); // 클래스 변수
        MyPublic.pprint(); // 클래스 메서드

        System.out.println("====== protected 접근 제어자 =====");
        MyProtected mp3 = new MyProtected(); // public class가 객체 생성 가능
//        mp3.print(); // 다른 패키지 안이라서 접근 불가
//        System.out.println(mp3.msg); // 다른 패키지 안이라서 접근 불가

        System.out.println("====== protected 접근 제어자를 상속받은 MyMyPublic =====");
        MyMyPublic mp4 = new MyMyPublic(); // class가 public이라 객체 생성 가능
//        mp4.print(); // msg는 protected 변수지만 print()가 public 메서드이면
                    // 외부에서 출력 가능

        System.out.println("====== default 클래스 =========");
        MyDefault mp5 = new MyDefault(); // class가 default 이므로 객체 생성 불가
        mp4.print();
//        System.out.println(mp4.msg);



    }
}
