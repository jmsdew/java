package main.java.com.ohgiraffers.section04.parameter;

import java.util.Scanner;

public class Asd {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();


        for(int i=0; i<a; i++){
            String b = "";
            for(int j=0; j<=i; j++){
                b += "*";
            }
            System.out.println(b);
        }

    }
}
