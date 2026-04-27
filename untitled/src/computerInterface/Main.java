package computerInterface;


/*
접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
public	        ○	                ○	                ○           	○
protected	    ○	                ○	                ○	            X
default	        ○	                ○	                X           	X
private	        ○	                X	                X           	X
*/
public class Main {
    public static void main(String[] args) {
        // DeskTop을 Computer 인터페이스를 구현해서 작성해보세요.
        // 접근제어자를 바꿔가면서 computer.Main.main 에서는 동작 안 하고
        // computerInterface.Main.main에서는 동작하는 메서드,
        // 확인 가능한 변수들을 직접 확인해보십시오.
    }
}
