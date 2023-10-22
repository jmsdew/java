package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

    //    A_if app1 = new A_if();
    //    app1.testSimpleIfStatement();
     //   app1.testNestedIftatement();

    //    B_ifElseIf app2 = new B_ifElseIf();

   //      app2.testNestedIfEleseIfStatement();

     /*    D_switch app3 = new D_switch();
         String result = app3.testSwitchVendingMachine();
        System.out.println(result);*/


        Scanner scr = new Scanner(System.in);
        int first = scr.nextInt();


            for(int i=1; i<=9; i++){
                System.out.println(first + "*" + i +" = " + (first*i));
            }



    }
}
