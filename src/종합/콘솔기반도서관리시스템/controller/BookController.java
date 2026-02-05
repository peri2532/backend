package 종합.콘솔기반도서관리시스템.controller;


import 종합.콘솔기반도서관리시스템.model.dao.BookDao;
import 종합.콘솔기반도서관리시스템.model.dto.BookDto;
import java.util.ArrayList;

public class BookController {

    // 1. 생성자 숨기기
    private BookController() {}

    // 2. 싱글톤
    private static final BookController instance = new BookController();

    // 3. 외부에서 사용할 수 있도록 getInstance() 제공
    public static BookController getInstance() {
        return instance;
    }

    // BookDao도 싱글톤으로 사용
    private BookDao bookDao = BookDao.getInstance();

    // -----------------------------------------
    // 기능 메서드
    // -----------------------------------------

    // 도서 등록
    public void registerBook(String title, String author) {
        bookDao.addBook(title, author);
    }

    // 전체 도서 조회
    public ArrayList<BookDto> getAllBooks() {
        return bookDao.getBooks();
    }

    // 도서 대여
    public boolean rentBook(int id) {
        return bookDao.rentBook(id);
    }

    // 도서 반납
    public boolean returnBook(int id) {
        return bookDao.returnBook(id);
    }
}