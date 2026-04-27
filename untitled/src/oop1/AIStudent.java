package oop1;

// class AIStudent(Student):
// 자식클래스  extends(상속) 부모클래스
public class AIStudent extends Student {

    // 클래스변수 34명  ?? 클래스변수만 바꾸면 클래스 메서드도 같이 34를 사용하나?
    static int totalStudentNo = 34;

    int finalProject; // 인스턴스 변수 선언

    // 생성자 변경: 인스턴스 변수: finalProject: 조이름
    AIStudent(String name, String className, int finalProject)
    {
        super(name, className);
//        this.name = name;
//        this.className = className;
        this.finalProject = finalProject;
    }

    // 인스턴스 메서드를 하나 더 추가해서 사용: openChrome() : "구글드라이브에 들어갑니다"

    void openChrome() {
        System.out.println(this.className+"은 구글드라이브 들어갑니다");
    }

    // 부모클래스의 인스턴스 메서드를 재정의할 때는
    // @Override 어노테이션으로 구분해줍니다. -> 빼먹으면 컴파일러가 알아서 해줌
    @Override
    void enter() {
        super.enter();
        System.out.println("CLASS 2로 들어갑니다.");
    };

    static void totalStudentPrint() {
        System.out.println(totalStudentNo + "명의 수강생이 있습니다.");
    }
}
