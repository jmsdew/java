package com.ohgiraffers.bronze.bronze3;

import java.util.Scanner;

public class Baekjoon2588 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        String a = scr.nextLine();
        String b = scr.nextLine();

        int num = Integer.parseInt(a);
        int num1 = Integer.parseInt(b);

        for (int i = b.length()-1; i >= 0; i--) {
        char ab = b.charAt(i);
            int num2 = Character.getNumericValue(ab);
            System.out.println(num * num2);
        }
        System.out.println(num * num1);





    }
}
