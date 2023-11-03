package main.java.com.ohgiraffers.understand;

import com.sun.source.tree.Tree;

import java.util.*;

public class Application {

    private static int count = 1;

    public static void main(String[] args) {

        /*
         *  구매할 개수를 입력하면 개수만큼 로또 번호가 출력되는 시스템
         * 10개 이상은 구매할 수 없고
         * 10개 당 당첨 번호가 바뀜
         *
         *
         * */


        //구매할 갯수 입력받기 10개 이하

        // 갯수만큼 로또 번호 출력

        // 총 10개가 되면 당첨 번호를 생성

        // 당첨 여부 확인

        int b = 1;

        Scanner scr = new Scanner(System.in);
        HashMap<String, Set<Integer>> hmap = new HashMap();
        Set<Integer> lotto1 = new TreeSet<>();
        lotto1.add(7);
        lotto1.add(8);
        lotto1.add(15);
        lotto1.add(34);
        lotto1.add(38);
        lotto1.add(39);

        hmap.put(0+"번 로또", lotto1);
        while (true) {
            while (true) {
                System.out.println("=====로또 판매 프로그램 입니다.======");
                System.out.println("구매할 로또 갯수를 입력 해주세요 (10개 미만)");
                int a = scr.nextInt();

                if (count + a <= 10) {
                    count += a;
                } else {
                    System.out.println("이번 회차에서는 " + (10 - count) + " 개 이상 구매할 수 없습니다.");
                    break;
                }

                if (a <= 10) {



                    for (int i = 1; i <= a; i++) {

                        Set<Integer> lotto = new TreeSet<>();
                        while (lotto.size() < 6) {
                            lotto.add((int) (Math.random() * 45) + 1);
                        }

                        hmap.put((b + "번 로또"), lotto);
                        b++;




                    }

                   Iterator<String> iter = hmap.keySet().iterator();

                    for (Map.Entry<String, Set<Integer>> entry : hmap.entrySet()) {   //entry - key와 value를 한번에 받아올 수 있음
                        String key = entry.getKey();
                        Set<Integer> value = entry.getValue();
                        System.out.println(key + ": " + value);





                    }

                    if (count == 10) {
                        for (Map.Entry<String, Set<Integer>> entry : hmap.entrySet()){
                            String key = entry.getKey();
                            Set<Integer> value = entry.getValue();

                            if(value.equals(lotto1)){
                                System.out.println("=========당첨 결과 출력============");
                                System.out.println("행운 번호 : " + lotto1);
                                System.out.println("당첨 로또 번호는  " + key + " 입니다 축하합니다.");
                                return;

                            } else if(hmap.isEmpty()){
                                System.out.println("당첨 번호는 없습니다.");
                            }

                        }







                    }



                } else {
                    System.out.println("로또는 10개 이상 구매할 수 없습니다.");
                    break;
                }

            }
        }
    }
}