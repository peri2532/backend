package day10;

public class Practic13 {
    public static void main(String[] args) {
        //[문제 1] 다형성 특징: 상속(+객체) vs 인터페이스(-객체)
        Cat cat = new Cat();
        Dog dog = new Dog();

        Soundable soundable = cat;
        soundable.makeSound(); // "야옹"

        soundable = dog;
        soundable.makeSound(); // "멍멍"

        //문제 5
        Flyable flyable = new Duck(); // Duck 클래스가 flyable 구현했기 때문에 가능(다형성 : 타입변환 가능)
        Swimmable swimmable = new Duck(); //Duck 클래스가 Swimmable 구현했기 때문에 가능( 다형성 :  타입변환 가능)
        flyable.fly();
        swimmable.swimmable();

    }
}

interface Soundable {
    public abstract void makeSound(); // 추상 메소드
}

class Cat implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class Dog implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

//문제 5
interface Flyable{void fly();}
interface Swimmable{void swimmable();}

class Duck implements Flyable , Swimmable{ // 구현은 2개 이상 인터페이스 가능하다.

    @Override public void fly() {
        System.out.println("하늘을 납니다.");
    }
    @Override public void swimmable() {
        System.out.println("물에서 헤엄칩니다.");
    }
}