import java.util.Arrays;

public class DataType1 {
    // psvm 이라는 키워드로 main 함수를 단축키처럼 부릅니다.
    public static void main(String[] args) {
        // 정수. int(4바이트) - 기본, long(8바이트)
        int a = 1;
        long b = 1L; // long 타입은 int와 구별하기 위해서 대문자로 숫자 뒤에 구분합니다.

        // 실수. 부동소수점  double(8바이트, 기본), float(4바이트)
        double c = 3.14;
        float d = 3.14F; // float은 F로 구분해서 적어줍니다.

        // 문자 - 문자 하나, UTF-16(자바의 기본 인코딩), 2바이트 / 문자열(참조형) String 도 내장되어 있습니다.
        char e = '가'; // char는 작은 따옴표
        // String f = "가나다"; // String은 큰 따옴표

        // boolean - true, false (1바이트)
        boolean g = true; // 소문자로 시작합니다.

        // sout -> 콘솔에 결과를 출력합니다.
        System.out.println(a-b); // int + long
        System.out.println(c*d); // double + float
        System.out.println((a+b+c)/d); //  int + long + double + float
        // System.out.println(a+b+c+d+g); // 파이썬과 달리 boolean은 숫자와 호환 불가
        System.out.println(a+b+c+d+e); // char를 숫자와 더해버리면 '가'의 유니코드번호가 숫자로 바뀌어서 연산되는 human error

        // == : 객체의 값을 비교하는 연산자
        System.out.println(a==b);
        b = 3L;
        System.out.println(a==b);
        a = 3;
        System.out.println(a==b);

        String word = "가나다";
        String word2 = "가나다";
        System.out.println(word==word2);
        word2 = "마바사";
        word = "마바사";
        System.out.println(word==word2);
        // 자바에서도 멀티라인 연산자를 사용해서 여러줄을 한꺼번에 캡처할 수 있습니다.
        word2 = """
                안녕하세요
                여러줄
                캡처해서
                하나의 변수에 넣을거에요.
                """;
        System.out.println(word2);

        // 문자열에서 많이 사용하는 메서드
        // .charAt 특정 위치 리턴, . split("정규식")  특정 값으로 문자열을 끊어씀
        // 특정 값을 변경 replace, 특정 값이 포함되어 있는지
        // 인덱스로 특정 문자를 사용할 수 있는지? 음수 인덱싱이 가능한지?
        System.out.println(word2.charAt(2));
        System.out.println(word2.split(" ")); // [Ljava.lang.String;@b4c966a
        // regex [문자열] 그 중 무엇이든
        System.out.println(Arrays.toString(word2.split("[\n ]")));
        // Ctrl + Space로 필요한 패키지를 import 해와서 사용합니다.
        // Ctrl + D 로 복제
        System.out.println(word2.replace("여러줄", "다섯줄"));
        System.out.println(word2.indexOf("하나")); // 방번호
        System.out.println(word2.charAt(15));
//        System.out.println(word2.charAt(-1)); // 자바에서는 음수인덱싱이 불가능합니다.
        System.out.println(word2.contains("하나")); // 특정 값이 있으면 true
        System.out.println(word2.contains("다섯")); // 없으면 false

        // f'{변수명}이 {변수명} 있다.    .format( ) %d : 정수, %f : 실수, %s : 문자열
        System.out.println(String.format("나는 어제 30분 유튜브를 봤다"));
        System.out.println(String.format("나는 어제 %d분 %s를 봤다. %f", 3, "넷플릭스", 4.));
    }
}
