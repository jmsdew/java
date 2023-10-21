package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        A_for a = new A_for();
       //  a.testSimpleForStatement();
        // a.testForExample4();

            Scanner scanner = new Scanner(System.in);
//        System.out.println("n단을 출력하는 프로그램 입니다. n의 값을 입력 해주세요 : ");
///        int num = scanner.nextInt();
//        a.gugudan(num);

        B_while b = new B_while();
    //    System.out.println("n단을 출력하는 프로그램 입니다. n의 값을 입력 해주세요 : ");
    //    int num = scanner.nextInt();

        System.out.println("1단부터 입력 단 까지 구구단을 출력하는 프로그램 입니다.");
//        System.out.println("출력을 원하는 단을 입력 해주세요 : ");
        b.gugudan2();
    }
}
