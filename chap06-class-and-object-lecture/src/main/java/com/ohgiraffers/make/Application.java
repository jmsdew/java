package main.java.com.ohgiraffers.make;


import java.util.Scanner;

public class Application {
    public static void main(String[] args){



        Scanner scr = new Scanner(System.in);
        String[] name1 = new String[3];
        int[] age1 = new int[3];
        char[] gender1 = new char[3];


        for(int i=0; i<3;i++ ){
            System.out.println("이름");
            name1[i] = scr.nextLine();
            System.out.println("나이");
            age1[i] = scr.nextInt();
            System.out.println("성별");
            gender1[i] = scr.next().charAt(0);
            scr.nextLine();

        }

        People pe = new People(name1,age1,gender1, 3);

        System.out.println(pe);




    }
}
