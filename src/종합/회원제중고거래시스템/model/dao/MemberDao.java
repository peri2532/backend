package 종합.회원제중고거래시스템.model.dao;

import 종합.회원제중고거래시스템.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){ return instance; }

    private ArrayList< MemberDto > members = new ArrayList<>();

    private int currentMno = 1; // [*] 자동회원번호 부여하기 위한 최신 회원번호
    // [1] 회원가입
    public boolean signup( String mid , String mpw , String mname , String mphone ){
        System.out.println("MemberDao.signup"); // soutm
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone); // soutp
        MemberDto memberDto = new MemberDto( currentMno , mid , mpw , mname , mphone );// 1. 회원 객체[dto] 생성한다.
        boolean result = members.add( memberDto ); // 2. 회원객체를 리스트에 저장한다,
        if( result ){ currentMno++; }// [*] 저장 성공시 회원번호 1 증가
        return result; // 3. 저장 성공 여부를 반환한다.
    } // m end

    // [2] 로그인( 현재 정보와 기존 정보를 비교 하는 작업 )
    public int login( String mid , String mpw ){
        System.out.println("MemberDao.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        for( int index = 0 ; index <= members.size()-1 ; index++ ) {// 1. 리스트(배열) 0부터 마지막 인덱스까지 반복한다.
            MemberDto memberDto = members.get( index ); // 2. index번째 회원객체를 꺼낸다.
            // 3. 만약에 index번째 회원객체내 아이디 와 비밀번호가 입력받은 아이디/비밀번호 같다면
            if( memberDto.getMid().equals( mid ) && memberDto.getMpw().equals( mpw ) ){
                return memberDto.getMno();// 4. 로그인 성공 하면 회원번호 반환
            }
        } // for end
        return 0; // 5. 반복문 중에 동일항 정보가 없다면 로그인 실패 0
    } // m end

    // [3] 회원번호로 닉네임 조회하기
    public String findMname( int mno ){
        for( int index = 0 ; index <= members.size()-1 ; index++ ){
            if( members.get(index).getMno() == mno ){ // 만약에 index번째 회원번호가 조회할 회원번호 같다면
                return members.get(index).getMname(); // 찾은 회원번호 반환
            }
        }
        return null; // 없으면 null 반환
    } // m end

} // c end