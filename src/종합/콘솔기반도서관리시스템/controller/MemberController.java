package 종합.콘솔기반도서관리시스템.controller;

import 종합.콘솔기반도서관리시스템.model.dao.MemberDao;

public class MemberController {

    //  1. 생성자 숨기기
    private MemberController() {}

    // 2. 싱글톤 생성
    private static final MemberController instance = new MemberController();

    //  3. 외부에서 접근할 수 있도록 제공
    public static MemberController getInstance() {
        return instance;
    }

    //  DAO도 싱글톤으로 연결
    private MemberDao memberDao = MemberDao.getInstance();

    // -----------------------------------------
    //  기능 메서드
    // -----------------------------------------

    // 회원가입
    public boolean signUp(String id, String pw) {
        return memberDao.join(id, pw);
    }

    // 로그인
    public boolean signIn(String id, String pw) {
        return memberDao.login(id, pw);
    }
}