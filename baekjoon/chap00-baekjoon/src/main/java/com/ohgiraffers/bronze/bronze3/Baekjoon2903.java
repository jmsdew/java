package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2903 {
    public static void main(String[] args){



        // 1 - 4 - 16 - 64  1번 마다 4씩 곱함.
        // 4 - 9 - 25 - ?   // 겹치는 걸 제거하는 로직.

        // 반복문으로 4씩 곱하기. -> Math.sqrt - 제곱근이 나옴
        // (제곱근+1) * 2
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int q = asd(a);
        System.out.println(q);

    }
    public static int asd(int a){
        int q = 1;
        for (int i = 1; i <= 15; i++) {
            q = q*4;
            int w = (int)Math.sqrt(q);
            int e = w+1;
            int r = e*e;
            if(a == i){
                return r;
            }

        }
        return 0;
    }
}
