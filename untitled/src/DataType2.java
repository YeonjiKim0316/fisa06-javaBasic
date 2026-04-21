import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataType2 {
    public static void main(String[] args) {
        // [ ] : Array - 크기가 정해져있는 고정된 자료형
        // 방개수가 고정, 각 방에 똑같은 자료형만 넣을 수 있습니다.
        int a = 1;

        // 1. 선언과 대입 동시에
        int[] arr = {1, 2, (int) 3.67};
                                        // 형변환시 '소수점 이하 버림'
        arr[2] = 4;
//        arr[-1] = 5; // 자바에서 음수인덱싱은 불가능
        System.out.println(Arrays.toString(arr));

        // 2. 선언 먼저 하고 값은 나중에 대입하는 방법
        int b;
        b = 3;

        int[] arr2 = new int[3]; // new 키워드로 각 방을 0을 채워넣어서 먼저 초기화해줍니다.
        arr2[0] = 3;
        System.out.println(Arrays.toString(arr2)); // [I@24123412b]

        // double은 0.0, boolean은 false, char '', String은 null으로 초기화
        String[] arr3 = new String[3]; // new 키워드로 각 방을 0을 채워넣어서 먼저 초기화해줍니다.
        System.out.println(Arrays.toString(arr3));

        arr3[0] = "가위";
        arr3[1] = "나비";
        arr3[2] = "다람쥐";
        System.out.println(Arrays.toString(arr3));
        // 1. 선언과 동시에 대입
        String[] arr4 = {"가위", "나비", "다람쥐"};
        // 가위, 나비, 다람쥐
        System.out.println(Arrays.toString(arr4));

        // ArrayList : Array를 가변적으로 사용하는 참조자료형
        // 1. 방의 길이
        ArrayList list1 = new ArrayList();
        list1.add("가");
        list1.add(3.14);
        list1.add(true);
        list1.add(2);
        System.out.println(list1); // Arrays.toString 없이 사용(출력) 가능

        // 2. Generic: 방마다 들어가는 자료형을 고정해서 사용하기 위해 <자료형>으로 이 집합자료형 안의 자료형을 고정
        // ArrayList<String> list2 = new ArrayList<String>(); // full code
        // ArrayList<String> list2 = new ArrayList(); // 컴파일러가 <>를 추가해줘서 동작은 함

        // 부모 클래스(인터페이스)에 공통 함수, 속성들을 만들어놓고 (설계도)
        // 자식 클래스에 실제 동작을 적어놓습니다 (구현체)
        // List(설계도)  = ArrayList(어떤 알고리즘으로 실제로 구현했는지 구현체)
        List<String> list2 = new ArrayList<>(); // 조회에 더 빠름
        list2.add("가");
        list2.add("나");

        List<String> list3 = new LinkedList<>(); // 삽입, 삭제에 조금 더 빠름
        list3.add("가");
        list3.add("나"); // 방 추가

        // 방 삭제 값, 인덱스
        list3.remove("가");
        list3.remove(0);
        System.out.println(list3);

        // 조회 List는 인덱스 번호를 get 명령어로 경유해서 접근합니다.
        System.out.println(list2.get(0));

        // 수정 : set(방번호, 변경할 값)
        list2.set(0, "가나다");
        System.out.println(list2);
    }
}
