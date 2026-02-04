package day08;

import java.util.ArrayList;

public class Practice11 {
    public static void main(String[] args) {
        // [문제 1] ArrayList< 항목타입 > 변수명 = new ArrayList<>(); , .add(새로운값)
        ArrayList< String > nameList = new ArrayList<>();
        nameList.add( "유재석" );  nameList.add( "강호동" );  nameList.add( "신동엽" );
        System.out.println("nameList = " + nameList); // [유재석, 강호동, 신동엽]
        // [문제 2] 일반반복문 과 리스트  , .get(인덱스)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for( int index = 0 ; index <= fruits.size() - 1 ; index++ ){
            System.out.printf( "인덱스 %d : %s \n" , index , fruits.get( index ) );
        }
        // [문제 3] 향상된반복문 과 리스트 , for( 항목타입 반복변수명 : 리스트변수명 ) { }
        for( String str : fruits ){ System.out.println("str = " + str); }
        // [문제 4] .remove( 인덱스 )
        ArrayList< String > list1 = new ArrayList<>();
        list1.add( "A"); list1.add( "B"); list1.add( "C"); list1.add( "D"); list1.add( "E");
        list1.remove( 2 ); // 2번 인덱스인 "C" 요소 삭제
        System.out.println("list1 = " + list1); //  [A, B, D, E]

        //[문제 5] .add( 인덱스 , 새로운값 )
        ArrayList<String> list2 = new ArrayList<>();
        list2.add( "자바");       list2.add( "파이썬");       list2.add( "C++");
        list2.add( 1 , "자바스크립트");
        System.out.println("list2 = " + list2); // list2 = [자바, 자바스크립트, 파이썬, C++]
        // [문제6]
        ArrayList< Book > library = new ArrayList<>();
        library.add( new Book( "책제목1" , "저자1") );   library.add( new Book( "책제목2" , "저자2") );
        library.add( new Book( "책제목3" , "저자3") );
        for( Book book : library ){ // for( 항목타입 반복변수명 : 리스트변수명 ){ }
            System.out.println("book = " + book);
        }
        //[문제7]
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        while (true) {
            System.out.print("문자열 입력 (종료 입력 시 멈춤): ");
            String input = scanner.nextLine();

            if (input.equals("종료")) { // 입력값이 "종료"이면 반복문 탈출
                break;
            }
            inputList.add(input); // 리스트에 추가
        }
        System.out.println("저장된 내용: " + inputList);
        //[문제8]
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("국어");
        subjects.add("수학");
        subjects.add("사회");
        subjects.add("과학");
        subjects.set(1, "영어");
        System.out.println("수정 후 리스트: " + subjects);
    } // main end
} // class end
class Book{
    private String title;  private String author; // 멤버변수
    public Book(String title, String author) { this.title = title; this.author = author; } // 생성자
    @Override  public String toString() { // toString
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

/*[문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
1. 입력받은 문자열은 ArrayList에 순서대로 저장합니다.
2. 만약 사용자가 "종료" 라는 단어를 입력하면, 입력을 멈추고 그때까지 리스트에 저장된 모든 내용을 출력한 뒤 프로그램을 종료하세요.*/

/*[문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
1. .set(인덱스, 요소) 메소드를 사용하여 1번 인덱스의 "수학"을 "영어"로 수정하세요.
2. 수정 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.*/