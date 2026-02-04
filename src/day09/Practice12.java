package day09;

public class Practice12 {
    public static void main(String[] args) {
        // 문제 1
        Student student = new Student();
        student.name = "김재현";
        student.studentId= 20210819;
        System.out.println("이름: "+ student.name);
        System.out.println("학번: "+ student.studentId);

        //문제2
        Cat cat = new Cat();
        cat.makeSound();

        //문제 3
        Computer com = new Computer();

        //문제 4
        Triangle t = new Triangle();
        Figure f = t;
        System.out.println("업캐스팅 성공: "+(f instanceof Triangle));

        //문제 5
        Shape shape = new Circle();
        shape.draw();

        //문제 6
        Vehicle vehicle = new Bus();

        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        //문제 7
        Beverage[] b = {new Coke(), new Coffee()};
        for(Beverage bev : b ) { bev.drink();}

        //문제 8
        Character hero = new Character();
        hero.use(new Sword());
        hero.use(new Gun());

        //문제 9
        SuperClass obj = new SubClass();

        System.out.println(obj.name);
        obj.method();

        //문제 10
        Laptop myLaptop = new Laptop();
        if (myLaptop instanceof Electronic) {
            System.out.println("Laptop 객체는 Electronic 타입으로 변환 가능합니다.");
        }

        if (myLaptop instanceof Device) {
            System.out.println("Laptop 객체는 Device 타입으로도 변환 가능합니다.");
        }
    }
}
//문제 1
class Person{
    String name;
}
class Student extends Person{
    int studentId;
}

//문제 2
class Animal{
    void makeSound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}

//문제 3
class Machine{
    Machine(){
        System.out.println("부모 클래스 생성자 실행");
    }
}
class Computer extends Machine{
    Computer(){
        System.out.println("자식 클래스 생성자 실행");
    }
}

//문제 4
class Figure{}
class Triangle extends  Figure{}


//문제 5
class Shape{
    void draw(){
        System.out.println("도형을 그립니다.");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("원을 그립니다.");
    }
}

//문제 6
class Vehicle{}
class Bus extends Vehicle{
    void checkFare(){
        System.out.println("요금을 확인합니다.");
    }
}

//문제 7
class Beverage{
    void drink(){
        System.out.println("음료를 마십니다.");
    }
}
class Coke extends Beverage{
    void drink(){
        System.out.println("콜라를 마십니다.");
    }
}
class Coffee extends Beverage{
    void drink(){
        System.out.println("커피를 마십니다.");
    }
}


//문제 8
class Character {
    void use(Weapon weapon) {
        weapon.attack();
    }
}
class Weapon {
    void attack() { System.out.println("무기로 공격합니다."); }
}
class Sword extends Weapon {
    @Override
    void attack() { System.out.println("검으로 공격합니다."); }
}
class Gun extends Weapon {
    @Override
    void attack() { System.out.println("총으로 공격합니다."); }
}

//문제 9
class SuperClass {
    String name = "상위";
    void method() { System.out.println("상위 메소드 호출"); }
}

class SubClass extends SuperClass {
    String name = "하위";
    @Override
    void method() { System.out.println("하위 메소드 호출"); }
}


class Device { }
class Electronic extends Device { }
class Laptop extends Electronic { }