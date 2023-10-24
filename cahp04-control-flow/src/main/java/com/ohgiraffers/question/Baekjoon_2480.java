package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Baekjoon_2480 {
    public static void main(String[] args){



        Scanner scr = new Scanner(System.in);
/*        int A = scr.nextInt();

        if(A%4 == 0){
            if((A%100 == 0) && (A%400 !=0)){
                System.out.println(0);
            }else System.out.println(1);
        }else {System.out.println(0);}


        int a = scr.nextInt();
        int b = scr.nextInt();

        if((a>0) && (b>0)){
            System.out.println(1);
        } else if ((a>0) && (b<0)) {
            System.out.println(4);
        } else if ((a<0) && (b>0)) {
            System.out.println(2);
        } else if ((a<0) && (b<0)) {
            System.out.println(3);
        }*/


/*        int time = scr.nextInt();
        int min = scr.nextInt();
        int cook = scr.nextInt();

        if(min+cook >= 60) {
         if(time+(min+cook)/60 >= 24){
             time = time+(min+cook)/60 - 24;
         }else{time = time + (min+cook)/60;}
            min = (min+cook)%60;
        }else{
            min = min+cook;
        }
        System.out.println(time+" "+min);*/

        int first = scr.nextInt();
        int second = scr.nextInt();
        int third = scr.nextInt();

        if((first == second)&&(first ==third) &&(second ==third)){
            System.out.println(10000+(first*1000));
        }else if((first == second) || (first == third) || (second == third)){
            if(first == second){
                System.out.println(1000+(first*100));
            } else if (first == third) {
                System.out.println(1000 + (first*100));
            }else{
                System.out.println(1000 + (second*100));
        }
    }else{
            if((first > second) && (first > third)){
                System.out.println(first*100);
            }
            if((second > first) && (second > third)){
                System.out.println(second*100);
            }
            if((third > second) && (third > first)){
                System.out.println(third*100);
            }
        }


    }







}
