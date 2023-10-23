package main.java.com.ogiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args){
        
        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요
        Scanner sc = new Scanner(System.in);

        int[] aver = new int[5];
        int total = 0;



         for(int i =0; i< aver.length; i++){
            aver[i] = sc.nextInt();
            total += aver[i];

        }
        System.out.println(total);
         double asdf = (double)(total)/5;

        System.out.println(asdf);




    }
}
