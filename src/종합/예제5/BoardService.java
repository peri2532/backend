package 종합.예제5;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        // [1] Controller 객체 생략
        for( ; ; ){
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("====================================== ");
            System.out.print("선택>");
            Scanner scan = new Scanner( System.in );
            int ch = scan.nextInt();
            if( ch == 1 ){
                scan.nextLine();
                System.out.print("내용 : ");  String content = scan.nextLine();
                System.out.print("작성자 : "); String writer = scan.nextLine();
                // BoardController.doPost( ) : static메소드( 클래스명.메소드명() ) vs bc.doPost( ) : 일반메소드( 객체명.메소드명() )
                // 함수 호출 후 반환(결과)에 따른 흐름제어 하기위해 boolean result 변수에 결과값 저장
                boolean result = BoardController.doPost( content , writer );
                if( result ){ System.out.println("[안내] 글쓰기 성공"); }
                else{ System.out.println("[안내] 글쓰기 실패");  }
            }else if( ch == 2 ){
                Board[] boards = BoardController.doGet();
                for( Board board : boards ){ // board.wrtier 직접접근 [VS] board.getWriter() 간접접근
                    if( board != null )
                        System.out.printf("작성자 : %s , 내용 : %s \n" , board.getWriter() , board.getContent() );
                } // for end
            } // if end
        } // for end
    } // main end
} // class end