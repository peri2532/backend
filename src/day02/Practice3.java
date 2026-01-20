package day02;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //문제1
        System.out.print("국어 점수 : "); int kor = scanner.nextInt();
        System.out.print("영어 점수 : "); int eng = scanner.nextInt();
        System.out.print("수학 점수 : "); int math = scanner.nextInt();
        int sum = kor + eng + math;
        System.out.println("총점 : " +sum);
        System.out.println("평균 : "+ sum/3.0);

        //문제2
        System.out.print("반지름을 입력하세요 : "); double r = scanner.nextDouble();
        double q = r * r * 3.14;
        System.out.println("원의 넓이 : "+ q);
        //문제3
        System.out.print("첫 번째 실수: "); double n1 = scanner.nextDouble();
        System.out.print("두 번째 실수: "); double n2 = scanner.nextDouble();
        System.out.println("비율: "+ (n1/n2 *100)+ "%");

        //문제4
        System.out.print("정수를 입력하세요 : "); int i1 = scanner.nextInt();
        System.out.println("결과 : "+ (i1 %2 !=0));

        //문제5
        System.out.print("정수를 입력하세요 : "); int  i2 = scanner.nextInt();
        System.out.println("결과 : "+ (i2 % 7 ==0));

        //문제 6
        System.out.print("아이디 : "); String s1 = scanner.next();
        System.out.print("비밀번호 : "); String s2 = scanner.next();
        System.out.println("결과 : " + (s1.equals("admin") && s2.equals("1234")));

        //문제7
        System.out.print("정수를 입력하세요 : "); int i01 = scanner.nextInt();
        System.out.println("결과 : "+ (i01 % 7 == 0 && i01 % 2 != 0));

        //문제8
        System.out.print("1차 점수: "); int i10 = scanner.nextInt();
        System.out.print("2차 점수: "); int i11 = scanner.nextInt();
        System.out.println("결과: "+ ((i10+i11>=150) ? "합격" : "불합격"));

        //문제9
        System.out.print("이름을 입력하세요: "); String s01 = scanner.nextLine();
        System.out.println((s01.equals("유재석")? s01 + "(방장)" : s01));

        //문제10
        System.out.print("밑변: "); double d01 = scanner.nextDouble();
        System.out.print("높이: "); double d10 = scanner.nextDouble();
        System.out.println("삼각형의 넓이: " + (d01 * d10 / 2.0));

        //문제11
        System.out.print("섭씨 온도: "); double d11 = scanner.nextDouble();
        System.out.println("화씨 온도: "+ (d11*9.0 / 5.0+32));

        //문제 12
        System.out.print("태어난 연도: "); int year = scanner.nextInt();
        System.out.print("2025년 기준 나이: "+ (2025-year)+ "세");

        //문제 13
        System.out.print("키(cm): "); double cm = scanner.nextDouble();
        System.out.print("몸무게(kg): "); double kg = scanner.nextDouble();
        double m= cm/100.0;
        System.out.println("BMI 지수: "+(kg/(m*m)));

        //문제 14
        System.out.print("아이디: "); String id = scanner.next();
        System.out.print("이메일: "); String email = scanner.next();
        System.out.println("결과: "+ (id.equals("admin")|| email.equals("admin@test.com")? "관리자" : "일반 사용자"));

        //문제 15
        System.out.print("점수를 입력하세요: "); int score = scanner.nextInt();
        if(score>=90){
            System.out.println("등급:A");
        } else if (score>=80) {
            System.out.println("등급:B");
        } else {
            System.out.println("등급:C");
        }

        //문제 16
        System.out.println("나이를 입력하세요: "); int age1 = scanner.nextInt();
        if(age1>=20 && age1 <=29){
            System.out.println("이벤트 대상입니다.");
        }
        else{
            System.out.println("이벤트 대상이 아닙니다.");
        }
    }
}
