package com.ohgiraffers.silver.silver4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baekjoon25192 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();

        String[] b = new String[a];
        for (int i = 0; i < a; i++) {
            b[i] = scr.nextLine();
        }

        Set<String> c = new HashSet<>();
        int d = 0;
        for (int i = 1; i < a; i++) {
            if(!b[i].equals("ENTER")){
                c.add(b[i]);
                System.out.println(c);
            }else {
                d += c.size();
                c.clear();
            }

        }
        System.out.println(d);





        
    }
}
