package 종합.콘솔기반도서관리시스템.model.dto;

public class MemberDto {

    private String id;         // 회원 ID
    private String password;   // 회원 비밀번호

    // ✅ 생성자
    public MemberDto(String id, String password) {
        this.id = id;
        this.password = password;
    }

    // ✅ Getter 메서드
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    // ※ 일반적으로 Setter는 로그인 정보 수정이 필요할 때 추가할 수 있음
}