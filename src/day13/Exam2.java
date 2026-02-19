
package day13;

import java.util.Arrays;

public class Exam2 {
    public static void main(String[] args) {

        // String 클래스
        // 1. 문자열 표현 방법 == ** 문자의 배열 **
        char str1 = '유'; // char 한 글자 만 저장 가능.
        char[ ] str2 = { '유' , '재' , '석' }; // char타입 배열

        // 2. 문자 변환 , 아스키코드(C언어) 7비트 -> 128문자 , 유니코드(자바) 전세계 표준 문자 부호
        char str3 = 65; System.out.println("str3 = " + str3); // A
        char[] str4 = { 74 , 65 , 86 , 65 };
        System.out.println("str4 = " + Arrays.toString( str4 ) );  // J A V A
        char str5 = '김';    System.out.println("str5 = " + (int)str5); // 44608

        // 3. 문자열 생성 , == 리터럴(상수) 비교 , .equals( ) 객체 비교
        String str6 = "유재석"; // 문자 리터럴 형식
        String str7 = "유재석"; // 문자 리터럴 형식 vs
        String str8 = new String( "유재석" ); // 문자 객체 형식 , 객체{ "유재석" }
        System.out.println( str6 == str7 ); // true
        System.out.println( str6 == str8 ); // false
        System.out.println( str6.equals( str8 ) ); // true

        // 4. 주요 기능/메소드 : 문자은 *불변*이다.
        // 1) "문자열".concat("새로운문자") : 문자열에 새로운문자열 연결 하여 *(새로운)*반환 하는 함수
        String str9 = "자바"; // str9 주소값
        String str10 = str9.concat( "프로그래밍"); // str10 주소값
        // 2) "문자열" + "새로운문자열" : + 연결연산자 , 연결된 문자열이 반환 된다.
        String str11 = str9 + "프로그래밍";
        // 3) StringBuilder 클래스 , .append 함수 이용하여 문자열 연결 하는 객체 , 연결된 문자열에 따른 *주소값 유지*
        StringBuilder builder = new StringBuilder();
        builder.append( str9 );
        builder.append( "프로그래밍");
        System.out.println( builder ); // 자바프로그래밍
        // 4) String.fotmat( "%" , "문자열" )
        String str12 = String.format( "%s%s" , str9 , "프로그래밍");
        System.out.println("str12 = " + str12); // 자바프로그래밍
        // 5) """ """ 자동 줄바꿈 표현 하는 문자열 vs \n
        String str13 = """ 
                자바
                프로그래밍
                """;
        System.out.println( str13 );

        // 활용 : JDBC SQL
        String name = "유재석";
        String sql1 = "insert into table(name)values("+name+")";
        String sql2 = "insert into table(name)values(".concat( name +")");
        String sql3 = String.format( "insert into table(name) values( %s ) " , name );
        StringBuilder sql4 = new StringBuilder();
        sql4.append( "inser into table(name) ");
        sql4.append( "value( ");
        sql4.append( name );
        sql4.append( ")");
        String sql5 = "insert into table(name) values ( ? ) ";

        //  6) .chatAt( 인덱스 ) , 문자열내 지정한 인덱스 번호의 문자 1개 추출/반환
        char gender = "012345-1230123".charAt(7);
        System.out.println("gender = " + gender);

        // 7) .length() : 문자열내 문자 개수/길이 반환
        System.out.println( "012345-1230123".length() );

        // 8) .replace( 기존문자 , 새로운문자 ) : 문자열내 기존문자가 존재하면 새로운문자 로 치환 하여 문자열반환
        String str14 = "자바프로그래밍".replace("자바","JAVA");
        System.out.println("str14 = " + str14); // JAVA프로그래밍
        // 활용 : HTML ( 데이터수집 과정 정제/정리 )
        String html = "<div>유재석</div> <br/> <div> 강호동 </div> <br/> ";
        System.out.println( html.replaceAll( "<br/>" , "\n" ) ); // html 줄바꿈 --> java 줄바꿈 치환

        // 9) .substring( 시작 , [끝] ) , 시작 부터 끝 인덱스까지 문자열 추출/반환
        String str15 = "012345-1230123".substring( 0 , 6 );
        System.out.println("str15 = " + str15); // 012345

        // 10. .split( "구분문자" ) , 구분문자 기준으로 잘라서 배열로 반환 , 활용처:날짜/시간,CSV,데이터정리 등
        String[ ] str16 = "012345-1230123".split( "-" );
        System.out.println("str16[0]  = " + str16[0] ); // 012345
        System.out.println("str16[1]  = " + str16[1] ); // 1230123

        // 11. .indexOf( "찾을문자" ) , 찾을문자가 존재하면 찾은인덱스번호 아니면 -1 반환 , 활용처 : 검색,
        // 12. .contains( "찾을문자" ) , 찾을문자가 존재하면 true 아니면 false 반환
        System.out.println( "자바 프로그래밍 언어".indexOf("프로") ); // 3(인덱스)
        System.out.println( "자바 프로그래밍 언어".contains("프로") ); // true

        // 13. .getBytes() , 문자열을 byte배열[] 로 반환/추출 ,
        // new String( 문자열바이트 ) , byte배열 --> 문자열타입
        byte[] str17 = "ABC".getBytes();
        System.out.println( Arrays.toString( str17 ) );  // [65, 66, 67]
        String str18 = new String( str17 );
        System.out.println("str18 = " + str18); // ABC

    } // main end
} // class end
