package main.java.com.ohgiraffers.section04;

import main.java.com.ohgiraffers.section04.uses2.DatabaseSaveProvider;
import main.java.com.ohgiraffers.section04.uses2.FileSaveProvider;
import main.java.com.ohgiraffers.section04.uses2.Person;
import main.java.com.ohgiraffers.section04.uses3.Dicer;
import main.java.com.ohgiraffers.section04.uses3.HellDice;
import main.java.com.ohgiraffers.section04.uses3.SuperDice;

public class Application {

    public static void main(String[] args){

/*        Person person = new Person(new DatabaseSaveProvider());
        Person person1 = new Person(new FileSaveProvider());
        person1.doSometing();
        person.doSometing();*/

        Dicer dicer = new Dicer();
        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());
    }
}
