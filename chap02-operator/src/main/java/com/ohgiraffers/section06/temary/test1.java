package com.ohgiraffers.section06.temary;

public class test1 {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");

        int alcohol = (45 + 35 + 30 + 50);
        int average = (alcohol / 4);
        int total = (int) (alcohol * 0.9);

        System.out.println("A마트 이번 주 주류의 평균 실적은 " + average + "만원이고, 세금은 " + (alcohol - total) + "만원을 냈으며, 세금을 제외한 수입은 " + total + " 만원이다.");

        String result1 = (total > 140) ? "높다" : "낮다";

        System.out.println("이번 주 총 매출은 평균 총 매출보다 " + result1);


        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오

        System.out.println("--------------------------------------");

        int man1st = 113;
        int man2ed = 127;

        String result2 = (man1st >= 120) ? "가능합니다." : "불가능합니다.";
        String result3 = (man2ed >= 120) ? "가능합니다." : "불가능합니다.";

        System.out.println("키가 " + man1st + "cm 이므로 탑승 " + result2);
        System.out.println("키가 " + man2ed + "cm 이므로 탑승 " + result3);


        System.out.println("--------------------------------------");

        //삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력

        String result4 = (1 > 4) ? "천재" : "바보";
        System.out.println(result4);


        /*
        * 1.
        한 축구 구단의 직원 수는 약 1892명 이다.
        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고, 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.

        구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.

        구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.
        */


        System.out.println("--------------------------------------");

        int allMember = 1892;
        int lank = 17;
        int downLank = 18;
        int upMember = (int)(allMember*1.15);
        int downMember = (int)(allMember*0.85);

        double ourMember = (lank < downLank) ? upMember : downMember ;
        System.out.println(ourMember);

        System.out.println("우리 구단은 17위를 기록해서 구단 직원은 총 " + (int)ourMember + "명이 되었다.");

        System.out.println("--------------------------------------");

      //  2.
        /*영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다 평균을 구한 후 논리 연산자를 이용해
        90점 이상~100점 이하라면 true를 출력, 아니라면 false를 출력하라.
         */

        int studentA = 90;
        int studentB = 95;
        int studentC = 81;

        System.out.println("세 학생의 평균은 " +((studentA+studentB+studentC)/3) + "점이다.");
        String trueFalse1 = (studentA >= 90)? "true": "false";
        String trueFalse2 = (studentB >= 90)? "true": "false";
        String trueFalse3 = (studentC >= 90)? "true": "false";

        System.out.println("A학생은 " + trueFalse1);
        System.out.println("B학생은 " + trueFalse2);
        System.out.println("C학생은 " + trueFalse3);


        System.out.println("--------------------------------------");
     //   3.
        /* 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라. */

        String name = "김과장";
        int balance = 3000000;
       int walletPrice = 620000;

        String result = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";

        System.out.println(result);


        System.out.println("--------------------------------------");
      /*  4.
        시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력*/

        int test1 = 50;
        int test2 = 40;
        int test3 = 60;

        String average2 = ((test1+test2+test3)/3 >= 40)? "합격": "불합격";
        System.out.println(average2);

        System.out.println("--------------------------------------");
       //  1. ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것

        char ch1 = 'x';
        char ch2 = 'z';
        String sameAlpa = (ch1 == ch2)? "참": "거짓";
        System.out.println(sameAlpa);

        System.out.println("--------------------------------------");

       // 2. 자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다

        int myAge = 29;
        String ageAdult = (myAge >= 20)? "성인": "미성년자";
        System.out.println(ageAdult);

        System.out.println("--------------------------------------");

      /*  3.길동이의 첫달 월급은 100만원이다
        짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        길동이 연봉은?
        3번 문제 추가사항
        출력 내용 = 길동이의 연봉은 XX만원입니다
       */

        int firstpay = 100;
        double pay1st = (100*1.1);
        double pay2ed = (100*1.15);
        double halfPay1 = (pay1st*6);
        double halfPay2 = (pay2ed*6);

        System.out.println("길동이의 연봉은 " +(int)(halfPay1+halfPay2) + "만원입니다.");

    }
}

