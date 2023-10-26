package main.java.com.ohgiraffers.game2;

import java.util.Scanner;

public class Application {
   public static void main(String[] args) {
        Gacha gacha = new Gacha();
        Scanner scr = new Scanner(System.in);



        System.out.println("운빨 게임을 시작합니다.");

        loop:
        while (true) {
            System.out.println("1. 도전");
            System.out.println("2. 게임 종료");
            int no = scr.nextInt();
            switch (no) {
                case 1:
                    gacha.goGacha();
                            ; break;
                case 2 : break loop;
                default:
                    System.out.println("다른 번호를 누르다니 쫄보시네요");
            }


            }


        }
    }

