package 종합.예제5;

public class BoardController {
    //[1] private : 외부접근차단, static:우선 할당(객체없이), final(수정공지), boards = x, boards[0]=0;
    private static final Board[] boards = new Board[100];

    //[2] 기능1 : 저장 기능 , public : 모든 프로젝트에서 호출 가능
    public static boolean doPost(String content, String writer){
        Board board = new Board(content,writer); //1. 생성자를 이용한 객체 생성
        //2.
        for(int index=0; index<=boards.length-1; index++){
            if(boards[index] == null){
                boards[index] =board;
                return true;
            }
        }
        return false;
    }
    //[3]기능2: 조회 기능 ,boards가 리턴값 하므로 반환타입은 boards의 타입인 Board[]
    public static Board[] doGet(){
        return boards;
    }


}
