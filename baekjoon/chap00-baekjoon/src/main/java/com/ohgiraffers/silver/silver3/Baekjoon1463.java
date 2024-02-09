package com.ohgiraffers.silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1463 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int count = 0;
        while (n > 0){

            if(n % 3 == 0){
                n = n/3;
                count++;
            }else if (n % 2 == 0){
                n = n/2;
                count++;
            }else {
                n = n-1;
                count++;
            }
        }
        System.out.println(count);

        ////미완성
    }
}
