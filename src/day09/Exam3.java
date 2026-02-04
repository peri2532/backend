package day09;

public class Exam3 {
    public static void main(String[] args) {

        // (1) 상위 객체
        상위클래스 obj1 = new 상위클래스();
        obj1.show();
        // obj1.show2(); // 자식의 멤버변수/메소드 사용불가

        // (2) 하위 객체
        하위클래스 obj2 = new 하위클래스();
        obj2.show(); // 부모 메소드 대신에 오버라이딩 된 메소드 실행
        obj2.show2();

        // (3) 타입변환 // 자식 -> 부모 타입변환
        상위클래스 obj3 = obj2;
        obj3.show(); // 부모 와 자식 간 메소드가 동일하면 오버라이딩 우선

        // (4) 부모 와 자식 간의 멤버변수간의 공유 가능.
        System.out.println( obj2.value1 );
        System.out.println( obj2.value3 );




    } // main end
} // class end

class 상위클래스{
    int value1 = 10; int value2 = 20;
    상위클래스(){ System.out.println("상위클래스생성"); }
    void show(){ System.out.println("상위클래스메소드실행");}
}
class 하위클래스 extends 상위클래스{
    int value3 = 30; int value4 = 40;
    하위클래스(){
        System.out.println("하위클래스생성");
    }
    @Override // 생략가능, 물려받은 메소드 재정의 한다.
    void show(){ /* 상위클래스 메소드 선언부가 일치하면 오버라이딩*/
        // -- 오버라이딩 하면 최우선으로 메소드가 실행된다.
        System.out.println("하위클래스메소드실행(재정의)");
    }
    // 오버라이딩 vs 오버로딩
    void show( int a ){ }
    void show2(){
        System.out.println("하위클래스메소드실행2");
        System.out.println( this.value3 ); // this : 현재 객체 뜻
        System.out.println( super.value1 ); // super : 상위 객체 뜻
        // 부모와 자식 간의 멤버변수명이 동일할때 this, super 사용한 구분 한다.
    }
}