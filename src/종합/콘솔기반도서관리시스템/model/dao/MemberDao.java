package 종합.콘솔기반도서관리시스템.model.dao;

import 종합.콘솔기반도서관리시스템.model.dto.MemberDto;
import java.util.ArrayList;

public class MemberDao {

    // ✅ 1. 생성자 숨기기
    private MemberDao() {}

    // ✅ 2. 단 하나의 객체 생성
    private static final MemberDao instance = new MemberDao();

    // ✅ 3. 외부에서 객체를 가져갈 수 있는 메서드
    public static MemberDao getInstance() {
        return instance;
    }

    // -----------------------------------------
    // ✅ 실제 데이터 저장소 (회원 목록)
    // -----------------------------------------
    private static ArrayList<MemberDto> memberList = new ArrayList<>();

    // -----------------------------------------
    // ✅ 기능 메서드
    // -----------------------------------------

    // 회원가입
    public boolean join(String id, String pw) {
        for (MemberDto m : memberList) {
            if (m.getId().equals(id)) {
                return false; // 중복 ID
            }
        }
        memberList.add(new MemberDto(id, pw));
        return true;
    }

    // 로그인
    public boolean login(String id, String pw) {
        for (MemberDto m : memberList) {
            if (m.getId().equals(id) && m.getPassword().equals(pw)) {
                return true; // 로그인 성공
            }
        }
        return false;
    }
}