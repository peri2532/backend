package day06;

public class Practice8 {
    public static void main(String[] args) {

        // [1] Printer
        Printer printer = new Printer();
        printer.printMessage();

        // [2] Greeter
        Greeter greeter = new Greeter();
        greeter.greet("유재석");

        // [3] SimpleCalculator
        SimpleCalculator c = new SimpleCalculator();
        int result3 = c.add(3, 5);
        System.out.println("result3 = " + result3);

        // [4] Checker
        Checker checker = new Checker();
        boolean result4 = checker.isEven(3);
        System.out.println(result4 ? "짝수입니다." : "홀수입니다.");

        // [5] Lamp
        Lamp lamp = new Lamp();
        lamp.turnOn();
        System.out.println("lamp.isOn (after turnOn) = " + lamp.isOn);
        lamp.turnOff();
        System.out.println("lamp.isOn (after turnOff) = " + lamp.isOn);

        // [6] Product
        Product p1 = new Product();
        p1.stock = 10; // 초기 재고 설정
        boolean result6 = p1.sell(15);
        System.out.println("result6 = " + result6);

        // [7] Visualizer 실습 추가
        Visualizer visualizer = new Visualizer();
        String stars = visualizer.getStars(5);
        System.out.println("getStars(5) 결과: " + stars);

        // [8] ParkingLot 실습 추가
        ParkingLot lot = new ParkingLot();
        System.out.println("65분 요금: " + lot.calculateFee(65) + "원");
        System.out.println("140분 요금: " + lot.calculateFee(140) + "원");
        System.out.println("500분 요금: " + lot.calculateFee(500) + "원 (최대 요금 확인)");

    } // main end
}

// --- 클래스 정의 구역 ---

class Printer {
    void printMessage() {
        System.out.println("안녕하세요, 메소드입니다.");
    }
}

class Greeter {
    void greet(String 이름) {
        System.out.println("안녕하세요 " + 이름 + "님!");
    }
}

class SimpleCalculator {
    int add(int 정수1, int 정수2) {
        return 정수1 + 정수2;
    }
}

class Checker {
    boolean isEven(int 정수) {
        return 정수 % 2 == 0;
    }
}

class Lamp {
    boolean isOn;
    void turnOn() { isOn = true; }
    void turnOff() { isOn = false; }
}

class Product {
    String name;
    int stock = 10;
    boolean sell(int 구매수량) {
        if (stock >= 구매수량) {
            stock -= 구매수량;
            return true;
        } else {
            System.out.println("재고 부족");
            return false;
        }
    }
}

// [문제 7] Visualizer
class Visualizer {
    String getStars(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "★";
        }
        return result;
    }
}

// [문제 8] ParkingLot
class ParkingLot {
    int calculateFee(int minutes) {
        int fee = 0;

        if (minutes <= 30) {
            fee = 1000;
        } else {

            fee = 1000;
            int extraTime = minutes - 30;
            fee += ((extraTime + 9) / 10) * 500;
        }
        if (fee > 20000) {
            fee = 20000;
        }

        return fee;
    }
}