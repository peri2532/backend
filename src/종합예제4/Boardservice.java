package 종합예제4;

import java.util.Scanner;

public class Boardservice {
    public static void main(String[] args) {
        BoardController bc = new BoardController();
        for( ; ;){
            System.out.println("==========MY Community==========");
            System.out.println("1.게시물 쓰기 | 2. 게시물 출력");
            System.out.println("================================");
            System.out.println("선택 >");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
            if(ch == 1){
                scanner.nextLine();
                System.out.println("내용 : "); String content = scanner.nextLine();
                System.out.println("작성자 : "); String writer = scanner.nextLine();
                boolean result = bc.doPost(content, writer);
                if(result == true){
                    System.out.println("[안내] 등록 성공");
                }
                else{
                    System.out.println("[경고]등록 실패");
                }
            } else if (ch== 2) {
                Board[] boards = bc.doGet();
                // --
                for( int index = 0 ; index <= boards.length-1; index++ ){
                    if( boards[index]!=null){
                        System.out.println( "작성자 : "+boards[index].writer );
                        System.out.println( "내용 : "+boards[index].content);
                        System.out.println("--------------------------------");
                    }
                }
            }
        }
    }
}
