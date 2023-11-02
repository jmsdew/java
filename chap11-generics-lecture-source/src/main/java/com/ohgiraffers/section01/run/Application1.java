package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args){

 //       RabbitFarm<Animal> farm1 = new RabbitFarm<>();   // rabbit의 자손만 들어올 수 있음
 //       RabbitFarm<Mammal> farm = new RabbitFarm<>();
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//        RabbitFarm<?> farm7 = new RabbitFarm();   // ? 는 어떤 타입이 들어갈지 모른다는 것 - 와일드카드 하지만

//        farm7.setAnimal(new Snake());   // 하지만 RabbitFarm은 extends Rabbit 이기에 못들어감

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
        farm4.getAnimal().cry(); // 같음

        // Rabbit의 후손 타입만 허용할 수 있도록 제네릭스의 제한을 걸어 두었기 때문에
        // <T extends Rabbit> 형변환이라고 생각가능하다.
        // 이유 T가 결정되어도 T의 값은 Rabbit의 후손일 것이기 때문에
        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();

        List<? super Rabbit> parents = new ArrayList<>();
        parents.add(new Rabbit());

        



    }
}
