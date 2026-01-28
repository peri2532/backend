package day07;
// [문제 1]
class Member {
    private String id;

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }
}

// [문제 2]
class Score {
    private int score;

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("유효하지 않은 점수입니다.");
        }
    }
}

// [문제 3]
class BankAccount {
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() { return accountNumber; }
}

// [문제 4]
class CircleCalculator {
    final double PI = 3.14159;

    public void printCircleArea(int radius) {
        double area = radius * radius * PI;
        System.out.println("반지름 " + radius + "인 원의 넓이: " + area);
    }
}

// [문제 5]
class TicketMachine {
    static int totalTickets = 0;

    public void issueTicket() {
        totalTickets++;
        System.out.println("티켓 1장을 발권했습니다.");
    }

    public static void printTotalTickets() {
        System.out.println("현재까지 발권된 총 티켓 수: " + totalTickets);
    }
}

// [문제 6]
class GameConfig {
    public static final int MAX_LEVEL = 99;
    public static final int MAX_HP = 10000;
    public static final String GAME_TITLE = "My RPG";
}

public class Project10 {
    public static void main(String[] args) {
        System.out.println("=== [문제 1: Member] ===");
        Member m = new Member();
        m.setId("admin");
        System.out.println("아이디: " + m.getId());

        System.out.println("\n=== [문제 2: Score] ===");
        Score s = new Score();
        s.setScore(85);
        s.setScore(120);

        System.out.println("\n=== [문제 3: BankAccount] ===");
        BankAccount account = new BankAccount("123-456");
        System.out.println("계좌번호: " + account.getAccountNumber());

        System.out.println("\n=== [문제 4: CircleCalculator] ===");
        CircleCalculator calc = new CircleCalculator();
        calc.printCircleArea(5);

        System.out.println("\n=== [문제 5: TicketMachine] ===");
        TicketMachine m1 = new TicketMachine();
        TicketMachine m2 = new TicketMachine();
        m1.issueTicket();
        m1.issueTicket();
        m2.issueTicket();
        TicketMachine.printTotalTickets();

        System.out.println("\n=== [문제 6: GameConfig] ===");
        // 객체 생성 없이 클래스명으로 바로 접근
        System.out.println("게임 제목: " + GameConfig.GAME_TITLE);
        System.out.println("최대 레벨: " + GameConfig.MAX_LEVEL);
    }
}