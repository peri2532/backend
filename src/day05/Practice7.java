package day05;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        // ---------------- [1] Book ----------------
        Book book1 = new Book();
        book1.title ="이것이 자바다";
        book1.author = "신용권";
        book1.price = 30000;

        Book book2 = new Book();
        book2.title="자바의 정석";
        book2.author="남궁성";
        book2.price = 28000;

        System.out.println(book1.title + " " + book1.author + " " + book1.price);
        System.out.println(book2.title + " " + book2.author + " " + book2.price);

        // ---------------- [2] Pet ----------------
        Pet pet1 = new Pet();
        pet1.name = "초코"; pet1.species ="푸들"; pet1.age = 3;

        Pet pet2 = new Pet();
        pet2.name = "나비"; pet2.species = "코리안숏헤어"; pet2.age = 5;

        System.out.printf("이름: %s, 종류: %s, 나이: %d살\n", pet1.name, pet1.species, pet1.age);
        System.out.printf("이름: %s, 종류: %s, 나이: %d살\n", pet2.name, pet2.species, pet2.age);

        // ---------------- [3] Rectangle ----------------
        Rectangle rect1 = new Rectangle();
        rect1.width = 10;
        rect1.height = 5;

        System.out.println("사각형의 넓이: " + (rect1.width * rect1.height));

        // ---------------- [4] BankAccount ----------------
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "111-222-3333";
        account1.ownerName = "유재석";
        account1.balance = 10000;

        account1.balance += 5000;
        System.out.println("입금 후 잔액: " + account1.balance);

        account1.balance -= 3000;
        System.out.println("출금 후 잔액: " + account1.balance);

        // ---------------- [5] Product ----------------
        Product product1 = new Product();
        product1.name = "새우깡";
        product1.price = 1500;

        Product product2 = new Product();
        product2.name = "콜라";
        product2.price = 2000;

        if(product1.price > product2.price){
            System.out.println(product1.name);
        }else{
            System.out.println(product2.name);
        }

        // ---------------- [6] Member ----------------
        Member member1 = new Member();
        member1.id = "admin";
        member1.isLogin = false;

        System.out.println("로그인 전 상태: " + member1.isLogin);
        member1.isLogin = true;
        System.out.println("로그인 후 상태: " + member1.isLogin);

        // ---------------- [7] Television ----------------
        Television television1 = new Television();
        television1.channel = 7;
        television1.volume = 20;

        television1.channel = 11;
        television1.volume -= 2;

        System.out.println("변경된 채널: " + television1.channel);
        System.out.println("변경된 볼륨: " + television1.volume);

        // ---------------- [8] Player ----------------
        Player player1 = new Player();
        player1.name = "손흥민";
        player1.power = 90;
        player1.speed = 95;

        Player player2 = new Player();
        player2.name = "이강인";
        player2.power = 85;
        player2.speed = 92;

        int sum1 = player1.power + player1.speed;
        int sum2 = player2.power + player2.speed;

        if(sum1 > sum2){
            System.out.println(player1.name);
        }else{
            System.out.println(player2.name);
        }

        // ---------------- [9] MenuItem ----------------
        MenuItem menu1 = new MenuItem();
        menu1.name = "김치찌개";
        menu1.price = 8000;
        menu1.isSignature = true;

        MenuItem menu2 = new MenuItem();
        menu2.name = "된장찌개";
        menu2.price = 8000;
        menu2.isSignature = false;

        MenuItem menu3 = new MenuItem();
        menu3.name = "계란찜";
        menu3.price = 3000;
        menu3.isSignature = false;

        if(menu1.isSignature){
            System.out.println("[대표메뉴] " + menu1.name + " : " + menu1.price + "원");
        }
        if(menu2.isSignature){
            System.out.println("[대표메뉴] " + menu2.name + " : " + menu2.price + "원");
        }
        if(menu3.isSignature){
            System.out.println("[대표메뉴] " + menu3.name + " : " + menu3.price + "원");
        }

        // ---------------- [10] UserProfile ----------------
        Scanner scan = new Scanner(System.in);

        UserProfile user = new UserProfile();

        System.out.print("이름 입력: ");
        user.name = scan.next();

        System.out.print("나이 입력: ");
        user.age = scan.nextInt();

        System.out.print("MBTI 입력: ");
        user.mbti = scan.next();

        System.out.println("--- 프로필 ---");
        System.out.println("이름: " + user.name);
        System.out.println("나이: " + user.age);
        System.out.println("MBTI: " + user.mbti);

    }
}
