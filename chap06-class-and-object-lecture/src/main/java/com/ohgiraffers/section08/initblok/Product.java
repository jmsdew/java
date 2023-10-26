package main.java.com.ohgiraffers.section08.initblok;

public class Product {

    private String name;
    private int price;
    private static String brand;

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 100000;
        brand = "사과";
    }
    static{
//        name = "손오공";
//        price = 10000;
        brand = "드래곤볼";
    }
    public Product(){

    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }



}
