package main.java.com.ohgiraffers.makeExtend;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Soccer {
        String[] tot = new String[]{"no goal","no goal","no goal","no goal","no goal","히샬리송의 득점","no goal","손흥민의 득점!","매디슨의 득점!","비수마의 득점!"};
        String[] che = new String[]{"no goal","no goal","no goal","no goal","no goal","no goal","no goal", "은쿤쿠의 득점!", "스털링의 득점!","엔조의 득점!"};
        String[] mau = new String[]{"no goal","no goal","no goal","no goal","no goal","no goal","no goal"};
        String[] ars = new String[]{"no goal","no goal","no goal","no goal","no goal","no goal","no goal"};
        String[] liv = new String[]{"no goal","no goal","no goal","no goal","no goal","no goal","no goal"};
        String[] mac = new String[]{"no goal","no goal","no goal","no goal","no goal","no goal","no goal"};


    public static int totcount=0;
    public static int othertcount=0;

    public void start()  throws Exception {
        Scanner scr = new Scanner(System.in);
/*
        int totG = (int) (Math.random() * tot.length);
        int cheG = (int) (Math.random() * che.length);
        int mauG = (int) (Math.random() * mau.length);
        int arsG = (int) (Math.random() * ars.length);
        int livG = (int) (Math.random() * liv.length);
        int macG = (int) (Math.random() * mac.length);
*/
        System.out.println("토트넘 vs 첼시 시작하시겠습니까?");
        System.out.println("아무키나 눌러주세요");
        String a = scr.nextLine();

        for (int i = 0; i < 5; i++) {
            int totG = (int) (Math.random() * tot.length);
            int cheG = (int) (Math.random() * che.length);

            System.out.println("===토트넘의 공격===");
            System.out.println(tot[totG]);
            System.out.println("===첼시의 공격===");
            System.out.println(che[cheG]);
            if(!tot[totG].equals("no goal")){
                totcount++;
            }
            if(!che[cheG].equals("no goal")){
                othertcount++;
            }
            System.out.println(" ");
            TimeUnit.SECONDS.sleep(1);

        }
        System.out.println("=====경기결과=====");
        System.out.println("토트넘" + totcount);
        System.out.println("첼시" +othertcount);
    }

}

