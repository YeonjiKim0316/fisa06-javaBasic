package oop1;

public class Main {
    // 자바의 입구함수 (컴파일러가 최초로 실행하는 함수)
    public static void main(String[] args) {
        Student kim = new Student("김연지"); // 이름만 받고
        System.out.println(kim.name);
        System.out.println(kim.className);
        kim.enter("11시");
        String result = kim.exit();
        System.out.println(result);

        // 이름, 반이름을 함께 받는
        Student shin = new Student("신짱구", "AI반");
        System.out.println(shin.className);
        shin.enter();

        // 클래스 변수: 인스턴스 생성 없이 접근 가능
        // 자바에서는 클래스변수, 클래스메서드에 인스턴스는 접근 불가
        System.out.println(Student.totalStudentNo);
        Student.totalStudentPrint();

        System.out.println("==============================");
        // AIStudent의 인스턴스 변수, 인스턴스 메서드
        AIStudent lee = new AIStudent();
        lee.enter();
        System.out.println(lee.exit());

        // AIStudent의 클래스변수, 클래스메서드를 상속받아서 사용합니다.
        System.out.println(AIStudent.totalStudentNo);
        AIStudent.totalStudentPrint();

    }
}
