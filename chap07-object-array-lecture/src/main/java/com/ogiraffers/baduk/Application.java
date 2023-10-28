package main.java.com.ogiraffers.baduk;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String[][] baduk = new String[10][10];   // 바둑판 공간 설정 2차원 배열로


        for (int i = 0; i < baduk.length; i++) {                // 바둑판 공간에 빈공간 넣어줌 반복문 사용
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = " ";
            }
        }
        boolean test = true;   // test가 false 가 되면 while이 끝남
        Scanner scanner = new Scanner(System.in);
        int turn = 1;          // 게임의 순서를 번갈아 하기 위해 1로 설정해놓고 1번 실행당 turn++ 실행

        while (test) {
            System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다.");  // 반복문 첫 실행
            String[] index = scanner.nextLine().split(" ");
            int first = Integer.parseInt(index[0]);           // 이차원 배열의 위치 지정
            int second = Integer.parseInt(index[1]);

            if (turn % 2 == 0) {
                if (baduk[first][second].equals(" ")) {
                    baduk[first][second] = "O";                     // 순서가 돌아왔을때 중복된 자리가 아니면 o 생성
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
            } else {
                if (baduk[first][second].equals(" ")) {
                    baduk[first][second] = "X";                 // 순서가 돌아왔을때 중복된 자리가 아니면 x 생성
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다.");
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) {                      // 바둑판
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }
            turn++;
        }
    }
}

