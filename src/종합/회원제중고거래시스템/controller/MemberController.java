package 종합.회원제중고거래시스템.controller;

import 종합.회원제중고거래시스템.model.dao.MemberDao;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){ return instance; }
    private MemberDao md = MemberDao.getInstance();

    // [1] 회원가입 메소드
    public boolean signup( String mid, String mpw , String mname , String mphone ){
        System.out.println("MemberController.signup"); // soutm 중간검사( 최종 완성 후 제거 )
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone); // soump

        // [*] 유효성검사 ( 중복검사, 데이터의길이검사 등등 )
        boolean result = md.signup( mid , mpw , mname , mphone );
        return result;
    }
    // [2] 로그인 메소드
    private int loginSession = 0; // 세션이란? 일정한 저장소 구역 ,
    public int getLoginSession(){ return loginSession; } // 다른 클래스에서 로그인상태 접근 메소드
    // 로그인 성공한 회원번호 저장 , 0이면 비로그인 , 3이면 3번 회원 로그인중
    public boolean login( String mid , String mpw ){
        System.out.println("MemberController.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        int result = md.login( mid , mpw );
        if( result > 0 ){  // 만약에 반환값이 0초과 이면 회원번호 저장
            loginSession = result; return true; // 세션(변수) 부여
        }
        return false;
    }
    // [3] 로그아웃 메소드
    public boolean logout( ){
        loginSession = 0; // 로그인 상태를 0(비로그인) 으로 변경 // 세션(변수) 초기화
        return true;
    }

}