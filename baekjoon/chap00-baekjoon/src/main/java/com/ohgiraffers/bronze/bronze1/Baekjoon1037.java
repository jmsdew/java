package com.ohgiraffers.bronze.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1037 {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();

        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = scr.nextInt();
        }

        Arrays.sort(b);
        // 제일 큰 수와 제일 작은 수의 합
        int q = 0;
        int w = b.length-1;

        System.out.println(b[q] * b[w]);


    }
}
