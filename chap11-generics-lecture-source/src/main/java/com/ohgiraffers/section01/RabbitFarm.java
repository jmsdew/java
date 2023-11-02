package main.java.com.ohgiraffers.section01;

public class RabbitFarm<T extends Rabbit>/*rabbit의 자손만 들어올 수 있음 T 내용이 비어있으면 모든 자료형이 다 들어와 형변환 가능*/{

    private T animal;

    public RabbitFarm(){}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
