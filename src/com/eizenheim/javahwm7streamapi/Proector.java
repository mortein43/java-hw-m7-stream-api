package com.eizenheim.javahwm7streamapi;

public class Proector {
    private String name;
    private int year;
    private double price;
    private String manufacturer;

    @Override
    public String toString() {
        return "______________________________\n" +
                "Назва: " + name + '\n' +
                "Рік випуску: " + year + '\n' +
                "Ціна: " + price + '\n' +
                "Виробник: " + manufacturer + '\n' +
                "______________________________\n";
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Proector(String name, int year, double price, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.manufacturer = manufacturer;
    }
}
