package com.ohgiraffers.silver.silver5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon1427 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        String a = scr.nextLine();
        String[] b = a.split("");
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }
}
