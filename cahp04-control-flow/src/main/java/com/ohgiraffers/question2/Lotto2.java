package main.java.com.ohgiraffers.question2;

import java.util.*;

public class Lotto2 {

        private static int count = 1;

        public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);

            HashMap<String, Set<Integer>> hmap = new HashMap<>();



            Set<Integer> lotto2 = new TreeSet<>();


            lotto2.add(9);
            lotto2.add(11);
            lotto2.add(22);
            lotto2.add(26);
            lotto2.add(35);
            lotto2.add(40);

            Set<Integer> lotto1 = new TreeSet<>(lotto2);


            System.out.println("-------------------------------");

            System.out.println(lotto1.hashCode());
            System.out.println(lotto2.hashCode());

            System.out.println("-------------------------------");

            while (true) {
                while (true) {
                    System.out.println("=========로또 판매 프로그램==========");
                    System.out.println("구매하실 로또 수량을 입력 해주세요");
                    int no = scr.nextInt();

                    hmap.put((1 + "번 로또"), lotto2);

                    if (no + count <= 10) {
                        if (no < 10) {
                            Set<Integer> lotto = new TreeSet<>();

                            for (int i = 1; i <= no; i++) {
                                while (lotto.size() < 6) {
                                    lotto.add((int) (Math.random() * 45) + 1);
                                }
                                count++;
                                hmap.put((count + "번 로또"), lotto);
                            }
                            HashMap hmap2 = new HashMap();
                            Iterator<String> iter = hmap.keySet().iterator();
                            Iterator valueIter = hmap.entrySet().iterator();

                            for (Map.Entry<String, Set<Integer>> entry : hmap.entrySet()) {   //entry - key와 value를 한번에 받아올 수 있음
                                String key = entry.getKey();
                                Set<Integer> value = entry.getValue();
                                System.out.println(key + ": " + value);
                            }

                            if(count == 10){
                                // 정답 구현 및 일치 확인

/*                                for (int i = 1; i <= no; i++) {
                                    while (lotto1.size() < 6) {
                                        lotto1.add((int) (Math.random() * 45) + 1);
                                    }
                                }*/


                                System.out.println("=========이번 회차 로또 당첨========");
                                System.out.println("행운 번호 : " + lotto1);

                                boolean isWinner = false;
                                for (Map.Entry<String, Set<Integer>> entry : hmap.entrySet()) {
                                    Set<Integer> purLotto = entry.getValue();
                                    if (purLotto.equals(lotto1)) {
                                        System.out.println(entry.getKey() + "는 당첨!");
                                        isWinner = true;
                                        return;
                                    }
                                }
                                if (!isWinner) {
                                    System.out.println("이번 회차는 당첨 없음");
                                    return;
                                }

                            }


                        } else {
                            System.out.println("10개 이상은 구매하실 수 없습니다.");
                            break;
                        }
                    } else {
                        System.out.println("이번 회차 구매가능 수량은 " + (10 - count) + "개 입니다.");
                        break;
                    }






                }
            }
        }
    }


