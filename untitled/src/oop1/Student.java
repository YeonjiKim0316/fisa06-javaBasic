package oop1;

// 클래스 안에 작성하는 것들
// 클래스 메서드, 클래스 변수: 인스턴스를 찍어내지 않고 바로 클래스를 통해 사용할 수 있는 함수와 속성
                        //  Student.hello()
// 인스턴스 메서드, 인스턴스 변수: 인스턴스를 만들어야만 사용되는 개별 객체의 고유한 함수와 속성
                        // Student kim = new Student()
                        // kim.enter();
public class Student {

    // 인스턴스 변수(필드)
    String className;
    String name;

    // 리턴타입 메서드명
    // 리턴이 없을 때는 void(비어있음)으로 해당 자리를 채워넣습니다.
    void enter() {
        System.out.println(this.name + "이 입실했습니다");
    }

    String exit() {
        return this.name + "이 퇴실했습니다.";
    }

}
