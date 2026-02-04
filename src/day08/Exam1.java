package day08;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam1 {
    public static void main(String[] args) {

        // [1] ArrayList 클래스 : 컬렉션(수집)프레임(틀)워크(일) , 수집관련 클래스/기능 제공
        // [2] 정의 : 컬렉션프레임워크 중 리스트(배열) 자료형 클래스/타입
        // [3] 목적 : 가변(변하는요소들의수) 길이 의 배열 제공 과 기능/메소드 제공 < 편하다 >
        // [4] 사용법
        // 1. 선언/정의 하기 : ArrayList< 항목타입 > 변수명 = new ArrayList()<>;
        // ->  < > 괄호는 제네릭타입으로 리스트 안에 저장 할 *항목들의 타입*
        // -> 제네릭타입은 기본타입 불가능하므로 int -> Integer 클래스명 변경해서 작성 (8개 타입)
        ArrayList< String > 리스트변수명 = new ArrayList<>(); // 여러개 String객체를 저장하는 리스트
        // 2. 요소 추가 : .add( 새로운값 ); 마지막 요소에 자료 추가
        리스트변수명.add( "유재석" );
        // 3. 요소들 전체 출력 : 리스트변수명
        System.out.println( 리스트변수명 ); // [유재석]
        리스트변수명.add( "강호동");     리스트변수명.add( "신동엽");
        System.out.println( 리스트변수명 ); // [유재석, 강호동, 신동엽]
        // 4. 요소 중간 삽입 : .add( 인덱스 , 새로운값 ) : 특정한 인덱스에 자료 추가
        // 인덱스란? 배열/리스트에 요소/값 들이 저장된 순서 번호 , 0번 시작
        리스트변수명.add( 1 , "서장훈");
        System.out.println("리스트변수명 = " + 리스트변수명); // soutv , [유재석, 서장훈, 강호동, 신동엽 ]
        // 5. 요소 수정 : .set( 인덱스 , 새로운값 ) : 특정한 인덱스의 자료 수정
        리스트변수명.set( 1 , "박명수" );        System.out.println("리스트변수명 = " + 리스트변수명);
        // 6. 요소 총개수 : .size() : 리스트내 항목/요소/값 들의 총개수 반환 vs length [배열]
        System.out.println( 리스트변수명.size() ); // 4
        // 7. 요소 값 호출 : .get( 인덱스 ) : 특정한 인덱스의 요소값 반환 vs 배열명[인덱스]
        System.out.println( 리스트변수명.get(0) ); // 유재석
        System.out.println( 리스트변수명.get(2) ); // 강호동
        // 8. 요소 삭제 : .remove( 인덱스 ) : 특정한 인덱스의 요소 삭제
        리스트변수명.remove( 1 ); // 1번 인덱스의 요소 삭제
        System.out.println("리스트변수명 = " + 리스트변수명); // [유재석, 강호동, 신동엽]
        // 9. 요소 찾기 : .indexOf( 찾을값 ) : 찾을값이 존재하면 인덱스 반환 , 없으면 -1 반환한다.
        int 찾은결과 = 리스트변수명.indexOf( "강호동" );
        System.out.println("찾은결과 = " + 찾은결과); // 강호동은 1번 인덱스에 위치한다.
        // 10. 요소 찾기2 : .contains( 찾을값 ) : 찾을값이 존재하면 true , 없으면 false 반환한다.
        boolean 찾은결과2 = 리스트변수명.contains( "강호동" );
        System.out.println("찾은결과2 = " + 찾은결과2); // 강호동은 존재하므로 true 이다.
        // 5. 반복문 과 리스트 활용
        // 1. 일반 for문
        for( int index = 0 ; index <= 리스트변수명.size() - 1 ; index++ ){
            System.out.println("리스트변수명.get( index )  = " + 리스트변수명.get( index ) );
        }
        // 2. 향상된 for문
        for( String str : 리스트변수명 ){
            System.out.println("str = " + str);
        }
        // 11. 요소 전체 삭제 : .clear()
        리스트변수명.clear();
        // 12. 요소 존재 여부 : .isEmpty() : 리스트내 요소가 하나도 없으면 true 있으면 false
        boolean 여부 = 리스트변수명.isEmpty();
        System.out.println("여부 = " + 여부); // clear 했으므로 true 나온다.
        System.out.println("리스트변수명 = " + 리스트변수명); // [ ]







    } // main end
} // class end