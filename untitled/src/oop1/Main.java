package oop1;

public class Main {
    // 자바의 입구함수 (컴파일러가 최초로 실행하는 함수)
    public static void main(String[] args) {
        Student kim = new Student("김연지"); // 이름만 받고
        System.out.println(kim.name);
        System.out.println(kim.className);
        kim.enter();
        String result = kim.exit();
        System.out.println(result);

        // 이름, 반이름을 함께 받는
        Student shin = new Student("신짱구", "AI반");
        System.out.println(shin.className);
    }
}
