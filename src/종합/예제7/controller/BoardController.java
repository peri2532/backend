package 종합.예제7.controller;
import 종합.예제7.modle.dao.BoardDao;
import 종합.예제7.modle.dto.BoardDto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoardController {
    private BoardController() {
    }

    private static final BoardController instance = new BoardController();

    public static BoardController getInstance() {
        return instance;
    }

    //[1] 게시물 등록 controller
    private BoardDao bd = BoardDao.getInstance();

    public boolean write(String bcontent, String bwriter) {
        boolean result = bd.write(bcontent, bwriter);
        return result;
    }



    // [4] 게시물 삭제 controller
    public boolean delete( int bno ){
        boolean result = bd.delete( bno );
        return result;
    }
    // [3] 게시물 수정 controller
    public boolean update( int bno , String bcontent ){
        boolean result = bd.update( bno , bcontent );
        return result;
    }

    //[2] 게시물 전체 조회 controller , 여러개 레코드 조회 -> ArrayList , 한개 레코드 조회 ->dto
    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }
}
