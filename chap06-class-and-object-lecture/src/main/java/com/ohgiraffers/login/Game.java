package main.java.com.ohgiraffers.login;

import main.java.com.ohgiraffers.game.People1;
import main.java.com.ohgiraffers.game2.Gacha;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public void start(){
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
    public void start1(){
        Scanner scr = new Scanner(System.in);
        People1 people = new People1();
        Random random = new Random();

        int[] second = new int[]{5,20};

        int secondNum = (int)(Math.random() * 2);

        int hp = 100;
        int count = 0;
        System.out.println("최대한 높이 점수를 많이 얻어주세요 최초 hp는 100입니다.");
        loop : while(true){
            System.out.println("남은 체력은 " + hp + " 입니다");
            System.out.println("1. 동네 뒷산 등반 (hp -10 , 높이 +10 )");
            System.out.println("2. 설악산 등반    (hp -5 or -20 , 높이 +15)");
            System.out.println("3. 백두산 등반    (hp -10 or -30 , 높이 +25)");
            System.out.println("4. 에베레스트 등반 (hp -20 or -50 , 높이 +40)");
            int no = scr.nextInt();


            switch (no){
                case 1 :
                    people.first(); hp-=10; count += 10; break;

                case 2 :
                    if(hp>5) {
                        people.second();
                        int randomHp = random.nextBoolean() ? -5 : -20;
                        hp += randomHp;
                        count += 15;
                        break;
                    }else {
                        System.out.println("피가 부족해 산을 오르다 사망하셨습니다.");
                        break loop;}
                case 3 :
                    if(hp>10) {
                        people.third();
                        int randomHp2 = random.nextBoolean() ? -10 : -30;
                        hp += randomHp2;
                        count += 25;
                        break;
                    }else { System.out.println("피가 부족해 산을 오르다 사망하셨습니다.");
                        break loop;}
                case 4 :
                    if(hp>20){
                    people.fouth();
                    int randomHp3 = random.nextBoolean()? -20 : -50;
                    hp += randomHp3;
                    count +=40; break;
                    }else { System.out.println("피가 부족해 산을 오르다 사망하셨습니다.");
                    break loop;}
                default:
                    System.out.println("그런 산은 없어요 다시 골라주세요"); break;
            }
            if(hp <= 0){
                System.out.println("높이점수는 " + count + " 점 입니다.");
                break loop;
            }



        }
    }
    }

