package day07;

// [문제 1]
class Member10 {
    private String id;

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }
}

// [문제 2]
class Score10 {
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
class BankAccount10 {
    private String accountNumber;

    public BankAccount10(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() { return accountNumber; }
}

// [문제 4]
class CircleCalculator10 {
    final double PI = 3.14159;

    public void printCircleArea(int radius) {
        double area = radius * radius * PI;
        System.out.println("반지름 " + radius + "인 원의 넓이: " + area);
    }
}

// [문제 5]
class TicketMachine10 {
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
class GameConfig10 {
    public static final int MAX_LEVEL = 99;
    public static final int MAX_HP = 10000;
    public static final String GAME_TITLE = "My RPG";
}

public class Project10 {
    public static void main(String[] args) {
        System.out.println("=== [문제 1: Member] ===");
        Member10 m = new Member10(); // 클래스명 Member10과 일치
        m.setId("admin");
        System.out.println("아이디: " + m.getId());

        System.out.println("\n=== [문제 2: Score] ===");
        Score10 s = new Score10();
        s.setScore(85);
        s.setScore(120);

        System.out.println("\n=== [문제 3: BankAccount] ===");
        BankAccount10 account = new BankAccount10("123-456");
        System.out.println("계좌번호: " + account.getAccountNumber());

        System.out.println("\n=== [문제 4: CircleCalculator] ===");
        CircleCalculator10 calc = new CircleCalculator10();
        calc.printCircleArea(5);

        System.out.println("\n=== [문제 5: TicketMachine] ===");
        TicketMachine10 m1 = new TicketMachine10();
        TicketMachine10 m2 = new TicketMachine10();
        m1.issueTicket();
        m1.issueTicket();
        m2.issueTicket();
        TicketMachine10.printTotalTickets();

        System.out.println("\n=== [문제 6: GameConfig] ===");
        System.out.println("게임 제목: " + GameConfig10.GAME_TITLE);
        System.out.println("최대 레벨: " + GameConfig10.MAX_LEVEL);
    }
}