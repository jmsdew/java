package main.java.com.ohgiraffers.make;

import java.util.Arrays;

public class People {
    private String[] name = new String[3];
    private int[] age = new int[3];

    private char[] gender = new char[3];




    private static int limit = 5;

    public People(String[] name1,int[] age1,char[] gender1, int people1){

/*        this.name[0] = name1[0];

        this.name[1] = name1[1];

        this.name[2] = name1[2];*/
        for(int i=0; i<=2; i++){
            this.name[i] = name1[i];
            this.age[i] = age1[i];
            this.gender[i] = gender1[i];
        }



        limit -= people1;


    }

    public People() {

    }

    @Override
    public String toString() {
        return "People{" +
                "name=1 " + name[0] + "         "+
                "age=1 " + age[0] + "         "+
                "gender=1 " + gender[0] + "         "+
                "name=2 " + name[1] + "         "+
                "age=2 " + age[1] + "         "+
                "gender=2 " + gender[1] + "         "+
                "name=3 " + name[2] + "         "+
                "age=3 " + age[2] +
                "gender=3 " + gender[2] + "         "+


                '}';


    }


    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }


}
