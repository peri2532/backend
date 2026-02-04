package 종합.콘솔기반도서관리시스템.model.dao;

import java.util.ArrayList;

public class BookDao {
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){return instance; }

    private ArrayList<MemberDto> members = new ArrayList<>();

    private int cuurentNo = 1;

    public boolean signup(String bid, String bpw, String bname, String bphone){
        System.out.println("MemberDao.signup");
        System.out.println("mid = " + mid );
    }
}
