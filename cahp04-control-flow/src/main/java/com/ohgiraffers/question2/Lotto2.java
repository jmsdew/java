package main.java.com.ohgiraffers.question2;

import java.util.*;

public class Lotto2 {

        private static int count = 0;

        public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);

            HashMap<String, Set<Integer>> hmap = new HashMap<>();



            Set<Integer> lotto1 = new TreeSet<>();
            lotto1.add(11);
            lotto1.add(22);
            lotto1.add(9);

            lotto1.add(26);
            lotto1.add(35);
            lotto1.add(40);

            Iterator<Integer> iter1 = lotto1.iterator();



            System.out.println("-------------------------------");

            System.out.println(lotto1.hashCode());

            System.out.println("-------------------------------");

            while (true) {
                while (true) {
                    System.out.println("=========로또 판매 프로그램==========");
                    System.out.println("구매하실 로또 수량을 입력 해주세요");
                    int no = scr.nextInt();



                    if (no + count <= 100) {
                        if (no < 100) {


                            for (int i = 1; i <= no; i++) {

                                Set<Integer> lotto = new TreeSet<>();

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

                            if(count == 100){
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
                                    int match = 0;
                                    for (int num : purLotto) {
                                            while(iter1.hasNext()){
                                                iter1.next().equals(num);
                                                match++;
                                            }

                                    }
                                    if (match == 6) {
                                        System.out.println(entry.getKey() + " 1등 당첨!");
                                        isWinner = true;
                                    } else if (match >= 2) {
                                        System.out.println(entry.getKey() + " 2등 당첨!");
                                        isWinner = true;
                                    }
                                    if (!isWinner) {
                                        System.out.println("이번 회차는 당첨 없음");
                                        return;
                                    }

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


