package oop1;

// 클래스 안에 작성하는 것들
// 클래스 메서드, 클래스 변수: 인스턴스를 찍어내지 않고 바로 클래스를 통해 사용할 수 있는 함수와 속성
                        //  Student.hello()
// 인스턴스 메서드, 인스턴스 변수: 인스턴스를 만들어야만 사용되는 개별 객체의 고유한 함수와 속성
                        // Student kim = new Student()
                        // kim.enter();
public class Student {

    // 클래스 변수(필드) static 키워드로 구분합니다.
    static int totalStudentNo = 100;

    // 인스턴스 변수(필드)
    String className;
    String name;

    // Overloading(다형성) 자바는 자료형에 따라 다른 방식으로 같은 함수를
    // 다른 방식으로 사용하도록 구현되어 있습니다.

    // default 생성자 하나는 우리가 생성자를 빼먹으면 자바 컴파일러가 넣어줌
    Student (){
    }

    // 생성자를 선언하면 자바는 default 생성자를 더이상 컴파일 과정에서 만들지 않습니다.
    Student(String name) {
        this.name = name;
    }

    Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // 리턴타입 메서드명
    // 리턴이 없을 때는 void(비어있음)으로 해당 자리를 채워넣습니다.
    // String으로 time이라는 변수를 받아서
    void enter() {
        System.out.println("9시에 " + this.name + "이 입실했습니다");
    }

    void enter(String time) {
        System.out.println(time+"에 " + this.name + "이 입실했습니다");
    }

    String exit() {
        return this.name + "이 퇴실했습니다.";
    }

    // static으로 선언
    static void totalStudentPrint() {
        System.out.println(totalStudentNo + "명의 수강생이 있습니다.");
    }
}
