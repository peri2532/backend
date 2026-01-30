package 종합.과제2.view;
import 종합.과제2.controller.WaitingController;
import 종합.과제2.model.dto.WaitingDto;
import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    private WaitingController wc = WaitingController.getInstance();

    private Scanner scanner = new Scanner(System.in);

    public void indexView() {
        for (; ; ) {
            System.out.println("========== 맛집 대기 시스템 ==========");
            System.out.println("1.대기 등록 | 2. 대기 현황");
            System.out.println("======================================");
            System.out.println("선택>");
            int ch = scanner.nextInt();
            if (ch == 1) {
                writeView();
            } else if (ch == 2) {
                printView();
            }
        }
    }
    public void writeView(){
        scanner.nextLine();
        System.out.println("전화번호 : "); String number = scanner.nextLine();
        System.out.println("인원 수 : "); int person = scanner.nextInt();

        boolean result = wc.doPost(number,person);

        if(result){System.out.println("[안내] 대기 등록 완료");}
        else{System.out.println("[안내] 대기 등록 실패");}
    }
    public void printView(){
    ArrayList<WaitingDto> waitings = wc.doGet();

    for(WaitingDto waiting : waitings){
        System.out.println("번호 : %d , 전화번호 : %s , 인원 수: %d \n",
                waiting.getNo(),waiting.getNumber(), waiting.getPerson());

        }
    }
}

