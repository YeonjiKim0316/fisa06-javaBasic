import java.util.*;

public class DataType3 {
    public static void main(String[] args) {
//        // Map(인터페이스) : key로 value에 접근하는 dict 와 같은 자바의 자료형
//        // Array, List보다 빠름(방마다 접근 x)
//        // key가 중복되지 않음.
//        // 배열보다 메모리는 조금 더 차지(key만큼)
//        // 검색/삽입/삭제가 빈번한 대규모데이터에서 처리 속도가 빠르다.
//        Map<String, String> map1 = new LinkedHashMap<>(); // <KEY의자료형, VALUE의자료형>
//        // 삽입
//        map1.put("abc", "가나다");
//        map1.put("bcd", "나다라");
//        // 조회 {bcd=나다라, abc=가나다}
//        System.out.println(map1);
//        System.out.println(map1.get("abc"));
//        System.out.println(map1.get("cde")); // 없는 키에 null
//        // 삭제
//        System.out.println(map1.remove("abc", "가나")); // false
//        System.out.println(map1);
//        // 수정
//        map1.replace("abc", "가나다", "마바사");
//        System.out.println(map1);
//        map1.replace("가나다", "마바사"); // 없는 key라서 아무것도 바뀌지 않음
//        map1.replace("abc", "마바사아");
//        System.out.println(map1);
//
//        System.out.println(map1.keySet());// 키만
//        System.out.println(map1.values());// value만
//        System.out.println(map1.entrySet());// key-value 쌍으로
//        System.out.println(map1.get("abc"));// key로 value를 찾기
//        System.out.println(map1.containsKey("abc"));// true, key로 value를 찾기
//        System.out.println(map1.containsValue("가나다"));// false, value로 key를 찾기
//        System.out.println(map1.containsValue("마바사아")); // true, value로 key를 찾기
//
//        System.out.println(map1.size()); // 집합자료형 안에 들어있는 원소의 개수를 출력



        // Set - 중복을 허용하지 않는 자료형
        Set<String> set1 = new HashSet<>();
        // 삽입 - add

        set1.add("가나다");
        set1.add("마바사");
        set1.add("마바사"); // 중복 불가

        // 조회
        System.out.println(set1);
        System.out.println(set1.contains("가나다")); // true, false 해당하는 값을 찾아서 사용
        System.out.println(set1.size()); // 원소의 개수를 출력

        // enum : 고정해놓은 값들만을 사용하도록 지정하는 특별한 자료형
        System.out.println(Language.JAVA);
        System.out.println(Language.PYTHON);

        Map<Language, String> map2 = new HashMap<>();
        map2.put(Language.JAVA, "open jdk 21");
        System.out.println(map2); // 문자열처럼 보이지만 실제로는 enum 클래스의 인스턴스(상수 객체)

        // 자바의 콜렉션 객체들은 '객체'를 담을 수 있도록 구현되어 있습니다.
        // 기본자료형은 값 자체를 저장하는 방식이기 때문에
        // int -> Integer, float -> Float 처럼 대문자로 앞 글자를 치환한 wrapper class로 감싸서
        // 콜렉션에 집어 넣습니다.
        // map3 key: int, value: String으로 받아보겠습니다. 1=하나
        // 타입 인수는 기본 타입일 수 없습니다

        // 1. 원시 자료형을 객체화해서 사용하는 구현체에 넣을 경우
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "하나");
        System.out.println(map3);

        // 2. 각 자료형에 유용한 메서드들을 활용할 때
        int a = 3;
        a = Integer.MAX_VALUE;
        System.out.println(a);

        // 3. db 등 호환되는 저장소와 연동할 때 null을 표현하기 위해서도 사용합니다.
        int score = 0; // 0과 값없음은 다른데... score에 db 에서 값을 가져올 때 자리가 비어있다면?
        System.out.println(score);
        Integer score1 = null; // null 을 표현 가능
        System.out.println(score1);
        score1 = 222;
        System.out.println(score1);




    }

}

enum Language {
    JAVA, PYTHON, HTML, CSS // 상수처럼 '변하지 않는 고정된 값' 중 하나를 선택하기 때문에 대문자로 작성
}