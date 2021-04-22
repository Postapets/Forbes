package com.example.forbes;

public class Person {
    //Имя
    String name;
    //Флаг
    int flag_res;
    //Бабки
    String money;


    public Person(String name, String money, int flag_res) {
        this.flag_res = flag_res;
        this.money = money;
        this.name = name;
    }
}
