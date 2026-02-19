package day15;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {

        // [ 제네릭 타입 ]
        // 1. 정의 : 여러 가지 타입에서 동작할 수 있도록 만든 타입
        // 2. 목적 : 클래스 정의할때 변수*타입* 정하지 않고 인스턴스(객체) 생성할 때 타입 정한다.
        // 3. 사용법
        // 1. 제네릭타입명은 영문 대문자로 한다.
        // 2. 여러개 가능 하다.
        // 3. 제네릭타입에 대입되는 타입은 기본타입( int -> Integer )  안된다. <래퍼클래스사용>
        /*
            class 클래스명< 제네릭타입1 , 제네릭타입2 >{
                제네릭타입1 멤버변수명;
                void 함수명( 제네릭타입2 매개변수명 ){ }
            }
            클래스명< 타입1 , 타입2 > 변수명 ;
        */

        // (1) 제네릭 타입 없는 상황
        Box1 box1 = new Box1(); // 인스턴스란? 미리 설계된(클래스) 타입 으로 메모리 생성
        box1.content = "안녕하세요";  // 멤버변수에 대입
        String content1 = box1.content; // 멤버변수 값 호출
        Box2 box2 = new Box2();
        box2.content = 100;     int content2 = box2.content;

        // (2) 제네릭 사용되는 상황
        Box3< String > box3 = new Box3<>();
        box3.content = "안녕하세요";     String content3 = box3.content;
        Box3< Integer > box33 = new Box3<>();
        box33.content = 100;            int content33 = box33.content;

        // ArrayList 컬렉션프레임워크 사용됨.
        ArrayList< String > list1 = new ArrayList<>(); // ArrayList 안에서 제네릭타입을 String 타입으로 사용 뜻
        // ArrayList< Dto > list2 = new ArrayList<>(); // ArrayList 안에서 제네릭타입을 Dto 타입으로 사용 뜻

        // (3) 제네릭타입 여러개
        Box4< String , Integer > box4 = new Box4<>();
        box4.value1 = "안녕하세요"; box4.value2 = 100;

        // (4) 제네릭타입 중첩 가능
        Box4< String , ArrayList<String> > box44 = new Box4<>();
        box44.value1 = "안녕하세요";  box44.value2 = new ArrayList<>();

        // (5) 활용처2: 배열 -> 리스트
        내가만든리스트< String > list2 = new 내가만든리스트<>();
    }
} // class end
class Box4< T , E >{ T value1 ;  E value2; }
class Box3< 제네릭타입 >{ 제네릭타입 content; }
class Box2{ int content; }
class Box1{ String content; } // 클래스란? 인스턴스(객체)의 설계도

class 내가만든리스트< E > {
    E content;
    내가만든리스트(){ content = (E)new Object[10]; }
}