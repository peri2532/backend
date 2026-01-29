package 종합.예제3;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {

        // [1] Board 클래스 선언
        // [2] Board 객체 여러개 저장 = 배열
        Board[ ] boards = new Board[ 100 ]; // 총 100 객체 저장 가능
        for( ; ; ){
            System.out.println("========== My Community =========== "); // [3]출력
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("=================================== ");
            System.out.print("선택>");
            Scanner scan = new Scanner( System.in ); // [4]입력객체
            int ch = scan.nextInt(); // 입력받기
            if( ch == 1 ){ // [5] 조건문 , 입력받은 값이 1 이면
                scan.nextLine();
                System.out.print("내용 : ");    String content = scan.nextLine();
                System.out.print("작성자 : ");   String name = scan.nextLine();
                Board 생성한게시물 = new Board();// [6] 객체 만들기
                생성한게시물.내용 = content;     생성한게시물.작성자 = name; // [7] 생성한 객체에 입력받은 값 대입
                // [8] 생성한 객체를 배열에 저장 . push 없으므로 직접
                boolean check = false; // true:저장성공 , false : 저장실패
                for( int index = 0 ; index <= boards.length-1; index++ ){
                    if( boards[index] == null ){ // 만약에 index번째 요소가 비어있으면
                        boards[index] = 생성한게시물; // 생성한 객체를 비어있는 index번째 요소에 대입
                        check = true; break; // 반복문 종료
                    }
                } // for end
                if( check == true ){ System.out.println("[안내] 글쓰기 성공 "); }
                else{System.out.println("[경고] 게시물을 등록할 공간이 부족합니다. "); }
                // ******** 지역변수란? { } 안에서 선언(태어)한 변수는 } 끝나면 사라진다.
            }else if( ch == 2 ){ // 2 이면

                for( int index = 0 ; index <= boards.length - 1 ; index++ ){
                    Board 게시물 = boards[index]; // index번째 객체(게시물) 꺼내기
                    if( 게시물 != null ){ // 해당 게시물이 비어있지 않으면
                        System.out.print("작성자 : " + 게시물.작성자 );
                        System.out.println("  내용 : " + 게시물.내용 );
                        System.out.println("--------------------------------");
                    }
                } // for end

            } // if end
        } // for end
    } // main end
} // class end