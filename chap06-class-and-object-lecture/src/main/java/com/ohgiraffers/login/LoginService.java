package main.java.com.ohgiraffers.login;

import java.util.Scanner;

public class LoginService {
    Scanner scr = new Scanner(System.in);

    People[] people1 = new People[5];

    public void signUp() {
        System.out.println("========회원 가입 창========");
        System.out.println("아이디를 입력 해주세요");
        String a = scr.nextLine();

        while (true) {

            System.out.println("비밀번호를 입력 해주세요");
            String b = scr.nextLine();
            System.out.println("비밀번호를 확인 해주세요");
            String c = scr.nextLine();

            if (b.equals(c)) {
                people1[0] = new People(a, b);
                System.out.println("등록 완료 되었습니다.");
                System.out.println(" ");
                return;
            } else {
                System.out.println("설정하신 비밀번호와 다릅니다.");
            }
        }


    }

    public void login() {

        loof :while (true) {
            System.out.println("====== 아이디를 입력 해주세요 ======");
            String d = scr.nextLine();



            for (int i = 0; i < people1.length; i++) {
                if (d.equals(people1[0].getName())) {
                    System.out.println("비밀번호를 입력 해주세요");
                    String e = scr.nextLine();
                    if (e.equals(people1[0].getNumber())) {
                        System.out.println("로그인 되었습니다.");  break loof;
                    } else {
                        System.out.println("비밀번호를 확인 해주세요");
                    }
                }else {
                    System.out.println("없는 아이디 입니다."); break; }
            }

        }

    }
}



