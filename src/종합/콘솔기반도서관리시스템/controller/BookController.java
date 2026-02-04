package 종합.콘솔기반도서관리시스템.controller;


import 종합.회원제중고거래시스템.model.dao.MemberDao;

import java.util.ArrayList;

public class BookController {
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){return instance;}

    private BookController bc = BookController.getInstance();

    public boolean add(String btitle, String bauthor,String bname){
        int loginMno = MemberController.getInstance().getLoginSession();
        boolean result = bc.add(btitle, bauthor, bname, loginMno);
        return result;
    }

    public ArrayList<BookDto> findAll(){
        ArrayList<BookDto> result = bd.findall();
        for(int index= 0; index <= result.size() - 1; index ++){
            BookDto bookDto = result.get(index);

            String bname = MemberDao.getInstance().findMname(bookDto.getMno());
            productDto.setMnae(bname);
        }
        return result;
    }



}

