package main.java.com.ohgiraffers.game2;

import org.w3c.dom.ls.LSOutput;

public class Gacha {
    String[] first = new String[]{"성공", "실패", "성공" , "성공"}; // 3/4
    String[] second = new String[]{"성공", "실패", "성공", "실패", "성공"}; // 3/5
    String[] third = new String[]{"성공", "실패", "성공", "실패"};  // 1/2
    String[] fourth = new String[]{"성공", "실패", "실패"};  // 1/3
    String[] fifth = new String[]{"성공", "실패", "실패", "실패"};  // 1/4


    public void goGacha() {
        int firstG = (int) (Math.random() * first.length);
        int secondG = (int) (Math.random() * second.length);
        int thirdG = (int) (Math.random() * third.length);
        int fourthG = (int) (Math.random() * fourth.length);
        int fifthG = (int) (Math.random() * fifth.length);

        String firstS = " ";
        firstS = first[firstG];
        String seconS = second[secondG];
        String thirdS = third[thirdG];
        String fourtS = fourth[fourthG];
        String fifthS = fifth[fifthG];

        System.out.println("1층 : " + firstS);
        if (firstS == "성공") {
            System.out.println(" 2층 : " + seconS);
        }else {System.out.println("1단계부터 실패하면 가챠는 하지 맙시다.");}
        if (seconS == "성공" && firstS == "성공") {
            System.out.println(" 3층 : " + thirdS);
        }if (thirdS == "성공" && seconS == "성공" && firstS == "성공") {
            System.out.println(" 4층 : " + fourtS);
        }if (fourtS == "성공" && thirdS == "성공" && seconS == "성공" && firstS == "성공") {
            System.out.println(" 5층 : " + fifthS);
        }
//        System.out.println("1단계부터 실패하면 가챠는 하지 맙시다.");
  //      public void sell(){

  //      }
    }
}
