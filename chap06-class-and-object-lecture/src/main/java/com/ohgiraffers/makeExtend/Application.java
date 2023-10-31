package main.java.com.ohgiraffers.makeExtend;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        Soccer soccer = new Soccer();
                        // 게임 시작 틀 잡기
         while(true){
            System.out.println("==========토트넘 팬 게임=========");
            System.out.println("1. 게임 시작");
            System.out.println("2. 난 coys가 아니야");
            int no = scr.nextInt();

            switch (no){
                case 1 :
                    try {
                        soccer.start();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2 :
                    System.out.println("토트넘 팬이 아니라면 나가주세요"); return;
                default:
                    System.out.println("잘못된 번호입니다."); break;
            }


        }
    }
}
