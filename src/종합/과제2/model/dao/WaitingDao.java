package 종합.과제2.model.dao;
import java.util.ArrayList;
import 종합.과제2.model.dto.WaitingDto;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    // 데이터베이스 역할을 하는 ArrayList <추후 삭제>
    private static final ArrayList<WaitingDto>waitings = new ArrayList<>();

    private  static int currentNo =1;

    public boolean doPost(String number , int person){
        WaitingDto waitingDto = new WaitingDto(currentNo , number , person);

        boolean result = waitings.add(WaitingDto);
        currenNo++;
        return result;
    }
    public ArrayList<WaitingDto>doGet(){
        return waitings;
    }
}
