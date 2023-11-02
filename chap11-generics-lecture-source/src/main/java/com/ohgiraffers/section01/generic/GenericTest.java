package main.java.com.ohgiraffers.section01.generic;

public class GenericTest<T> /*다이아몬드 연산자 T는 타입*/ {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
