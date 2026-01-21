package day03;

public class Exam1 {
    public static void main(String[] args) {
        //[1]조건문 if , 만약에~
            //(1) if(조건문) 실핼문;
        int  온도 = 5;
        if(온도<=10) System.out.println("외투입는다.");
            //(2) if(조건문) {실행문; 실행문;}
        int age =10;
        if(age>=19){
            System.out.println("성인입니다.");
            System.out.println("19세 입니다.");
            }
            //(3) if(조건문){실행문;}
        boolean 회원검사 =false;
        if(회원검사 ==true){
            System.out.println("안녕하세요 회원님");
        }
        else{
            System.out.println("비회원입니다");
        }
            //(4) if (조건문){실행문:}
    }
}
