package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args){

        Animal animal = new Rabbit();
        Animal animal1 = new Tiger();
        Application03.feed(animal);
        Application03.feed(animal1);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();  //heap영역에 생성해서 참조

        feed(rabbit);
        feed(tiger);  
        
        
        feed(new Tiger());   // heap 영역에 생성 후 바로 대입
        feed(new Rabbit());  // 메서드가 끝나면 소멸
    }

    public static void feed(Animal animal){
        animal.eat();
    }
}
