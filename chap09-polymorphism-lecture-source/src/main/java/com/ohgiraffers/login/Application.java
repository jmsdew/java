package main.java.com.ohgiraffers.login;

import main.java.com.ohgiraffers.login.dto.MemberDTO;
import main.java.com.ohgiraffers.login.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        MemberService memberService = new MemberService();
        // findMember(String authType--로그인sns타입, MemberDTO memberDTO)-회원정보 를 보내는 프로그램 껍데기 구현

        loof :while (true) {
            System.out.println("==========로그인프로그램===========");
            System.out.println("1. google 로그인");
            System.out.println("2. kakao 로그인");
            System.out.println("3. naver 로그인");
            System.out.println("4. 프로그램 종료");
            int no = scr.nextInt();

            if(no==4){
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            System.out.println("아이디를 입력 해주세요");
            String id = scr.next();

            System.out.println("패스워드를 입력 해주세요");
            String pwd = scr.next();
            MemberDTO memberDTO = new MemberDTO(id, pwd);

            switch (no) {
                case 1:
                    memberService.findMember("google", memberDTO);
                    break;
                case 2:
                    memberService.findMember("kakao", memberDTO);
                    break;
                case 3:
                    memberService.findMember("naver", memberDTO);
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    System.out.println(" ");
                    break;


            }

        }
    }

}