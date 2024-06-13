package org.example.sort.data;

public class Product {
    private String name;
    private int price;
    private int sale;
    private int sellerPrice;
    private int imageResourceId;

    public Product(String name, int price, int sale, int sellerPrice, int imageResourceId) {
        this.name = name;
        this.price = price;
        this.sale = sale;
        this.sellerPrice = sellerPrice;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSale() {
        return sale;
    }

    public int getSellerPrice() {
        return sellerPrice;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}