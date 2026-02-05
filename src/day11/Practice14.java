package day11;

import com.sun.jdi.InternalException;

public class Practice14 {
    public static void pauseOneSecond() throws InterruptedException{
        Thread.sleep(1000);
    }
    public static void main(String[] args) {
    //문제 1
        try{
            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }

        //문제 2
        try {
            String notANumber = "오류";
            int value = Integer.parseInt(notANumber);
        }catch (NumberFormatException e1){
            System.out.println("잘못된 숫자 형식입니다.");
        }

        //문제 3
        try {
            String[] fruits = {"사과", "바나나"};
            System.out.println(fruits[2]);
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("잘못된 인덱스에 접근했습니다.");
        }

        //문제 4
        try{
            String text = null;
            System.out.println("글자 수: " + text.toUpperCase());
        }catch (NullPointerException e3){
            System.out.println("객체가 초기화되지 않았습니다.");
        }

        //문제5
         try {
             System.out.println("데이터베이스 연결을 시작합니다.");
         }finally {
             System.out.println("데이터베이스 연결을 종료합니다.");
         }


         //문제 6
        try {
            String text = null;
            text.length();
            int result = 5 / 0;
        }catch (NullPointerException e){
            System.out.println("객체가 초기화되지 않았습니다.");
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }

        //문제 7
    try {pauseOneSecond();} catch (InterruptedException e){
        System.out.println(e);}

        //문제 8
        try{
            int[] arr = new int[2];
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("알 수 없는 오류가 발생했습니다.");
        }

    }//main end
} // class end