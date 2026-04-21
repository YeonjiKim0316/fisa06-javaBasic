public class FlowControl3 {
    public static void main(String[] args) {
        // 반복문 : 집합자료형이랑 사용됩니다.
        // 1. for (반복의 횟수를 정한 경우)
        // for (초기값; 조건식; 증감문)  { 실행문  }
        // 변수의 유효 범위 : scope  -  { } 로 구분되고
//        int i = 0;
            // 1. 스코프 안에서 바깥 변수에는 접근 가능
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("=====================");
        // 짝수만 1~10 사이의 값에서 출력
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        // 2. 스코프 바깥에서 안으로는 접근 불가
//        System.out.println(i);


        // 2. while (반복의 횟수가 정해지지 않은 경우)
        // while (판별식) { 참인 경우 계속 실행할 실행문 }
        /*
        바깥에 판별식을 위한 초기값;
        while (판별식) {
            실행문;
            판별식을 바꿀 조건식;
        }
         */
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        String[] cheese = { "cheddar", "gouda", "edam", "provolone", "parmesan" };
        // + "먹고 싶다" 를 출력해보세요.
//        for (int i = 0; )
    }
}
