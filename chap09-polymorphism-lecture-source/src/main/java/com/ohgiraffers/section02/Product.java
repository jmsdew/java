package main.java.com.ohgiraffers.section02;

public abstract class Product {
        
    public Product(){

    }
    
    public void nonStaticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }

    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 호출");
    }
    public abstract void abstractMethod();  //함수의 몸체가 없음 -- 자식 클래스에서 ((무조건)) 정의 해야 함 - 안하면 에러
            // 추상적인 메소드 정의
    
    
}
