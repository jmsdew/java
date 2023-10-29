package main.java.com.ohgiraffers.program;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);


        System.out.println("=======회원 정보 출력 프로그램=======");
        System.out.println(" ");
        System.out.println(" 등록할 회원 수를 입력 해주세요");
        int peopleNum = scr.nextInt();
        String e = scr.nextLine();  // 씹힘 방지
        People[] people1 = new People[peopleNum];

        for (int i = 0; i < people1.length; i++) {
            System.out.println(i + "번째 이름을 입력 해주세요");
            String a = scr.nextLine();
            System.out.println("회원번호를 입력 해주세요");
            String b = scr.nextLine();
            System.out.println("회원 가입 목적을 입력 해주세요");
            String c = scr.nextLine();
            people1[i] = new People(a, b, c);
        }
        System.out.println("등록 완료 되었습니다.");

        System.out.println(" ");
        System.out.println(" ");

       while(true) {
           System.out.println("====== 조회할 회원의 이름을 입력 해주세요 ======");
           String d = scr.nextLine();


           for (int i = 0; i < people1.length; i++) {
               if (d.equals(people1[i].getName())) {
                   people1[i].phoneNum();
                   return;

               } else {
                   System.out.println("없는 이름입니다. 다시 입력 해주세요");
               }
           }
       }





    }
}
