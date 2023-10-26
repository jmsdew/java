package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Baekjoon10171 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        long a = scr.nextInt();
        long b = scr.nextInt();


       if ((a>=0) && (b>=0) && (a>b)) {
            System.out.println(a-b);
        } else if ((a>=0) && (b>=0) && (a<b)) {
            System.out.println(b-a);
        } else if( (a<0) && (b<0) && (a>b)){
            System.out.println(+(a-b));
        }else if ((a<0) && (b<0) && (a<b)){
            System.out.println(+(b - a));
        } else if ((a>=0 && b<0)) {
           System.out.println(a-b);
       } else if ((a<0) && (b>=0)) {
           System.out.println(b-a);
       }else {
           System.out.println(a+b);}

    }
}
