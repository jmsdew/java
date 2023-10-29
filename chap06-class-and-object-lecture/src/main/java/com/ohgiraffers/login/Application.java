package main.java.com.ohgiraffers.login;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        LoginService login = new LoginService();

        loop : while(true){
            System.out.println("=======회원 관리 프로그램===========");
            System.out.println("1. 로그인 ");
            System.out.println("2. 회원 가입");
            System.out.println("3. 프로그램 종료");
            int no = scr.nextInt();

            switch (no){
                case 1 : login.loginNumber(); break;
                case 2 : login.makeId();; break;
                case 3 :
                    System.out.println("프로그램을 종료합니다"); return;
                default:
                    System.out.println("잘못된 번호입니다."); break;
            }




        }



    }
}
