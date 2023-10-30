package main.java.com.ohgiraffers.login;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        LoginService loginService = new LoginService();


        while (true) {
            System.out.println("==========로그인 및 회원가입 프로그램===========");
            System.out.println("1. 로그인");
            System.out.println("2. 회원 가입");
            System.out.println("3. 프로그램 종료");
            int no = scr.nextInt();

            switch (no) {
                case 1:
                    loginService.login();
                    return;
                case 2:
                    loginService.signUp();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    System.out.println(" ");
                    break;


            }


        }


    }

}
