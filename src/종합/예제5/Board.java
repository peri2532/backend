package 종합.예제5;

public class Board {
    //[1] 멤버 변수
    private String content;         //private : 현재 클래스에서만 접근 허용
    private String writer;
    //[2] 생성자 : 클래스 내부 빈 공간을 오른쪽 클릭 -> 생성 -> 생성자

    //생성자 1 :기본생성자
    public Board(){}

    //생성자 2 :전체생성자
    public Board(String content,String writer) {
        this.content = content;
        this.writer=writer;
    }

    //[3] 메소드
        //1. getter and setter : 클래스 내부 빈 공간을 오른쪽 클릭 -> 생성 -> getter 및 setter
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getWriter() {return writer;}
    public void setWriter(String writer) {this.writer = writer;}
        //2. toString 클래스 내부 빈 공간을 오른쪽 클릭 -> 생성 -> toString
    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
