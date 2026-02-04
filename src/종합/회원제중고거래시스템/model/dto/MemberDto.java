package 종합.회원제중고거래시스템.model.dto;

public class MemberDto {
    // 1. 멤버변수 = 속성 = 테이블 샘플 참고
    private int mno;
    private String mid;
    private String mpw;
    private String mname;
    private String mphone;
    // 2. 생성자 : 기본생성자 와 전체생성자는 관례적으로 생성
    public MemberDto(){}
    public MemberDto(int mno, String mid, String mpw, String mname, String mphone) {
        this.mno = mno;
        this.mid = mid;
        this.mpw = mpw;
        this.mname = mname;
        this.mphone = mphone;
    }
    // 3. 메소드 : private 멤버변수에 대해 getter and setter 지원

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mname='" + mname + '\'' +
                ", mphone='" + mphone + '\'' +
                '}';
    }
}