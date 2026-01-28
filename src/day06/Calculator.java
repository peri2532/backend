package day06;

public class Calculator {
    // 1] 속성 = 멤버변수

    // 2] 기능 = 메소드 = 멤버함수
    // 1) 매개변수 X , 반환값 O
    double getPi( ){
        // double 반환타입 : return 값에 타입
        // getPi 메소드명 : 아무거나(카멜권장)
        // ( ) : 매개변수 없는 상태
        // { } : 함수 실행시 처리할 명령어/코드
        return 3.14159; // double타입
        // return : 함수 반환값
    }
    // 2) 매개변수X , 반환값 X = void
    void powerOn( ){
        System.out.println("전원을 켭니다.");
        return; // 생략 가능.
    }
    // 3) 매개변수O , 반환값 X = void
    void printSum( int x , int y ){
        System.out.println( x + y );
    }
    // 4) 매개변수O , 반환값 O
    int add( int x , int y ){
        System.out.println("더하기 합니다.");
        return x + y; // int + int => int
    }
    // *) 동일한 클래스내 메소드 호출
    void print( ){
        printSum( 10 , 2 );
    }

} // class end