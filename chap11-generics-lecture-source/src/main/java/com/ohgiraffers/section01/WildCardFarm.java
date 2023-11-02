package main.java.com.ohgiraffers.section01;

public class WildCardFarm {

    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    public void extendType (RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}
