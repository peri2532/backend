package day02;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //문제1
        byte a = 10;
        int b= 200;
        long c = a+b;
        System.out.println(c);
//        문제2
        double z = 3.141592;
        int result = (int)z;
        System.out.println(result);

        //문제3
        System.out.println("키: "); double 키 = scanner.nextDouble();
        System.out.println("당신의 키는 약" + (int)키+" 이군요.");

        //문제4
        System.out.println("첫번째 정수 입력 : "); int n1 = scanner.nextInt();
        System.out.println("두번째 정수 입력 : "); int n2 = scanner.nextInt();
        System.out.println("세번째 정수 입력 : "); int n3 = scanner.nextInt();
        double avg = (double)(n1+n2+n3)/3.0;    // int +int + int / double = double;
        System.out.println("평균 결과: " + avg); // soutv + 자동완성 , 가장 가까운 변수 출력 함수
    }
}

/*문제 3: Scanner를 이용해 사용자의 키를 double 타입(예: 178.5)으로 입력받은 후, 이 값을 int 타입으로 강제 변환하여 "당신의 키는 약 OOOcm 이군요." 라고 정수 부분만 출력하시오.
입력 예시:
키를 입력하세요: 178.5
출력 예시:
당신의 키는 약 178cm 이군요. */

/*문제 4: Scanner를 이용해 서로 다른 3개의 정수를 입력받아, 이 값들의 합을 3으로 나눈 평균을 구하시오. 단, 결과는 소수점이 포함되도록 출력되어야 한다.
입력 예시:
첫 번째 정수 입력: 11
두 번째 정수 입력: 21
세 번째 정수 입력: 21
출력 예시:
평균 결과: 17.666666666666668 */