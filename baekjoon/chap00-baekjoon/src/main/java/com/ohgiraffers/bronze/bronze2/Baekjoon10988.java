package com.ohgiraffers.bronze.bronze2;

import java.util.Scanner;

public class Baekjoon10988 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        while(true) {
        String a = scr.nextLine();

        String b = "";
        for (int i = a.length()-1;i>=0; i--) {
            b = b + a.charAt(i);
        }

            if (a.equals(b)) {
                if(a.equals("0")){
                    System.exit(0);
                }else{
                System.out.println("yes");}
            } else {
                System.out.println("no");
            }
        }
    }
}
