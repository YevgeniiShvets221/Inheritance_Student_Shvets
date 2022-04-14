package com.company;

public class Roof extends Triangle{
    private String material;
    private int width;
    private int height;
    private int length;
    private String color;
    private int price;
    private int weight;
    private String manufacturer;
    private int warranty;
    private String firm;

    public Roof() {

    }

    public Roof (String material,int width,int height, int length, String color,int price, int weight,String manufacturer, int warranty,String firm){

        super(width,length,height);
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
        this.firm = firm;
    }

    public double getPrice() {
        double price = 0;
        if (getArea()>50) {
            price+=5000;
        }
        else if(getArea() >30) {
            price+=3200;
        }

        else {
            price+=2000;
        }

        if (getFirm().equals("Flamingo")){
            price+=2400;
        }

        if (getFirm().equals("Reha u")){
            price+=4880;
        }

        if (getFirm().equals("Salamander")){
            price+=3800;
        }

        if (weight == 305) {
            price+=2800;
        }

        if (weight == 800) {
            price+=5600;
        }

        if (warranty == 1) {
            price+=2700;
        }

        if (warranty == 5) {
            price+=6000;
        }
        return price;
    }

    public String getFirm(){
        return firm;
    }

    public void setFirm (String firm){
        this.firm = firm;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial (String material){
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", warranty=" + warranty +
                ", firm='" + firm + '\'' +
                '}';
    }
}
