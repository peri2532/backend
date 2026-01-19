package day01;

public class Exam3 {
    public static void main(String[] args) {
        //System: 클래스 이면서 시스템(현재 컴퓨터) 관련 기능/함수 제공한다.
        //out: 출력에 관련된 기능/함수 갖는 객체 변환.
        //print: 출력 함수
        System.out.println("자바 안녕");  //println: 자료 출력 후 자동 줄바꿈
        System.out.print("자바안녕2");
        System.out.printf("%s", "자바안녕3"); //자료 출력 + 형식문자
        /*
            printf(format 형식
            %s : 문자열, %d : 정수, %c: 문자 , %f : 실수
            자리수
            %자리수d : 자리수 만큼 자리 차지, 많이 비어있으면 공백, 오른쪽 정렬
            %-자리수d : 자리수 만큼 자리 차지, 많이 비어있으면 공백, 왼쪽 정렬
            %0자리수d : 자리수 만큼 자리 차지, 많이 비어있으면 0채움
            전체자리수.소수점자리수f
        */
        String name = "유재석"; int age=10;
        System.out.printf("저는 "+ name + " 이고 나이는 : "+age+ "입니다.");
        System.out.printf("저는 %s 이고 나이는 %6d 입니다. \n", name, age);
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %3.1f 입니다.\n", name, 178.2441);

        //[5] 이스케이프/제어 문자
        // "\n" : 줄바꿈
        // "\t" : 들여쓰기[tab]
        //  \"  : 큰따옴표 출력
        //  \' : 작은 따옴표 출력
        //  \\ : 백슬레시 출력
        System.out.println("안녕\n안녕2");
        System.out.println("안녕1\t안녕2");
        System.out.println("안녕1\"안녕2");
        System.out.println("안녕1\'안녕2");
        System.out.println("안녕1\\안녕2");
    }

}
