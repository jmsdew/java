package com.ohgiraffers.bronze.bronze5;

import java.util.Scanner;

public class Baekjoon10951 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.nextLine();
        for (int i = 1; i <= a; i++) {
            String b = s.nextLine();
            String[] c = b.split(" ");
            int d = 0;
            for (int j = 0; j < 2; j++) {
              d +=   Integer.parseInt(c[j]);
            }

            System.out.println("Case #" + i + ": " + c[0] + " + " + c[1] +" = " + d);
        }

    }
}
