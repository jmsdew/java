package main.java.com.ohgiraffers.question2;

import java.util.Set;
import java.util.TreeSet;

public class Lotto3 {
    public static void main(String[] args){

        Set<Integer> lotto2 = new TreeSet<>();


        lotto2.add(9);
        lotto2.add(10);
        lotto2.add(22);
        lotto2.add(26);
        lotto2.add(35);
        lotto2.add(40);

        Set<Integer> lotto1 = new TreeSet<>(lotto2);


        System.out.println("-------------------------------");

        System.out.println(lotto1.hashCode());
        System.out.println(lotto2.hashCode());

        System.out.println("-------------------------------");
    }
}
