package 종합.콘솔기반도서관리시스템.view;

import 종합.콘솔기반도서관리시스템.controller.MemberController;
import java.util.Scanner;

public class MemberView {

    // 1. 생성자 숨기기
    private MemberView() {}

    // 2. 싱글톤 생성
    private static final MemberView instance = new MemberView();

    // 3. 외부에서 접근할 수 있도록 제공
    public static MemberView getInstance() {
        return instance;
    }

    // 필요한 싱글톤 객체들 연결
    private MemberController memberController = MemberController.getInstance();
    private BookView bookView = BookView.getInstance();
    private Scanner sc = new Scanner(System.in);

    // -----------------------------------------
    // 메인 메뉴
    // -----------------------------------------

    public void mainMenu() {
        while (true) {
            System.out.println("\n[메인 메뉴] 1. 회원가입 2. 로그인 0. 종료");
            System.out.print("선택> ");
            int ch = sc.nextInt();
            sc.nextLine(); // 버퍼 제거

            switch (ch) {
                case 1:
                    System.out.print("ID 입력: ");
                    String id = sc.nextLine();
                    System.out.print("비밀번호 입력: ");
                    String pw = sc.nextLine();
                    boolean result = memberController.signUp(id, pw);
                    System.out.println(result ? "회원가입 성공" : "이미 존재하는 ID입니다.");
                    break;

                case 2:
                    System.out.print("ID 입력: ");
                    String loginId = sc.nextLine();
                    System.out.print("비밀번호 입력: ");
                    String loginPw = sc.nextLine();
                    if (memberController.signIn(loginId, loginPw)) {
                        System.out.println("로그인 성공!");
                        bookView.bookMenu(); // 도서 메뉴로 이동
                    } else {
                        System.out.println("로그인 실패: ID 또는 비밀번호가 일치하지 않습니다.");
                    }
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}