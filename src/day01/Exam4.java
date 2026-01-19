package day01;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        //[1] 입력함수
        //Scanner 클래스: 입력받은 자료들을 특정한 타입으로 변환
        //new: 새로운 객체 생성할 때 사용되는 키워드
        // new Scanner : Scanner 객체 만들겠다
        //(System.in): 시스템 입력 객체를 Scanner객체에게 전달
        // * 시스템 입력 객체를 Scanner 객체에 대입하여 Scanner 객체 생성
        // * Scanner 변수명 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        //[2] 입력함수
        //1. next();  : 입력받은 자료들을 문자열로 반환
        System.out.println("1.next() : ");//입력전  가이드
        String str1=scanner.next(); //console 에서 키보드로부터 입력받고 enter 입력시 입력 종료
        System.out.println(str1); //입력받은 자료

        //2. .nextLine() : 입력받은 자료를 문자열로 반환 , 띄어쓰기 포함
        // 주의할점: 띄어쓰기를 포함 하다보니 앞전에 next()와 충돌하여 하나의 next인식된다.
        // 해결방법:  nextLine()을 사용할때 앞전에 next() 존재하면 임의의 nextLine() 하나 더 작성한다.
        scanner.nextLine(); // !! 해결
        System.out.println("2.nextLine() : ");
        String str2 = scanner.nextLine();
        System.out.println(str2);

        //3. .nextByte()  : 입력받은 자료를 바이트로 변환 , -128 ~ +127 이외 자료이면 오류 발생
        System.out.println("3.nextByte() : ");
        byte b1 = scanner.nextByte();
        System.out.println(b1);

        //4. .nextShort : 입력받은 자료를 쇼트로 변환 , +- 3만정도 이외 자료이면 오류 발생
        System.out.println("4.nextShort : ");
        short s1 = scanner.nextShort();
        System.out.println(s1);

        //5. .nextInt : 입력받은 자료를 인트로 변환, +-21억정도 이외 자료이면 오류 발생
        System.out.println("5.netxtInt() : ");
        int i1 = scanner.nextInt();
        System.out.println(i1);

        //6. .nextLong() : 입력받은 자료를 롱으로 변환
        System.out.println("6.nextLong : ");
        long l1 = scanner.nextLong();
        System.out.println(l1);

        //7/8 nextFloat , nextDouble
        System.out.println("7.nextFloat : ");
        float f1 = scanner.nextFloat();
        System.out.println(f1);
        System.out.println("8.nextDouble : ");
        double d1 = scanner.nextDouble();
        System.out.println(d1);

        //9. nextBoolean : 입력받은 자료를 불리언으로 반환
        System.out.println("9.nextBoolean : ");
        boolean b2 = scanner.nextBoolean();
        System.out.println(b2);

        //10. next().charAt(0) , 입력받은 자료에서 첫번째 글자 반환, char 문자 스캔은 없다.
        System.out.println("10. next.charAt(0) : ");
        char c1 = scanner.next().charAt(0);
        System.out.println(c1);
    }
}
