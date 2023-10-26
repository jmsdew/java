package main.java.com.ogiraffers.section01.array;

import java.util.Scanner;

public class Application05 {
    public static void main(String[] args){

        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] chardNumber = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        // 배열 안 하나를 랜덤
        int shapesNumber = (int)(Math.random() * shapes.length);
        int chNumber = (int)(Math.random() * chardNumber.length);
        System.out.println(shapes[shapesNumber]+ chardNumber[chNumber]);
        // math.random을 이용해 랜덤으로 숫자를 출력하고 shapes.length만큼 범위를 지정해 준다.
        // 그 다음 shapes[]로 감싸 shape 배열 중 랜덤 숫자 코드 하나를 출력하도록 한다.



    }
}
