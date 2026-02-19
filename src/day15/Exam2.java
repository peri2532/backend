package day15;

import java.util.*;

public class Exam2 {
    public static void main(String[] args) {

        // [1] 컬렉션(수집) 프레임(틀) 워크(일)
        // 1.정의 : 자료들을 수집/저장 하는 방법들을 미리 만들어둔 인터페이스/클래스
        // 2.목적 : 복잡한 자료구조를 제공받아 편리한 데이터 관리
        // 자료구조란? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조 , ex] 리스트/해시/큐/스택/트리 등등
        // 3. 종류 : 인터페이스란? 서로 다른 클래스/타입 들을 기능 통합
        /*
                인터페이스       구현체
                List            ArrayList, Vector, LinkedList, Stack 등
                Set             HashSet , TreeSet 등
                Map             HashMap , HashTable, TreeMap 등
         */

        // [2] List 타입
        ArrayList< String > list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        // List 주요 메소드
        // 1) .add( )
        list2.add( "유재석" ); list2.add( "유재석" ); // 중복 허용
        list2.add( 0 , "강호동" ); // 특정 인덱스 추가
        System.out.println("list2 = " + list2); // list2 = [강호동, 유재석, 유재석]
        // 2) .set( )
        list2.set( 0 , "강호동2");
        System.out.println("list2 = " + list2); // list2 = [강호동2, 유재석, 유재석]
        // 3) .get( )
        System.out.println("list2.get( 1 )  = " + list2.get( 1 ) ); // 유재석
        // 4) .size( )
        System.out.println("list2.size()  = " + list2.size() ); // 3
        // 5) .contains( ) , .indexOf( )
        boolean result1 = list2.contains( "강호동2" );
        int result2 = list2.indexOf( "강호동2" );
        // 6) .remove( )
        list2.remove("강호동2");
        System.out.println("list2 = " + list2);
        // 7) .isEmpty( )
        System.out.println("list2.isEmpty() = " + list2.isEmpty() );
        // 8) .clear( )
        // list2.clear();

        // ======================================================================= //
        // List 타입 과 반복문
        // 1) 일반 for문
        for( int index = 0  ; index <= list2.size() - 1 ; index++ ){
            String str = list2.get(index);
            System.out.println( str );
        } // for end
        // 2) 향상된 for문
        for( String str : list2 ){
            System.out.println( str );
        }
        // 3) forEach 문 * 리스트내 요소(값) 들을 하나씩 순서대로 반복변수에 대입하여 반복실행한다.
        // 변수명.forEach( ( 반복변수명 ) -> { 실행문; } );
        list2.forEach( ( str ) -> { System.out.println( str ); });

        // List 구현체들 , 구현체란? 인터페이스의 추상메소드를 구현(오버라이딩)한 클래스/객체
        List< Integer > list ; // 인터페이스 타입

        // 공통 : 여러 요소(값)들을 순서대로(인덱스) 저장하는 <배열> 구조
        list = new ArrayList<>();   // + 싱글스레드 사용 , 비동기화 메소드 ,
        list.add( 0 , 50 ); // 0번 인덱스에 100 대입
        list = new Vector<>();      // + 멀티스레드 사용 , 동기화(synchronized) 메소드

        list = new LinkedList<>();  // + 싱글스레드 사용 , + <링크> 구조
        list.add( 0, 100 ); // 0번 인덱스에 100 대입
        // ArrayList 중간 삽입/삭제 시 다른 데이터들의 이동 발생 함.
        //      중간 삽입/삭제 느리다, 뒤에 추가 빠르다.
        // vs
        // LinkedList 중간 삽입/삭제 시 다른 데이터들의 이동 발생 안함.
        //      중간 삽입/삭제 빠르다, 뒤에 추가 느리다.

        Stack<String> stack = new Stack<>();
        stack.push( "유재석" ); // 값 추가 : push
        stack.push( "강호동" ); // 값 추가 : push
        System.out.println( stack.pop() ); // 값 제거 : pop
        System.out.println( stack.pop() ); // 값 제거 : pop
        // Stack 스택 자료 구조란? 입구와출구가 하나라서 마지막에 들어온값/추가 이 먼저 나간다/제거 . LIFO( LastIn FirstOut )
        // 예] 동전케이스 , 프링글스 과자통, ctrl+z(뒤로가기) 등

    } // main end
} // class end