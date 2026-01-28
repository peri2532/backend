package day07;

public class Phone {
    // 1. 멤버변수 - 속성
    String model;
    String color;
    int price;
    // 2. 생성자
    // 1. 클래스명 동일하게 생성자명 작성한다.
    Phone(  ){ }
    // 2. ( ) 안에 매개변수 정의한다.
    // 3. 메소드 와 다른점은 반환타입 없다.
    Phone( String model , String color  ){
        this.model = model;
        this.color = color;
    }
    // 4.
    Phone( String model , String color , int price ){
        this.model = model;
        this.color = color;
        this.price = (int)(price * 0.8); // 20%할인
    }

    // 3. 메소드 - 멤버함수

}