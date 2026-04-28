package computerInterface;

import oop2.MyDefault;

public class OutMyMyPublic extends MyDefault {

    void dprint() {
        super.print(); // default 로 선언된 변수, 메서드는 외부 패키지에서 상속한 자식클래스에서는 사용 불가
        System.out.println("mymyPublic");
    }
}
