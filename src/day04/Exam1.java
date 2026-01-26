package day04;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {

        // [1] 반복문을 이용한 1부터 5까지 출력
        // 자바에서는 변수 타입(int)을 반드시 명시해야 합니다.
        for(int 출력값 = 1; 출력값 <= 5; 출력값++){
            System.out.println(출력값);
        }

        System.out.println("--------------------");

        // [2] 중첩 for문을 이용한 구구단 (2단 ~ 9단)
        for (int 단 = 2; 단 <= 9; 단++){
            System.out.println("--- " + 단 + "단 ---");
            for (int 곱 = 1; 곱 <= 9; 곱++){
                // printf를 사용하면 포맷에 맞춰 깔끔하게 출력 가능합니다.
                System.out.printf("%d * %d = %d \n", 단, 곱, 단 * 곱);
            }
        }

        System.out.println("--------------------");

        // [3] break와 continue의 차이점

        // break: i가 3이 되는 순간 반복문 전체를 즉시 종료 (1, 2만 출력)
        System.out.println("break 예시:");
        for(int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }

        // continue: i가 3일 때만 아래 코드를 건너뛰고 다음 반복(i=4)으로 이동 (1, 2, 4, 5 출력)
        System.out.println("continue 예시:");
        for(int i = 1; i <= 5; i++){
            if(i == 3) continue;
            System.out.println(i);
        }

        // [4] 무한 루프와 Scanner 활용
        Scanner scanner = new Scanner(System.in); // 스캐너 객체는 루프 밖에서 한 번 생성
        for( ; ; ){
            System.out.print("무한입력 [종료: 'x']: ");
            String input = scanner.next();
            if(input.equals("x")){
                System.out.println("종료합니다.");
                break; // 'x' 입력 시 가장 가까운 반복문 탈출
            }
        }
        scanner.close(); // 사용이 끝난 스캐너는 닫아주는 것이 좋습니다.
    }
}