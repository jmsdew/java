package com.ohgiraffers.bronze.bronze2;

import java.util.Scanner;

public class Baekjoon25501 {
    static int count = 1;
    public static int recursion(String s, int l, int r) {
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {            
            return 0;
        } else {
            count++;
            return recursion(s, l + 1, r - 1);         // 문장 맨 앞과 뒤를 비교한 다음 하나씩 안으로 들어가면서 비교
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();
        for (int i = 0; i < a; i++) {
            count = 1;
            String q = scr.nextLine();
            int w = isPalindrome(q);
            System.out.println(w + " " + count);

        }

    }
}
