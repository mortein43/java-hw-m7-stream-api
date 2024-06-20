package com.eizenheim.javahwm7streamapi;

public class Device {
    private String name;
    private int year;
    private double price;
    private String color;
    private String type;

    @Override
    public String toString() {
        return "_____________________________\n" +
                "Назва: " + name + '\n' +
                "Рік випуску " + year + '\n' +
                "Ціна: " + price + '\n' +
                "Колір: " + color + '\n' +
                "Тип: " + type + '\n' +
                "_____________________________\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Device(String name, int year, double price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }
}
