package com.ohgiraffers.bronze.bronze4;

import java.util.Scanner;

public class Baekjoon2752 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        if((a>b) && (a >c)){
            if(b>c){
                System.out.println(c +" "+b+" "+a);
            }else {
                System.out.println(b +" "+c+" "+a);
            }
        }
        if((b>a) && (b >c)){
            if(a>c){
                System.out.println(c +" "+a+" "+b);
            }else {
                System.out.println(a +" "+c+" "+b);
            }
        }
        if((c>b) && (c >a)){
            if(b>a){
                System.out.println(a +" "+b+" "+c);
            }else {
                System.out.println(b +" "+a+" "+c);
            }
        }
    }
}
