package day06;

public class Student {

    // 1) 속성 = 멤버변수 = 객체들 간의 공유 안한다 -> 동적메모리
    String name;
    String lunchBox;

    // 2) 기능 = 메소드 = 객체들 간의 공통/공유 이벤트 -> 정적메모리
    void 밥먹기(){ // this 생략가능 , 해당 메소드 호출한 대상/객체
        System.out.println( this.lunchBox+" 먹는다." );
        System.out.println( lunchBox +" 먹는다.");
    }
}