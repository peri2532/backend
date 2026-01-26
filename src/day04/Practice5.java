package day04;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {


        // [문제 1]
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // [문제 2]
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // [문제 3]
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("1부터 50까지의 합계: " + sum);

        // [문제 4]
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // [문제 5]
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // [문제 6]
        int totalSum = 0;
        for (int i = 1; ; i++) {
            totalSum += i;
            if (totalSum > 100) {
                System.out.println(i + "까지 더했을 때 합계가 " + totalSum + "로 100을 넘습니다.");
                break;
            }
        }

        // [문제 7]
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // [문제 8]
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // [문제 9]
//        int count = 0;
//        for( ; ; ){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println((count+1) + "회 입력 : ");
//            String str = scanner.next();
//            if(str.equals("end")){break;}
//            count++;
//        }
//        System.out.println("count = " + count );
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print((count + 1) + "회 입력 : ");
            String input = scanner.next();
            if (input.equals("end")) {
                System.out.println("[안내] 프로그램을 종료합니다. [총 " + count + "회 입력]");
                break;
            }
            count++;
        }

        // [문제 10]

        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;

        july1 = july1/10000;
        july2 = july2/10000;
        july3 = july3/10000;
        july4 = july4/10000;

        for(int i = 1; i<= july1/100; i++){
            System.out.println("■");
        }
        System.out.println(july1+"만원");
        for(int i = 1; i<= july2/100; i++){
            System.out.println("■");
        }
        System.out.println(july2+"만원");
        for(int i = 1; i<= july3/100; i++){
            System.out.println("■");
        }
        System.out.println(july3+"만원");
        for(int i = 1; i<= july4/100; i++){
            System.out.println("■");
        }
        System.out.println(july4+"만원");
//        int july1 = 3532100;
//        int july2 = 9123700;
//        int july3 = 5183400;
//        int july4 = 11738700;
//        int[] sales = {july1, july2, july3, july4};
//
//        for (int i = 0; i < sales.length; i++) {
//            int manwon = sales[i] / 10000;
//            System.out.print((i + 1) + "주차 : ");
//            for (int j = 0; j < manwon / 100; j++) {
//                System.out.print("■");
//            }
//            System.out.println(manwon + "만원");
//        }

        // [문제 11]
        System.out.println("---------------------------------");
        System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
        System.out.println("---------------------------------");
        System.out.print("선택> 1");
        System.out.println("---------------------------------");
        System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
        System.out.println("---------------------------------");
        System.out.print("선택> 2");
        System.out.println("---------------------------------");
        System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
        System.out.println("---------------------------------");
        System.out.print("선택> 3");
        System.out.println("잔고 >");
        System.out.println("---------------------------------");
        System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
        System.out.println("---------------------------------");
        System.out.print("선택> 4");
        System.out.println("프로그램을 종료합니다.");
        int balance = 0;
        for (;;) {
            System.out.println("---------------------------------");
            System.out.println("1:입금 | 2:출금 | 3:잔고 | 4:종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액> ");
                balance += scanner.nextInt();
            } else if (menu == 2) {
                System.out.print("출금액> ");
                int amount = scanner.nextInt();
                if (amount > balance) {
                    System.out.println("잔고보다 큰 금액은 출금할 수 없습니다.");
                } else {
                    balance -= amount;
                }
            } else if (menu == 3) {
                System.out.println("잔고> " + balance);
            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}