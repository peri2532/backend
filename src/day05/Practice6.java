package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {

        // [1]
        // int [ ] numbers1 = new int[5]; // (1) 배열 '선언'만
        int [ ] numbers1 = { 10, 20, 30, 40, 50 }; // (2) 배열 '선언' '초기화'
        System.out.println( numbers1[2] ); // (3) 배열변수명[인덱스]

        // [2]
        String[ ] season = new String[3];   // (1) 배열 '선언' 만
        season[0] = "봄";    season[1] = "여름";   season[2] = "가을"; // (2) 각 인덱스의 요소/값 대입, push기능 없다.
        System.out.println( Arrays.toString( season ) ); // (3) 배열변수 내 모든 요소 출력

        // [3]
        String[] fruits = {"사과", "바나나", "포도", "딸기"};
        for( int index = 0; index <= fruits.length - 1 ; index++ ){ System.out.println( fruits[index] ); }
        // 일반FOR vs 향상된FOR
        for( String fruit : fruits ){ System.out.println( fruit ); }

        // [4]
        int[] scores1 = {85, 92, 78, 65, 95};
        int sum = 0; // 합계 변수
        for( int index = 0 ; index <= scores1.length - 1 ; index++ ){
            sum += scores1[index]; // index번째 요소값을 누적합계
        } // for end
        System.out.printf("합계 : %d , 평균 : %f \n" , sum , sum / (double)scores1.length ); // 5 -> 5.0 <강제타입변환>
        // [5]
        int[] scores2 = {77, 82, 100, 54, 96};
        for( int score : scores2 ){ // vs for( int index = 0 ; index <= scores2.length - 1 ; index++ ){ }
            if( score == 100 ) {
                System.out.println("만점자가 나타났다."); break;
            }
        }
        // [6]
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int count = 0;
        for( String blood : bloodTypes ){ // 향상된 for문
            if( blood.equals( "A") ){  count++; }  // 문자열 비교는 == 아니고 .equals
        }
        System.out.println("A형 : " + count + "명");

        // [7]
        int[] numbers2 = {23, 5, 67, 12, 88, 34};
        int max = 0;
        for( int value : numbers2 ){ // 향상된 for문
            if( max < value ){  max = value; } // max 보다 index번째 요소값이 더 크면 대입
        }
        System.out.println("max = " + max); // soutv 자동완성
        // [8]
        String[] products = {"볼펜", "노트", "지우개"};        int[] stock = {10, 5, 20};
        Scanner scan = new Scanner(System.in); // 제품명과 재고 입력받아
        System.out.print("제품명 : ");         String productName = scan.next();
        System.out.print("구매수량 : ");        int stockCount =scan.nextInt();
        int check = 0; // 0 이면 '제품없다' 뜻 <임의>
        for( int index = 0 ; index <= products.length-1 ; index++ ){
            if( products[index].equals( productName ) ){ // 만약에 index번째 제품명과 입력받은 제품명과 같으면
                if( stock[index] >= stockCount ){ // 만약에 index번째 재고가 입력받은 재고보다 이상이면
                    stock[index] -= stockCount; // 입력받은 재고 만큼 index번째 재고 차감한다.
                    check = 1 ; break; // 1 이면 '구매완료' 뜻
                } // if end
                else { check = 2; break;  } // 2 이면 '재고부족' 뜻
            } // if end
        } // for end
        if( check == 0 ){ System.out.println("없는 제품 입니다.");  } // for 밖에서(끝나고) 제품없음 출력한다.
        else if( check == 1 ){ System.out.println("구매 완료");  }
        else if( check == 2 ){ System.out.println("재고 부족");  }

        //[9]
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};
        for( int index = 0 ; index <= movieNames.length-1 ; index++ ){ // 1) 0부터 마지막인덱스 이하까지 1씩증가
            String movie = movieNames[index]; // 2) index번째 영화이름 가져오기
            System.out.print( movie ); // print : 줄바꿈 안됨.
            for ( int star = 1 ; star <= 10 ; star++ ){ // 3) 총 10개의 별 반복
                if( star <= movieRatings[index] ){ // 4) 만약에 현재 별 순서가 평점보다 이하이면
                    System.out.print("★"); // 검은별
                }else{   System.out.print("☆"); } //  // 아니면  흰별
            }
            System.out.println(); // index가 바뀔때마다 줄바꿈
        } // for end

        // [10]
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
        int[] usageMinutes = {65, 30, 140, 420};
        int money = 0; // 1) money 요금 변수 선언
        for( int index = 0 ; index <= carNumbers.length-1 ; index++ ){
            String car = carNumbers[index]; // index번째 차량번호 추출
            System.out.print( car+" \t " );
            int useTime = usageMinutes[index]; // index번째 사용시간 추출
            if( useTime <= 30 ){ money = 1000; }
            else{
                money = ( useTime - 30 ) / 10 ; // 사용시간 나누기 10분
                money *= 5000; // 10분당 5000원
                money += 1000; // 기본요금 1000원
            }
            // 만약에 금액이 2만원 이상이면 2만원 아니면 금액그대로
            money = money > 20000 ? 20000 : money;
            System.out.println( useTime+"분 주차 , 요금 : "+money+"원");
        } // for end



    } // main end
}


/*[실습] * 제출용 */

/*[문제 1] 정수 5개(10, 20, 30, 40, 50)를 저장할 수 있는 int 타입의 배열 numbers1를 선언과 동시에 초기화하세요.
배열의 2번 인덱스에 저장된 값을 콘솔에 출력하세요.*/

/*[문제 2] String 타입의 데이터를 3개 저장할 수 있는 배열 season을 new 키워드를 사용하여 생성하세요.
각 인덱스에 "봄", "여름", "가을" 값을 순서대로 할당하세요.
Arrays.toString()을 사용하여 배열의 모든 요소를 한 번에 출력하세요.*/

/*[문제 3] 다음과 같은 과일 배열이 있습니다. for 반복문을 사용하여 배열의 모든 요소를 하나씩 콘솔에 출력하시오.
선언 코드: String[] fruits = {"사과", "바나나", "포도", "딸기"};*/

/*[문제 4] 다음 학생들의 점수가 담긴 배열이 있습니다. for 반복문을 사용하여 모든 점수의 합계와 평균을 계산하여 콘솔에 출력하시오.
요구 조건: 평균은 소수점까지 정확하게 계산되어야 합니다.
선언 코드: int[] scores1 = {85, 92, 78, 65, 95};*/

/*[문제 5] 점수 배열에서 100점 만점자가 처음 나타나면, "100점 만점자를 찾았습니다!"라고 출력하고 반복문을 즉시 종료하는 프로그램을 작성하시오.
선언 코드: int[] scores2 = {77, 82, 100, 54, 96};*/

/*[문제 6] 다음 배열에서 'A'형 혈액형을 가진 사람이 몇 명인지 for 반복문을 통해 세고, 그 수를 콘솔에 출력하시오.
선언 코드: String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};*/

/*[문제 7] 주어진 숫자 배열에서 가장 큰 값을 찾아 콘솔에 출력하는 프로그램을 작성하시오.
선언 코드: int[] numbers2 = {23, 5, 67, 12, 88, 34};*/

/*[문제 8] products(상품 목록)와 stock(재고 수량) 배열이 있습니다. (*상품명과 재고수량 인덱스가 같다는 가정 )
Scanner를 이용해 사용자로부터 구매할 상품명과 수량을 입력받아, 재고가 충분하면 "구매 완료!"를 출력하고 재고를 차감하세요.
재고가 부족하면 "재고가 부족합니다."를, 없는 상품이면 "없는 제품명입니다."를 출력합니다.
선언 코드:
String[] products = {"볼펜", "노트", "지우개"};
int[] stock = {10, 5, 20};*/

/*[문제 9] 주어진 영화 이름과 평점 배열을 이용하여, 각 영화의 평점을 별(★, ☆)로 시각화하여 출력하는 프로그램을 작성하시오.(* 영화명과 평점 인덱스가 같다는 가정 )
요구 조건: 각 영화의 평점(10점 만점)만큼 꽉 찬 별(★)을, 나머지 점수만큼 빈 별(☆)을 출력합니다.
예시: 평점이 8점이면 ★★★★★★★★☆☆ (총 10개의 별)
선언 코드:
String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
int[] movieRatings = {8, 4, 7, 6};
출력 예시:
히든페이스 ★★★★★★★★☆☆
위키드 ★★★★☆☆☆☆☆☆
글래디에이터2 ★★★★★★★☆☆☆
청설 ★★★★★★☆☆☆☆*/

/*[문제 10] 차량별 주차 시간 데이터가 주어졌을 때, 아래의 요금 규정에 따라 각 차량이 지불해야 할 최종 주차 요금을 계산하여 출력하시오.(* 차량번호 와 이용시간 인덱스가 같다는 가정 )
요금 규정:
기본 요금: 최초 30분까지 1,000원
추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
일일 최대 요금: 20,000원 (아무리 오래 주차해도 20,000원을 초과할 수 없음)
선언 코드:
String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
int[] usageMinutes = {65, 30, 140, 420};
출력 예시:
210어7125: 65분 주차, 최종 요금: 2500원
142가7415: 30분 주차, 최종 요금: 1000원
888호8888: 140분 주차, 최종 요금: 6500원
931나8234: 420분 주차, 최종 요금: 20000원*/