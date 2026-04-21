public class FlowControl {

    // psvm
    public static void main(String[] args) {
        // 1. if ~ else if ~ else
        int num = -1;

//        // 양수, 0, 음수 3가지 경우에 따라 다른 출력
//        if (num > 0) {
//            System.out.println("양수");
//        } else if (num == 0) {
//            System.out.println("영");
//        } else {
//            System.out.println("음수");
//        }

        // 2. switch ~ case: 단일 조건에 대한 판별
        switch (num % 2) { // 판별조건
            case 0 -> System.out.println("짝수"); // break 생략 가능
            default -> System.out.println("홀수");
        }

        System.out.println("---------------------------------");
        num = 2;
        // switch ~ case 문의 다른 문법
        switch (num % 2) {
            case 0: // if
                System.out.println("짝수");
                break; // 조건을 만족하는 case 실행 후에 코드블럭 바깥으로 빠져나감
            case 1: // else if
                System.out.println("홀수");
                break;
            default: // else 대신하는 경우
                System.out.println("디폴트문입니다"); // 마지막에 작성되어있으므로 break 생략해도 가능
        }
        System.out.println("---------------------------------");

        // a > b : 1 / a == b : 0, a < b : -1
        System.out.println(Integer.compare(3, 3));
        // 양수, 영, 음수

        num = -13;
        switch (Integer.compare(num, 0)) { // 판별조건
            case 1 -> System.out.println("양수");
            case 0 -> {  // 실행문이 여러개라면  { }안에 여러개 명령어를 작성
                System.out.println("영");
                System.out.println("0입니다");
            }
            case -1 -> System.out.println("음수");
        }

        System.out.println("---------------------------------");
        switch (Integer.compare(num, 0)) { // 판별조건
            case 1:
                System.out.println("양수");
                break;
            case 0:   // 실행문이 여러개라면  { }안에 여러개 명령어를 작성
                System.out.println("영");
                System.out.println("0입니다");
                break;
            default:
                System.out.println("음수");
        }


        // 3. 삼항연산자  (판별식) ? 참일때 실행문 : 거짓일 때 실행문
        num = 0;
        System.out.println((num % 2 == 0) ? "짝수" : "홀수");
                                                    // 판별식 ? "참" : "거짓"
        // 0, 양수, 음수를 판별하는 판별식을 만들어보세요.
        // 단순한 판별을 위해서만 if ~ else 사용하는 것이 권장됩니다.
        System.out.println((num == 0) ? "영" : (num > 0) ? "양수" : "음수");

    }
}
