package day09;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 상속 : A클래스 로 부터 B클래스 에게 (멤버변수/메소드)물려주는 행위
        // [2] 목적 : 빠른클래스설계, 한번 만들어둔 클래스 재사용/활용 한다.
        // [3] 키워드 : extends( 확장, 뻗다 뜻 )
        // [4] 장점 : 유지보수 , 계층관계표현 , 재사용 , **다형성**
        동물 animal1 = new 동물(); // 동물객체
        animal1.name = "강아지1";
        animal1.show();
        조류 bird1 = new 조류(); // 조류객체
        bird1.name = "비둘기1"; // 조류클래스 에는 없지만 물려받은 멤버변수
        bird1.show(); // 물려받은 메소드
        참새 sparrow1 = new 참새(); // 참새객체
        sparrow1.name = "참새1";
        sparrow1.show(); // 동물 -> 조류 -> 참새 물려받은 메소드
        닭 chicken1 = new 닭(); // 닭객체
        chicken1.name = "닭1";
        chicken1.show(); // 동물 -> 조류 -> 닭 물려받은 메소드
        // [5] 주의할점 :
        // 1.상속은 무조건 하나의 클래스로부터 상속받는다.
        // 2.하위클래스가 상위클래스를 *선택 구조*

        // [6] 다형성 : 다(양한) 형(태/모양) 성(질)
        // * 본질/데이터 * 은 그대로 이다, int a = 3 , long b = a;
        // (1) 참새가 조류 로 타입 변환6
        조류 bird2 = sparrow1; // 자동타입변환 , 업캐스팅 , 묵시적타입변환
        // (2) 조류(참새) 가 동물 로 타입 변환
        동물 animal2 = bird2;
        animal2.show(); // 참새1 : 객체 *본질*은 그대로 유지
        // (3) 동물(참새) 가 참새 로 타입 변환
        참새 sparrow3 = (참새)animal2; // 강제타입변환 , 다운캐스팅 , 명시적타입변환( 부모타입은 자식을 모른다 )
        sparrow3.show(); // 참새1
        System.out.println( sparrow1 ); // day09.참새@3b07d329
        System.out.println( sparrow3 ); // day09.참새@3b07d329
        // (4) 동물 이 닭 로 타입변환
        닭 chicken2 = (닭)animal1; // 태생이 동물 이므로 조류 또는 닭/참새 타입 변환 불가능
        chicken2.show(); // 오류 발생 : ClassCastException
        // 참새 로 생성한 객체는 : 참새 -> 조류 -> 동물 , 동물 -> 조류 -> 참새
        // 조류 로 생성한 객체는 : 조류 -> 동물 , 동물 -> 조류
        //닭 chicken3 = sparrow1; // 오류발생 // 형제 관계도 타입변환 불가능

        // [7] 상속활용처 : 1. 웹/앱 라이브러리  2.클래스 설계( 개발 경험 필요 )

    } // main end
} // class end

class 동물{
    String name;
    void show(){
        System.out.println("동물.show"); // soutm
        System.out.println( name );
    }
} // class end
class 조류 extends 동물{ } // class end
// 조류 클래스는 동물 클래스로부터 상속받는다.
class 참새 extends 조류{ }
// 참새 클래스는 조류 클래스로부터 상속받는다.
class 닭 extends 조류{ }
// 닭 클래스는 조류 클래스로부터 상속받는다.
/*         가계도/상속 구조
                 동물
        조류              포유류
    참새      닭       고래      박쥐

*/