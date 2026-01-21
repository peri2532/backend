package day03;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        //문제 1
        System.out.println("첫 번째 정수: "); int num1 = scanner.nextInt();
        System.out.println("두 번째 정수: "); int num2 = scanner.nextInt();
        int sum = num1+num2;
        if(sum>=90){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }

        //문제2
        System.out.println("첫 번째 정수: "); int num3 = scanner.nextInt();
        System.out.println("두 번째 정수: "); int num4 = scanner.nextInt();
        if(num3>num4){
            System.out.println("더 큰 수: "+num3);
        }
        else{
            System.out.println("더 큰 수: "+num4);
        }

        //문제3
        System.out.println("아이디: "); String s1 = scanner.next();
        System.out.println("비밀번호: "); String s2 = scanner.next();
        if(s1.equals("admin")&& s2.equals("1234")){
            System.out.println("로그인 성공");
        }
        else{
            System.out.println("로그인 실패");
        }

        //문제4
        System.out.println("비밀번호를 입력하세요: "); String s3 = scanner.next();
        int snum= s3.length();
        if(snum>=12){
            System.out.println("보안 등급: 강함");
        } else if (snum>=8) {
            System.out.println("보안 등급: 보통");
        }
        else{
            System.out.println("보안 등급: 약함 (8자 이상으로 설정해주세요.");
        }

        //문제 5
        System.out.println("주민등록번호(-포함)를 입력하세요: "); String jumin = scanner.next();
        char ju = jumin.charAt(7);
        if(ju == '1' || ju == '3'){
            System.out.println("남자");
        }
        else if ( ju == '2' || ju == '4') {
            System.out.println("여자");
        }

        //문제 6
        System.out.println("점수를 입력하세요: ");
        int score = scanner.nextInt();
        if(900<=score){
            System.out.println("A급 경품");
        } else if (score>=700) {
            System.out.println("B급 경품");
        } else if (score>=500) {
            System.out.println("C급 경품");
        }
        else {
            System.out.println("D급 경품");
        }

        //문제 7
        System.out.println("역할을 입력하세요: ");
        String role =scanner.next();
        if(role.equals("admin")){
            System.out.println("모든 기능에 접근할 수 있습니다.");
        } else if (role.equals("editor")) {
            System.out.println("콘텐츠 수정 및 생성 기능에 접근할 수 있습니다.");
        } else if (role.equals("viewer")) {
            System.out.println("콘텐츠 조회만  가능합니다.");
        }
        else{
            System.out.println("정의되지 않은 역할입니다.");
        }

        //문제 8
        System.out.println("나이를 입력하세요: ");
        int ageage = scanner.nextInt();
        if(ageage<8){
            System.out.println("무료");
        }
        else if(ageage<=19){
            System.out.println("5,000원");
        } else if (ageage<65) {
            System.out.println("10,000원");
        }
        else{
            System.out.println("3,000원");
        }

        //문제9
        System.out.println("점수를 입력하세요: "); int sscore = scanner.nextInt();
        if(sscore>=90){
            System.out.println("A등급");
        } else if (sscore>=80) {
            System.out.println("B등급");
        } else if (sscore>=70) {
            System.out.println("C등급");
        }
            else{
            System.out.println("재시험");
        }

            //문제10
        System.out.println("총 구매 금액: "); int total = scanner.nextInt();
        if(total>=50000){
            System.out.println("최종 결제 금액: "+(int)(total*0.9)+"원");
        }
        else if(total>=30000){
            System.out.println("최종 결제 금액: "+(int)(total*0.95)+"원");
        }
        else if(total>=10000){
            System.out.println("최종 결제 금액: "+(int)(total*0.99)+"원");
        }
        else{
            System.out.println("최종 결제 금액: "+total);
        }
        System.out.println();

        //문제 11
        System.out.println("월(1~12)을 입력하세요: "); int month = scanner.nextInt();
        if(month>=3 && month<=5){
            System.out.println("봄");
        } else if (month>=6 && month<=8) {
            System.out.println("여름");
        }else if (month>=9 && month<=11) {
            System.out.println("가을");
        } else if (month == 12 || month == 1 || month==2) {
            System.out.println("겨울");
        }
    // vs switch
        switch (month){
            case 3: case 4: case 5: System.out.println("봄"); break;
            case 6: case 7: case 8: System.out.println("여름"); break;
            case 9: case 10: case 11: System.out.println("가을"); break;
            case 12: case 1: case 2: System.out.println("겨울"); break;

        }

        //문제 12
        System.out.print("첫 번째 정수: "); int n1 = scanner.nextInt();
        System.out.print("두 번째 정수: "); int n2 = scanner.nextInt();
        System.out.print("세 번째 정수: "); int n3 = scanner.nextInt();
        int max = n1;
        if(n2> max){
            max = n2;
    }
        if(n3>max){
            max = n3;
        }
        System.out.println("가장 큰 수: "+ max);

        //문제 13
        System.out.println("연도를 입력하세요: ");
        int year = scanner.nextInt();
        if((year % 4==0 && year % 100!=0)|| (year %400==0)) {
            System.out.println(year+"년은 윤년입니다.");
        }
        else{
            System.out.println(year+"는 평년입니다.");
        }

        //문제 14
        System.out.println("첫 번째 정수 입력: "); int nn1= scanner.nextInt();
        System.out.println("두 번째 정수 입력: "); int nn2= scanner.nextInt();
        System.out.println("세 번째 정수 입력: "); int nn3= scanner.nextInt();
        int temp;
        if(nn1>nn2){temp = nn1; nn1=nn2; nn2=temp;}
        if(nn1>nn3){temp = nn1; nn1=nn3; nn3=temp;}
        if(nn2>nn3){temp = nn2; nn2=nn3; nn3=temp;}
        System.out.println(nn1+", " +nn2+", " +nn3);

        //문제 15
        System.out.print("플레이어1: "); int p1 = scanner.nextInt();
        System.out.print("플레이어2: "); int p2 = scanner.nextInt();
        if(p1 == p2){
            System.out.println("무승부");
        } else if ((p1==0 && p2 ==2) || (p1 == 1 && p2 ==0) || (p1 ==2 && p2 ==1)){
            System.out.println("플레이어 1의 승리");
        }else{
            System.out.println("플레이어 2의 승리");
        }

    }
}
