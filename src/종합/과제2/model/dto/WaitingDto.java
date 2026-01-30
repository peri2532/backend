package 종합.과제2.model.dto;

public class WaitingDto {
    //1. 멤버 변수
    private int no;
    private String number;
    private int person;

    //2. 생성자
    public WaitingDto(){}
    public WaitingDto(int no, String number, int person ){
        this.no = no;
        this.number = number;
        this.person = person;
    }

    // 3.setter/getter
    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    public int getPerson() {return person;}
    public void setPerson(int person) {this.person = person;}

    // 4. toString
    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", number='" + number + '\'' +
                ", person=" + person +
                '}';
    }
}
