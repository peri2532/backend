package 종합.콘솔기반도서관리시스템.model.dao;

import 종합.콘솔기반도서관리시스템.model.dto.BookDto;
import java.util.ArrayList;

public class BookDao {

    //  싱글톤: 단 하나의 객체만 생성
    private static final BookDao instance = new BookDao();

    // 책 목록 저장소
    private static ArrayList<BookDto> bookList = new ArrayList<>();
    private static int seq = 1;

    // 외부에서 생성자 접근 금지
    private BookDao() {}

    // 객체 반환 메서드
    public static BookDao getInstance() {
        return instance;
    }

    // --------------------------------------
    // 기능 메서드
    // --------------------------------------

    // 책 등록
    public void addBook(String title, String author) {
        bookList.add(new BookDto(seq++, title, author));
    }

    // 전체 책 목록 반환
    public ArrayList<BookDto> getBooks() {
        return bookList;
    }

    // ID로 책 찾기
    public BookDto getBookById(int id) {
        for (BookDto b : bookList) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    // 책 대여
    public boolean rentBook(int id) {
        BookDto book = getBookById(id);
        if (book != null && !book.isRented()) {
            book.setRented(true);
            return true;
        }
        return false;
    }

    // 책 반납
    public boolean returnBook(int id) {
        BookDto book = getBookById(id);
        if (book != null && book.isRented()) {
            book.setRented(false);
            return true;
        }
        return false;
    }
}