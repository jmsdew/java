package com.ohgiraffers.bronze.bronze3;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2442 {
    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();

        for(int i = 1; i <=a  ; i++) {
            for(int j = 0; j < a-i; j++){
                System.out.print(" ");}
            for(int j = 0; j < i*2-1; j++){
                System.out.print("*");}
            System.out.println();
        }


    }

}
