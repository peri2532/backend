package day07;

public class Practice9 {
    public static void main(String[] args) {

        // [문제1]
        Book book1 = new Book( "이것이 자바다" , "신용권" , 30000 ); // 주의할점 : 다른 패키지의 Book 클래스와 구분
        Book book2 = new Book( "자바의 정석" , "남궁성" , 28000 );  // new 생성자명( 인수1 , 인수2 )
        System.out.println( book1.title + book1.author + book1.price );
        System.out.println( book2.title + book2.author + book2.price );

        // [문제2]
        Rectangle rectangle = new Rectangle( 10 , 5 ); // 생성자
        System.out.println( rectangle.getArea() );  // 메소드

        // 문제3]
        BankAccount  account
                = new BankAccount( "111-222-3333" , "유재석",10000);
        account.deposit( 5000 );
        int result = account.withdraw( 3000 );
        System.out.println("result = " + result);

        // [문제4]
        Goods goods1 = new Goods(); // 기본생성자
        Goods goods2 = new Goods( "콜라" , 2000 );
        System.out.println("goods1.name = " + goods1.name);
        System.out.println("goods2.name = " + goods2.name);

        // [문제5]
        Member member = new Member();
        System.out.println("member.id = " + member.id);
        System.out.println("member.isLogin = " + member.isLogin);





    } // main end
}
class Member{ // [문제5]
    String id; // 멤버변수
    boolean isLogin;
    // 기본생성자
    Member(){
        this.id = "guest";
        this.isLogin = false;
    }
}
class Goods{ // [문제4]
    String name; // 멤버변수
    int price;
    // 1. 기본생성자
    Goods( ){
        this.name = "미정";
        this.price = 0;
    }
    // 2. 일반생성자
    Goods( String name , int price ){ // 오버로드 : 동일한 생성자명으로 매개변수에 따라 여러개 선언
        this.name = name;
        this.price = price;
    }
}
class BankAccount{ // [문제3]
    // 멤버변수
    String accountNumber;
    String ownerName;
    int balance;
    // 생성자 : 해당 클래스{ } 안에서 빈공간을 오른쪽 클릭 -> 생성 -> 생성자
    BankAccount(  String accountNumber , String ownerName , int balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    int deposit( int 입금액 ){// 메소드1 : 입금
        balance = balance + 입금액;
        return balance; // <---- balance 변수는 int타입으로 선언됨
    }
    // 메소드2 : 출금
    int withdraw( int 출금액){
        balance = balance - 출금액;
        return balance;
    }
}

class Rectangle{ // [문제2]
    int width; int height; // 멤버변수
    Rectangle( int width , int height ){ // 생성자
        this.width = width;
        this.height = height;
    }
    int getArea() {// 메소드
        return  this.width * this.height; // int * int -> int
    }
}
class Book{ // [문제1]
    // 멤버변수 = 속성
    String title; String author; int price;
    // 생성자 = 객체 초기화/만들때/생성할때 사용되는 메소드
    Book( String title, String author , int price ){
        this.title = title;
        this.author = author;
        this.price = price;
    } // 클래스내 오른쪽 마우스오른쪽 (빈공간)클릭 -> 생성 -> 생성자 -> 매개변수선택(복수) -> 확인
}

/*[실습] * 제출용 */

/*[문제 1] Book 클래스를 만드세요. (title, author, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Book 클래스에 title, author, price를 매개변수로 받아 멤버 변수를 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("이것이 자바다", "신용권", 30000) 정보와 ("자바의 정석", "남궁성", 28000) 정보를 가진 Book 객체 2개를 생성하고, 각 객체의 정보를 출력하세요.*/

/*[문제 2] Rectangle 클래스를 만드세요. (width, height 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. width와 height를 매개변수로 받아 초기화하는 생성자를 만드세요.
2. 사각형의 넓이(width * height)를 계산하여 반환하는 getArea() 메소드를 만드세요.
3. main 함수에서 (10, 5) 값을 가진 Rectangle 객체를 생성하고, getArea() 메소드를 호출하여 "사각형의 넓이: [넓이]"를 출력하세요.*/

/*[문제 3] BankAccount 클래스를 만드세요. (accountNumber, ownerName, balance 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. 입금(deposit)과 출금(withdraw) 기능을 하는 메소드를 각각 만드세요.
3. main 함수에서 ("111-222-3333", "유재석", 10000) 정보로 객체를 생성한 뒤, 5000원을 입금하고 3000원을 출금한 후의 최종 잔액을 출력하세요.*/

/*[문제 4] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Goods 클래스에 생성자를 두 개 만드세요(오버로딩).
2. 기본 생성자: name은 "미정", price는 0으로 초기화
3. 매개변수가 있는 생성자: name과 price를 매개변수로 받아 초기화
4. main 함수에서 기본 생성자로 객체 하나, 매개변수가 있는 생성자로 ("콜라", 2000) 정보를 가진 객체 하나를 각각 생성하고, 두 객체의 정보를 모두 출력하세요.*/

/*[문제 5] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Member 클래스에 기본 생성자를 만들고, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화되도록 하세요.
2. main 함수에서 new Member()로 객체를 생성하고, 초기화된 id와 isLogin 값을 출력하여 확인하세요.*/