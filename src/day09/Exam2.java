package day09;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 자바의 모든 클래스는 object 클래스로부터 자동 상속받는다.
        System.out.println("==== [1] ===");
        A a = new A(); // 총 객체 : 2개 , A <- Object(슈퍼클래스)
        // [2] 상속관계에서는 객체생성시 부모객체 먼저 생성한다.
        System.out.println("=== [2] ===");
        B b = new B(); // 총 객체 : 3개 , B <- A <- Object(슈퍼클래스)
        // [3] 타입변환시 업/다운 캐스팅 만 가능하다.
        System.out.println("=== [3] ===");
        C c = new C(); // 총 객체 : 3개 , C <- A <- Object(슈퍼클래스)
        // [4] 자식 객체가 생성되면 부모객체도 같이 생성된다.
        System.out.println("=== [4] ===");
        D d = new D(); // 총 객체 : 4개 , D <- B <- A <- Object(슈퍼클래스)
        E e = new E(); // 총 객체 : 4개 . E <- C <- A <- Object(슈퍼클래스)
        // 즉] 자바는 상속(물려주는)관계를 메모리(저장소)로 표현한다.

        // [5] 자동타입변환
        A a2 = b;
        Object o2 = a2; // b -> a -> Object
        // B b2 = c; // c객체가 생성될때는 b는 생성되지 않는다.

        // [6] 강제타입변환
        B b2 = (B)a2; // a2의 태생은 b객체 이므로 가능하다.
        //C c2 = (C)a2; // 오류발생 , ar의 태생은 b객체 이므로 b가 태어날때 c는 생성되지 않았다.

        // [7] 타입 확인 , 객체 instanceof 클래스명/타입명
        System.out.println( a instanceof Object ); // true
        // a 객체가 생성될때 Object가 생성되었는지 확인
        // System.out.println( b instanceof C ); // false
        // b 객체가 생성될때 C 가 생성되었는지 확인
        System.out.println( e instanceof  A ); // true
        System.out.println( b instanceof  D ); // false
        // b 객체가 생성될때 D 가 생성되었는지 확인

        // 즉] 해당 객체가 생성될때 부모객체는 생성 되지만 자식객체는 생성 안된다.
        // *다운캐스팅이 안되는 전제조건*






    } // main end
} // class end

class A {
    A(){ System.out.println("A객체 생성"); }
} // CLASS END

class B extends A{
    B(){System.out.println("B객체 생성"); }
} // CLASS END
class C extends A{
    C(){ System.out.println("C객체 생성"); }
} // CLASS END

class D extends B{
    D(){ System.out.println("D객체 생성"); }
}
class E extends C{
    E(){ System.out.println("E객체 생성"); }
}