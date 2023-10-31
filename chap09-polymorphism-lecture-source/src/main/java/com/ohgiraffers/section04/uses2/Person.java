package main.java.com.ohgiraffers.section04.uses2;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider){
        this.saveProvider = saveProvider;
    }

    public void doSometing(){
        String date = "String data";
        saveProvider.save(date);
    }
}
