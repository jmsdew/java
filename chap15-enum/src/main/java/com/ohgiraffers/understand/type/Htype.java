package main.java.com.ohgiraffers.understand.type;

public enum Htype {

    벌크업(100, -40),
    감량(70, -20),
    다이어트(50, -10),
    요가(30, +20),
    유령(30, 0);

    int cash;
    int damage;


    Htype(int cash, int damage) {
        this.cash = cash;
        this.damage = damage;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
