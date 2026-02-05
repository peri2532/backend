package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam3 {
    public static void main(String[] args) {

        //[JDBC] : 자바 데이터베이스 연동 라이브러리
            //mysql-connector-j-9.6.0.jar파일을 준비한다.
            // 준비된 .jar 파일을 프로젝트 폴더 넣어준다.
            // .jar 파일 오른쪽 클릭 -> 하단에 [라이브러리 추가] 프로젝트마다 1번
            // [연동1] Class.forname("패키지명.JDBC클래스명"); * SQL 회사마다 다르다.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// 해당 클래스가 존재하면 동적으로 객체 생성
            // [연동 2 DB서버 계정 정보]
//            String url = "jdbc:mysql회사명://ip주소:port번호/데이터베이스명";
            //String user = "계정명"
            // String password= "계정비밀번호" // 띄어쓰기 주의
            String url = "jdbc:mysql://localhost:3306/mydb0205";
            String user = "root";
            String password = "1234";
            //[연동3] Connection(I) java.sql 패키지
            //DriverManager.getConnection(C); 구현(객)체 , * 일반 예외
            Connection conn = DriverManager.getConnection(url , user, password);
            System.out.println("==================연동성공==================");

            //[연동 이후 DML (select insert update delete) 실행하기 ]
            String sql = "insert into buy values(null, 'BLK', '지갑', NULL,30,10)";   //실행 sql 문법 문자열로 작성한다.
            PreparedStatement ps= conn.prepareStatement(sql); // .prepareStatement(sql)
           int count = ps.executeUpdate();//기재된 sql 실행 후 반영된 레코드 수 반환
            System.out.println("등록된 레코드는  : "+ count + "개 입니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 클래스 호출 실패"); //드라이버  클래스 연동 실패
        }//라이브러리 추가를 안했거나, forName안에 있는 철자가 틀렸거나
        catch (SQLException e) {
            System.out.println(" 등록된 DB 서버로 연동 실패" + e);
        }


    }
}
