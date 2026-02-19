package day12;

import 종합.예제7.modle.dto.BoardDto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam1 { // class start
    public static void main(String[] args) { // main start
        /*
            *기본*타입 : byte short int long flot double boolean char ,
                - 8개 이면서 리터럴(상수-키보드로 입력받는) 값 들을 분류하는 타입
                - 소문자 시작한다.
            *참조*타입 : String , Scanner , MemberDto , [ ] 등등 기본타입 외 모두
                - 기본타입 외 모두 참조타입이다. 배열 , 클래스 , 인터페이스
                - 대문자 시작한다.
                - 기본 타입 외 개발자가 새로운 타입 만드는 행위 , 예] int/double 2개 갖는 타입
        */

        // 자바 회사에서 제공 하는 기본 클래스 들
        // [1] Object : 자바에서 최상위 클래스 이면서 모든 클래스는 Object 로 부터 상속받는다.
        Object o1 = 3;          // 3(자식) , Object(부모)
        Object o2 = 3.14;           Object o3 = true;
        Object o4 = "유재석";        Object o5 = new Object();
        Object o6 = new int[3];     Object o7 = new BoardDto(); // -- 종합예제7 만든 dto
        // 즉] 모든 자료들은 Object 로 타입변환(다형성) 가능하다.
        // 1-1 ) .toString() : 인스턴스/자료 주소값(메모리위치) 반환 함수
        System.out.println( o6.toString() ); // [I@214c265e , 이와 같이 할당된 주소값 출력( 개발자가 제어 불가 )
        System.out.println( o7.toString() ); // BoardDto{ } , 이와 같이 toString 오버라이딩 한 객체는 문자열 출력
        // 1-2 ) .equals( ) : 주소가 참조하는 객체 값 비교  vs  == 주소(위치)또는 리터럴 비교
        Object o8 = new BoardDto();
        Object o9 = new BoardDto();
        System.out.println( o8 == o9 ); // false
        System.out.println( o8.equals( o9 ) ); // false

        Object o10 = o9;    // 객체 참조 복사/복제
        System.out.println( o10 == o9 ); // true

        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println( str1 == str2 ); // false : 서로 다른 객체가 같은 문자열을 갖는다.
        System.out.println( str1.equals( str2 )); // true : 서로 다른 객체내 문자열 비교

        // 1-3 ) .hashCode() : 객체를 식별하는 값을 정수로 반환
        System.out.println( str1.hashCode() ); // 50621969
        System.out.println( str2.hashCode() ); // 50621969
        System.out.println( o10.hashCode() );   // 2093176254
        System.out.println( o9.hashCode() );    // 2093176254
        System.out.println( o8.hashCode() );    // 1854731462


        // [2] Class : 클래스 정보(멤버변수/메소드 등등) 담는 클래스
        String obj1 = new String();     Class c1 = obj1.getClass();
        System.out.println( c1 ); // class java.lang.String

        Integer obj2 = 3;               Class c2 = obj2.getClass();
        System.out.println( c2 ); // class java.lang.Integer

        // 2-1) Class.forName("패키지명.클래스명"); , 일반예외
        // *** 리플렉션 *** : 최초실행(컴파일) 할때 객체 생성하지 않고 실행 도중에 객체 생성 = 동적 처리
        // 사용처 : JDBC( db연동 ) , 스프링프레임워크( 자바플랫폼 ) = 외부 라이브러리 동적 객체 생성
        try { Class.forName("java.lang.String"); } // String 클래스가 존재하면 객체가 동적으로 생성된다.
        catch ( ClassNotFoundException e ){ }

        // 2-2)
        Field[ ] fields = c1.getFields(); // 클래스내 모든 멤버변수/속성/필드 명 확인 (*private제외)
        for( int i = 0 ; i < fields.length ; i++ ){
            System.out.println( fields[i] );
        }

        Constructor[ ] constructors = c1.getConstructors(); // 클래스내 모든 생성자 확인( 매개변수 확인 )
        for( int i = 0 ; i < constructors.length ; i++ ){
            System.out.println( constructors[i] ); // 15개 , 오버로딩 이용한 다수의 생성자
        }

        Method[ ] methods = c1.getMethods(); // 클래스내 모든 메소드 확인
        for( int i = 0 ; i < methods.length ; i++ ){
            System.out.println( methods[i] );
        }

        // [3] 래퍼 클래스 : 기본타입 --> 참조타입 표현 , 기본타입은 메소드(기능) 없다.
        int value1 = 100; // 자료:100 , 분류/타입:int
        Integer value2 = 100; // 자료:100 , 분류/타입:Integer
        // System.out.println( value1.toString() );
        System.out.println( value2.toString() ); // Integer 참조타입으로 기능(메소드) 이 있다.
        // 3-1 언박싱 과 오토박싱
        int value3 = value2; // Integer -> int 언박싱 , 참조타입 -> 기본타입
        Integer value4 = value1; // int -> Integer 오토박싱 , 기본타입 -> 참조타입

        // 자바 에서 외부자료들과 자료들을 주고받을때 타입변환( 엑셀/CSV/공공데이터API/JS통신/PYTHON통신 )
        int val1 = Integer.parseInt( "100" ); // "100" -> 100
        double val2 = Double.parseDouble( "3.14"); // "3.14" -> 3.14
        float val3 = Float.parseFloat( "3.14"); // "3.14" -> 3.14
        boolean val4 = Boolean.parseBoolean( "true"); // "true" -> true
        // 기본타입 --> 문자열 변환
        String s1 = 100+""; // 기본타입자료+""        // 100 -> "100"
        String s2 = String.valueOf( 100 );          // 100 -> "100"

    } // main end
} // class end