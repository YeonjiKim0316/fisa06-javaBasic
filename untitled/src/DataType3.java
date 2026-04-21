import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataType3 {
    public static void main(String[] args) {
        // Map(인터페이스) : key로 value에 접근하는 dict 와 같은 자바의 자료형
        // Array, List보다 빠름(방마다 접근 x)
        // key가 중복되지 않음.
        // 배열보다 메모리는 조금 더 차지(key만큼)
        // 검색/삽입/삭제가 빈번한 대규모데이터에서 처리 속도가 빠르다.
        Map<String, String> map1 = new LinkedHashMap<>(); // <KEY의자료형, VALUE의자료형>
        // 삽입
        map1.put("abc", "가나다");
        map1.put("bcd", "나다라");
        // 조회 {bcd=나다라, abc=가나다}
        System.out.println(map1);
        System.out.println(map1.get("abc"));
        System.out.println(map1.get("cde")); // 없는 키에 null
        // 삭제
        System.out.println(map1.remove("abc", "가나")); // false
        System.out.println(map1);
        // 수정
        map1.replace("abc", "가나다", "마바사");
        System.out.println(map1);
        map1.replace("가나다", "마바사"); // 없는 key라서 아무것도 바뀌지 않음
        map1.replace("abc", "마바사아");
        System.out.println(map1);

        System.out.println(map1.keySet());// 키만
        System.out.println(map1.values());// value만
        System.out.println(map1.entrySet());// key-value 쌍으로
        System.out.println(map1.get("abc"));// key로 value를 찾기
        System.out.println(map1.containsKey("abc"));// true, key로 value를 찾기
        System.out.println(map1.containsValue("가나다"));// false, value로 key를 찾기
        System.out.println(map1.containsValue("마바사아")); // true, value로 key를 찾기

        System.out.println(map1.size()); // 집합자료형 안에 들어있는 원소의 개수를 출력
    }
}