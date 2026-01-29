package 종합.예제6.view;

import 종합.예제6.controller.BoardController;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // [*] 싱글톤 생성
    private BoardView(){}//[1]
    private static final BoardView instance = new BoardView();//[2]
    public static BoardView getInstance(){//[3]
        return instance;
    }
    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    // [*] 입력객체는 모든 메소드에서 사용할 예정 이므로 지역변수 말고 메소드 밖에서 선언하자
    private Scanner scan = new Scanner(System.in);

    // *) 메인 화면
    public void indexView(){
        for( ; ; ) {
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if( ch == 1 ){ writeView(); } // 만약에 1번 입력하면 쓰기 페이지로 이동
            else if( ch == 2 ){ printView(); } // 아니고 2번 입력하면 전체조회 페이지로 이동
        } // for end
    } // m end


    // 1) 등록 입출력 화면
    public void writeView( ){
        scan.nextLine();
        System.out.print("내용 : ");  String content = scan.nextLine();
        System.out.print("작성자 : "); String writer = scan.nextLine();
        // 1.컨트롤러에게 입력받은 content , writer 전달하여 결과 받아오기
        boolean result = bc.doPost( content , writer );
        // 2. 받은 결과에 따른 화면 출력해주기
        if( result ){ System.out.println("[안내] 글쓰기 성공"); }
        else{ System.out.println("[안내] 글쓰기 실패");  }
    } // m end

    // 2) 전체 조회 입출력 화면
    public void printView( ){
        // 1. 컨트롤러에게 모든 게시물 요청 하고 결과를 받는다.
        ArrayList<BoardDto> boards = bc.doGet(); // vs BoardDto[] boards = bc.doGet();
        // 2. 받은 결과를 모두 출력한다. // ArrayList는 가변(저장된요소만)길이 라서 null 체크 안한다.
        for( BoardDto board : boards ){
            System.out.printf("번호 : %d , 작성자 : %s , 내용 : %s \n" ,
                    board.getNo() , board.getWriter() , board.getContent() );
        }
    } // m end
} // class end