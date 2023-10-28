package main.java.com.ogiraffers.baduk;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        String[][] baduk = new String[10][10];

        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = " ";
            }
        }

        boolean game = true;
        int turn = 1;

        while(game){
            System.out.println(((turn%2 == 0)? "O":"X" )+ " 차례입니다.");
            String[] a = scr.nextLine().split(" ");
            int first = (Integer.parseInt(a[0]));
            int second = (Integer.parseInt(a[1]));

            if(turn%2==0){
                if(baduk[first][second].equals(" ")) {
                    System.out.println(((turn % 2 == 0) ? "O" : "X") + " 차례입니다.");
                    baduk[first][second] = "O";
                }else {
                    System.out.println("중복입니다.");
                    continue;}
            }else{
                if(baduk[first][second].equals(" ")) {
                    System.out.println(((turn % 2 == 0) ? "O" : "X") + " 차례입니다.");
                    baduk[first][second] = "X";
                }else {
                    System.out.println("중복입니다.");
                    continue;}
            }


            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j]+"|");
                }
                System.out.println();
            }


        turn++;
        }

    }
}
