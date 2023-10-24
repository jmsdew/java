package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
/*        int T = scr.nextInt();

        for(int i = 0; i<=T; i++){
            int A = scr.nextInt();
            int B = scr.nextInt();

            System.out.println(A+B);

        }*/


            int A = scr.nextInt();
             int B = 0;
            for(int i = 0; i < A; i++){

              B += A-i;
            }
        System.out.println(B);
        }


    }

