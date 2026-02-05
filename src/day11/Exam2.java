package day11;

public class Exam2 {
    // 메소드1 , throws 예외클래스명 : 해당 메소드에서 예외 발생시 메소드호출 했던곳으로 예외 전달
    public static void method1() throws NullPointerException {
        String str = null;
        System.out.println( str.length() ); // 예외발생 짐작!
    }
    // 메소드2
    public static void method2() throws ClassNotFoundException {
        Class.forName( "java.lang.String3"); // 일반예외
    }
    public static void main(String[] args) {
        // 예외처리 : try{}catch{}
        // 예외던저기(떠넘기기/전달) throws
        try{ method1(); } catch ( NullPointerException e ){ System.out.println(e); }
        try{ method2(); } catch ( ClassNotFoundException e ){System.out.println(e); }

    } // main end
} // class end