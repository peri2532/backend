package 종합.예제2;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        // [1] 메모리 설계 , 1) 2개 정보를 가진 게시물이 3개 이면 변수는 총 6개 갖는다.
        // 2) 2개 정보를 가진 게시물이 100개 이면 변수는 총 200개 갖는다. --> 관리 어렵기 때문에 -> 배열 사용
        String[ ] contents = new String[ 100 ]; // 제목100개  , 각 요소는 객체타입 이므로 null 초기값 갖는다.
        String[ ] writers = new String[ 100 ]; // 작성자100개 , { null , null , null ~~ }
        // [2] 무한루프
        for( ; ; ){
            System.out.println("========= My Community ========="); // 출력
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("================================");
            System.out.print("선택> ");Scanner scan = new Scanner( System.in); // 입력
            int ch = scan.nextInt();
            if( ch == 1 ){      // 제어문/코드의 흐름(경우의수) 판단한다.
                scan.nextLine();
                System.out.print("내용 : ");      String content = scan.nextLine(); // 입력
                System.out.print("작성자 : ");     String writer = scan.nextLine();
                boolean save = false; // 저장했다 true , 저장못했다 false;
                for( int index = 0 ; index <= contents.length-1 ; index++ ){
                    if( contents[index] == null && writers[index] == null ){ // index번째 요소값이 비어있으면
                        contents[index] = content;      writers[index] = writer; // 입력받은 값들을 index번째 대입한다.
                        save = true; break; // 저장 성공시 save에 true 대입후 반복문 종료
                    }
                } // for end
                if( save == true ){  System.out.println("[안내] 글쓰기 성공 "); }
                else{  System.out.println("[경고]게시물을 등록할 공간이 부족합니다."); }

            }else if( ch == 2 ){
                for( int index = 0 ; index <= contents.length-1; index++  ){ // 배열 순회
                    if( contents[index] != null && writers[index] !=null ) { // 만약에 index번째 요소값이 비어있지 않으면
                        System.out.printf("작성자 : %s , 내용 : %s \n", contents[index], writers[index]);
                    } // if end
                } // for end
            } // else if end
        } // for end
    } // main end
} // class end