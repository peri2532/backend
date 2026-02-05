package 종합.콘솔기반도서관리시스템.view;

import 종합.콘솔기반도서관리시스템.controller.BookController;
import 종합.콘솔기반도서관리시스템.model.dto.BookDto;

import java.util.Scanner;

public class BookView {

    // 1. 생성자 숨기기
    private BookView() {}

    // 2. 싱글톤 생성
    private static final BookView instance = new BookView();

    // 3. 외부에서 접근할 수 있도록 제공
    public static BookView getInstance() {
        return instance;
    }

    // Controller도 싱글톤으로 연결
    private BookController bookController = BookController.getInstance();
    private Scanner sc = new Scanner(System.in);

    // -----------------------------------------
    // 도서 메뉴 메서드
    // -----------------------------------------

    public void bookMenu() {
        while (true) {
            System.out.println("\n[도서 메뉴] 1. 도서 목록 2. 도서 대여 3. 도서 반납 4. 도서 등록 0. 뒤로가기");
            System.out.print("선택> ");
            int ch = sc.nextInt();
            sc.nextLine(); // 버퍼 제거

            switch (ch) {
                case 1:
                    for (BookDto b : bookController.getAllBooks()) {
                        System.out.printf("ID: %d | 제목: %s | 저자: %s | 상태: %s\n",
                                b.getId(), b.getTitle(), b.getAuthor(), b.isRented() ? "대여 중" : "대여 가능");
                    }
                    break;
                case 2:
                    System.out.print("대여할 도서 ID: ");
                    int rentId = sc.nextInt();
                    System.out.println(bookController.rentBook(rentId) ? "대여 성공" : "대여 실패 (없는 ID이거나 이미 대여 중)");
                    break;
                case 3:
                    System.out.print("반납할 도서 ID: ");
                    int returnId = sc.nextInt();
                    System.out.println(bookController.returnBook(returnId) ? "반납 성공" : "반납 실패 (없는 ID이거나 대여되지 않음)");
                    break;
                case 4:
                    System.out.print("도서 제목: ");
                    String title = sc.nextLine();
                    System.out.print("도서 저자: ");
                    String author = sc.nextLine();
                    bookController.registerBook(title, author);
                    System.out.println("도서 등록 완료!");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}