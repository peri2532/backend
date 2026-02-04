package day10;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 인터페이스 정의 : 서로 다른 시스템이나 장치 사이에서 정보를 주고 받는 접점/경계
        // [2] 생활속 예시 : 1] 리모콘 2] 키오스크 3] 키보드 4] 휴대폰
        // [3] 목적 : **동일한 목적으로 서로 다르게 작동** , 함수/메소드 = 상호작용 = 매개변수/리턴
        // -> 상호작용 약속
        // [4] 특징 : 1] 객체의 호환성을 높이고 다형성 구현 , 2] 서로 다른 클래스들 사이에 중간 매개 역할
        // 자바 회사에서 먼저 상속(오버라이딩) 개발 했더니 다형성 중요성 커져서 오버라이딩 전용 타입
        // [5] 사용법
        // 1) interface 인터페이스명{ }
        // *) 인터페이스는 자체적으로 객체 생성이 불가능하다. == 생성자 없어서
        // 2) class 클래스명 implements 인터페이스명{ }
        // *) 인터페이스를 구현 해준 클래스의 객체 = 구현(객)체
        // [6] 추상메소드 :
        // public abstract 반환타입 메소드명( 타입 매개변수 );
        // 메소드 선언부만 존재하며 { } 구현부가 없다.
        // implements 하는 클래스내에서 추상메소드 오버라이딩/재정의
        TestInterface testInterface = new Tool();
        testInterface.method1();

        // - 상수 호출 가능
        System.out.println( TestInterface.b );

        testInterface.method2( 10 );


    }   // implements vs extends

} // class end