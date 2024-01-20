package com.ohgiraffers;

import java.util.Scanner;

public class Baekjoon12865 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        scr.nextLine();

        int[][] c = new int[a][2];
        for (int i = 0; i < a; i++) {
                String w = scr.nextLine();
            for (int j = 0; j <= 1; j++) {
                String[] q = w.split(" ");
                c[i][j] = Integer.parseInt(q[j]);
            }
            System.out.println(c[i][0]+" "+c[i][1]);
        }
        int r = 0;
        // 반복문 1부터 시작해서 최대 무게가 될 때까지 더하는 경우의 수


    }
}
