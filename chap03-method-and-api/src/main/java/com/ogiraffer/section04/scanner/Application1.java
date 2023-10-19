package main.java.com.ogiraffer.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args){

        /*
        * java.util.scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공 한다.
        *
        * 1-1 Scanner는 객체를 만들어서 사용한다.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요 : ");
        
        String name = sc.nextLine();  //입력을 해줄때까지 기다림 nextLine 입력해 주는걸 받아서 전달해줌(String)
        
        System.out.println("안녕하세요 " + name + "님!!");

        int age = sc.nextInt(); // int 입력을 반환함  int 이후에는 int를 비워줘야함 sc.nextLine();

        System.out.println("입력하신 나이는 " + age + "세가 맞나요?");


        Long lnum = sc.nextLong();
        System.out.println("입력한 Long : " + lnum);
        
        boolean isTrue = sc.nextBoolean();
        if(isTrue){
            System.out.println("참이다.");
        }else{
            System.out.println("거짓");
        }

        sc.nextLine();

        char charValue = sc.nextLine().charAt(0);
        System.out.println(charValue);


    }
}
