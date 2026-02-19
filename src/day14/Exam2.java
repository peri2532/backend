package day14;

import java.time.LocalTime;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        // [ Main Thread -> 시계 Thread 만들기]
        시계스레드 시계스레드 = new 시계스레드();
        Thread thread1 = new Thread( 시계스레드 );
        thread1.start(); // 시계스레드 시작
        // [ Main Thread -> 타이머 Thread 만들기 ]
        타이머스레드 타이머스레드 = new 타이머스레드();
        타이머스레드.start(); // 타이머스레드 시작
        // [ Main Thread 입력 ]
        for ( ; ; ){
            System.out.println(" 타이머 : 1)ON  2) OFF : ");
            Scanner scan = new Scanner( System.in );
            int ch = scan.nextInt();
            if( ch == 1 ){
                타이머스레드 = new 타이머스레드();
                타이머스레드.state = true;
                타이머스레드.start();
            }
            else if( ch == 2 ){
                if( 타이머스레드 != null ) {
                    // 타이머스레드.stop(); // 가능하지만 비권장
                    타이머스레드.state = false; // 멤버변수로 상태 관리
                }
            }
        }

    } // main end
} // class end

class 시계스레드 implements Runnable{
    @Override public void run() { // run 정의
        for( ; ; ){ // 무한루프
            System.out.println( LocalTime.now() ); // 현재시간
            try{ Thread.sleep( 995 ); } catch ( Exception e ){} // main스레드가 아닌 현재 작업스레드 1초 일시정지
        } // for end
    } // run end
} // class end
class 타이머스레드 extends Thread {
    boolean state = false; // 타이머 실행 상태
    @Override public void run() {
        int second = 0; // 타이머가 계산하는 초
        for( ; ; ){
            if( state == false ) break; // 타이머 종료
            second++; // 1초 증가
            System.out.printf("[타이머] : %d 초\n" , second );
            try{ Thread.sleep( 995 ); } catch ( Exception e ){}
        } // for end
    } // run end
} // class end