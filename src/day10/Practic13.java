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

        //문제 2
        System.out.println("최대 볼륨: "+ RemoteControl.MAX_VOLUME);
        System.out.println("최소 볼륨: "+ RemoteControl.MIN_VOLUME);

        //문제 3
        Runnable runner;
        runner = new Person();
        runner.run();
        runner = new Car();
        runner.run();

        //문제4
        Character character = new Character();
        Attackable sword = new Sword();
        Attackable gun = new Gun();
        character.useWeapon(sword);
        character.useWeapon(gun);
        //문제 5
        Flyable flyable = new Duck(); // Duck 클래스가 flyable 구현했기 때문에 가능(다형성 : 타입변환 가능)
        Swimmable swimmable = new Duck(); //Duck 클래스가 Swimmable 구현했기 때문에 가능( 다형성 :  타입변환 가능)
        flyable.fly();
        swimmable.swimmable();

        //문제 6
        Object obj = new Duck();

        if (obj instanceof Flyable) {
            ((Flyable) obj).fly();
        }

        if (obj instanceof Swimmable) {
            ((Swimmable) obj).swimmable();
        }
        //문제 7
        DataAccessObject dao;

        dao = new OracleDao();
        dao.save();

        dao = new MySqlDao();
        dao.save();
        //문제 8
        Greeting g = new Greeting() {
            public void welcome() {
                System.out.println("환영합니다.");
            }
        };

        g.welcome();
        //문제 9
        Device tv = new Television();
        tv.turnOn();
        tv.setMute(true);
        tv.turnOff();
        //문제 10
        int result = Calculator.plus(10, 20);
        System.out.println("합계: " + result);
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

//문제2
interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}

//문제 3
interface Runnable{
    void run();
}

class Person implements Runnable{
    public void run(){
        System.out.println("사람이 달립니다.");
    }
}
class Car implements Runnable{
    public void run(){
        System.out.println("자동차가 달립니다.");
    }
}
//문제 4
interface Attackable{
    void attack();
}
class Sword implements Attackable{
    public void attack(){
        System.out.println("칼로 공격");
    }
}

class Gun implements Attackable{
    public void attack(){
        System.out.println("총으로 공격!");
    }
}
class Character{
    void useWeapon(Attackable weapon){
        weapon.attack();
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
//문제7
interface DataAccessObject {
    void save();
}

class OracleDao implements DataAccessObject {
    public void save() {
        System.out.println("Oracle DB에 저장");
    }
}

class MySqlDao implements DataAccessObject {
    public void save() {
        System.out.println("MySQL DB에 저장");
    }
}
//문제8
interface Greeting {
    void welcome();
}
//문제9
interface Device {
    void turnOn();
    void turnOff();
    default void setMute(boolean mute) {
        System.out.println("무음 처리합니다.");
    }
}

class Television implements Device {
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
//문제 10
interface Calculator {
    static int plus(int x, int y) {
        return x + y;
    }
}
