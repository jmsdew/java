package com.ohgiraffers.programmers;

import java.util.Scanner;

public class Lv1_3 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        String[] b = a.split(" ");
        int q = 0;

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            if(b[i].equals("kim")){
                q = i;
            }
        }
        System.out.println(q);
    }
}
