import java.util.NoSuchElementException;
import java.util.Scanner;

public class FlowControl2 {
    public static void main(String[] args) {
        // 값 비교를 위해 두개의 방법을 사용합니다.
        // ==(기본 자료형에서 값이 일치하는지 비교)
        // equals(집합 자료형에서 값이 일치하는지를 비교)
        int a = 1;
        int b = 1;
        long c = 1L;
        System.out.println(a == b);
        System.out.println(a == c); // 기본자료형은 메모리주소가 의미가 없음

        String d = "신짱구"; // String Pool 이라는 객체를 공유하는 메모리에 들어온 String을 일괄적으로 관리
        String e = "신짱구";
        String f = new String("신짱구");
        System.out.println(d == e);
        System.out.println(d.equals(e));
        System.out.println("--------------------");
        System.out.println(d == f); // 같은 메모리 주소에서 나오는지 비교
        System.out.println(d.equals(f)); // 값과 자료형이 일치하는지 비교

        System.out.println("==================================================");
        // 사용자로부터 숫자를 입력받고
        // q, Q를 받으면 프로그램을 종료하고
        // 숫자로 값이 들어오면 짝수 / 홀수를 판별하는 중첩 조건문을 만들어보세요.

        // python의 input() 과 같은 명령어
//        System.out.println("숫자를 입력하세요. Q 또는 q는 종료: ");
//        Scanner sc = new Scanner(System.in);
//
//        // 1. 사용자로부터 값을 입력받는다
//        String num = sc.next();
//        // 2. q, Q로 값이 들어오면 "종료합니다" 를 출력한다
//        if (num.equals("q")) { // 문자열 또는 객체의 값과 자료형이 일치하는지 비교는 equals 메소드
//                          //  == 은 같은 메모리 주소를 공유하는지 확인하는 연산자
//            System.out.println("종료합니다");
//        } else if (num.equals("Q")) {
//            System.out.println("종료합니다");
//        } else {
//            // 3. Integer로 형변환하고
//            int num2 = Integer.valueOf(num); // String은 메모리 주소와 각 메모리 주소 안의 기본 자료형을 담고 있는 객체, int 기본자료형
//            // 3-1. 짝수 / 홀수 여부를 판단한다
//            if (num2 % 2 == 0) {
//                System.out.println("짝수");        // 최종 결과를 출력한다.
//            } else {
//                System.out.println("홀수");        // 최종 결과를 출력한다.
//            }

            System.out.println("======================");

            // python의 input() 과 같은 명령어
            // 1. 사용자로부터 값을 입력받는다
            // 2. q, Q로 값이 들어오면 "종료합니다" 를 출력한다
            // !(not),  &&(and), ||(or)
        System.out.println("숫자를 입력하세요. Q 또는 q는 종료: ");
        Scanner sc = new Scanner(System.in);

        // 자바의 예외처리는 try~catch~finally 로 작성합니다.
        // 예외. NumberFormatException, NoSuchElementException, Exception

        try {
            // 1. 사용자로부터 값을 입력받는다
            String num = sc.next();
            // 2. q, Q로 값이 들어오면 "종료합니다" 를 출력한다
            if (num.equals("q") || num.equals("Q")) { // 문자열 또는 객체의 값과 자료형이 일치하는지 비교는 equals 메소드
                System.out.println("종료합니다");
            } else {
                // 3. Integer로 형변환하고
                int num2 = Integer.valueOf(num); // String은 메모리 주소와 각 메모리 주소 안의 기본 자료형을 담고 있는 객체, int 기본자료형
                // 3-1. 짝수 / 홀수 여부를 판단한다
                if (num2 % 2 == 0) {
                    System.out.println("짝수");        // 최종 결과를 출력한다.
                } else {
                    System.out.println("홀수");        // 최종 결과를 출력한다.
                }

            }
        } catch (NumberFormatException error) {
            System.out.println("자료형이 일치하지 않습니다");
            System.out.println(error.toString());
        } catch (NoSuchElementException error) {
            System.out.println("입력이 중단되었습니다");
        } catch (Exception error) {
            System.out.println("예외가 발생했습니다");
        } finally {
            System.out.println("성공했든 실패했든 실행합니다.");
        }
    }
}
