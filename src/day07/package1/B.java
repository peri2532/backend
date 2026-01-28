package day07.package1;

public class B {
    public void 메소드(){
        // ==== 다른 클래스 : 접근제한자 의미 유 ===
        A a = new A();
        System.out.println("a.공개변수 = " + a.공개변수); // ok
        // System.out.println("a.비공개변수 = " + a.비공개변수);//error
        System.out.println("a.일반변수 = " + a.일반변수); // ok
        a.메소드(); // pk
        //a.비공개메소드(); // error

    }
}