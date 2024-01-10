package com.ohgiraffers.bronze.bronze2;

import java.util.Scanner;

public class Baekjoon19532 {
    public static void main(String[] args){


        /*
        * 수현이는 4차 산업혁명 시대에 살고 있는 중학생이다. 코로나 19로 인해, 수현이는 버추얼 학교로 버추얼 출석해 버추얼 강의를 듣고 있다.
        * 수현이의 버추얼 선생님은 문자가 2개인 연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.
        4차 산업혁명 시대에 숙제나 하고 앉아있는 것보다 버추얼 친구들을 만나러 가는 게 더 가치있는 일이라고 생각했던 수현이는 이런 연립방정식을 풀 시간이 없었다.
        *  다행히도, 버추얼 강의의 숙제 제출은 인터넷 창의 빈 칸에 수들을 입력하는 식이다. 각 칸에는
         -999 이상 999 이하의 정수만 입력할 수 있다. 수현이가 버추얼 친구들을 만나러 버추얼 세계로 떠날 수 있게 도와주자.
        * */
        
        // 6가지 수가 차례대로 주어짐
        //  ax + by = c  /  dx + ey =f    x,y 구하기
        //  반복문 -  -999~999 까지 루프 돌리기  ai + bj = c && di+ej = f

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        int d = scr.nextInt();
        int e = scr.nextInt();
        int f = scr.nextInt();
        int u = 0;
        int q = 0;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (((a*i) + (b*j) == c) && ((d*i) + (e*j) == f)){
                    u = i;
                    q = j;
                }
            }
        }
        System.out.println(u+" "+ q);
        
        
    }
}
