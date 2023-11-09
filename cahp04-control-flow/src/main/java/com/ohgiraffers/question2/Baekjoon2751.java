package main.java.com.ohgiraffers.question2;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        TreeSet<Integer> tset = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            String c = br.readLine();
            tset.add(Integer.parseInt(c));

        }
        for (int te : tset) {
            bw.write(Integer.toString(te));
            bw.newLine();


        }
        bw.flush();




    }
}
