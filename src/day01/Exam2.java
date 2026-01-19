package day01;  //패키지(폴더)로써 클래스 위치한 폴더명

public class Exam2 {//class s
    //public class : 공개용 클래스 선언 뜻 갖는 키워드
    //Exam2 : 임의의 클래스명 정의한다. 첫글자 대문자

        // [1] m+ 엔터 : main 함수
        //자바에서 최초의 실행 흐름(스레드)을 갖는 (미리만들어진) 함수
        //[2] 리터럴: 상수이면서 키보드로 입력가능한 자료등
        //3 , 3.14, 'a', true,false
        public static void main(String[] args) {//main s
            System.out.println(3); //JS의 console.log() 동일한 기능의 함수
            System.out.println(3.14);
            System.out.println("유"); //선언 또는 함수실행 뒤에 ;세미콜론 작성한다.
            System.out.println("유재석"); //문자열 처리할때는 큰 따옴표 사용


//            [3] 자료형/타입(분류) : 자료들을 효율적으로 사용하기 위한 분류 방법
//            효율이란? 내가 시계 선물하기 위해서 다이소에서 시계 크게 맞는 저가닥한 상자이다.
            //정수: byte(1, -128~+127) , short(2, +- 3만정도)
            // int(4,+-21억정도까지), long(8,+-21억정도 이상)
            //실수: float(4, 소수점 8자리 표현),  double(8바이트,소수점 17자리표현)
            //문자: char(2, ''작은 따옴표 감싼 문자 1개)
            //분리: boolean (1, true / false)
            //======== -> 8가지 + String
            //1. boolean 타입: true와 false만 저장
            boolean bol1 =true; //[자료형] 변수명 = "값"; [JS] let bool1 = true;
            boolean bol2 = false; //변수명은 카멜표기법 저장 ,숫자시작/일부특수/띄어쓰기 안됨/
//            boolean bo3= 3; //[오류] boolean은  저장할 수 없다.
            System.out.println(bol1);
            System.out.println(bol2);

            //2. char: ''작은 따옴자 1개 저장하는 타입
            char c1= 'A';
            System.out.println(c1);

            //3. String : " " 큰 따옴표로 감싼 문자 여러개 저장하는 (클래스) 타입
            String str1 = "ABC";//[오류] 문자 여러개 저장 불가

            //4. byte : -128~+127
            byte b1 =100;
            System.out.println(b1);
            //byte b2 = 300; //[오류]

            //5. short : +-32000
            short s1 = 32000;
            System.out.println(s1);
            //short s2 = 40000; //[오류]

            //6. int : +-21억 정도, 정수의 리터럴 기본 타입, 즉)키보드로부터 입력받은 값들은  int 타입이다.
            int i1 = 2100000000;
            System.out.println(i1);
            //int i2 = 3000000000; //[오류]

            //7. long : +-21억 이상, 리터럴 뒤에 L/1 붙인다.
            long L1 = 3000000000L; //3000000000 리터럴값은 INT 타입이라서 뒤에 L을 명시한다.
            System.out.println(L1);

            //8. double : 소수점 포함한 17자리 표현, 실수의 리터럴 기본타입
            double d1 = 0.12345123141241412;
            System.out.println(d1);

            //9. float : 소수점 포함한 8자리까지 표현, 리터럴 뒤에 F/f 붙인다.
            float f1= 123.123456789123456779f;
            System.out.println(f1);
            // + 소수점 오차가 발생 하거나 표현 한계로 사용 제약: String , BigDecimal 등 사용한다.
    }//main end
} // class end

/*
 -------- 코드 작성 --------            --------코드 실행 --------
 JS : console.log("자바")              브라우저
 JAVA: print("자바")                   main
  */