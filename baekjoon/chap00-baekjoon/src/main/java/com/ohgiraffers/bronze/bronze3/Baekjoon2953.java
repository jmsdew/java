package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2953 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            String b = scr.nextLine();
            String[] c = b.split(" ");
            for (int j = 0; j < 4; j++) {
                a[i] += Integer.parseInt(c[j]);
            }
        }

        if(a[0] > a[1] && a[0] > a[2] && a[0] > a[3] && a[0] > a[4]){
            System.out.println("1 " + a[0]);
        } else if (a[1] > a[0] && a[1] > a[2] && a[1] > a[3] && a[1] > a[4]) {
            System.out.println("2 "+ a[1]);
        } else if (a[2] > a[0] && a[2] > a[1] && a[2] > a[3] && a[2] > a[4]) {
            System.out.println("3 "+ a[2]);
        } else if (a[3] > a[0] && a[3] > a[2] && a[3] > a[1] && a[3] > a[4]) {
            System.out.println("4 "+ a[3]);
        }else {
            System.out.println("5 "+a[4]);
        }


    }
}
