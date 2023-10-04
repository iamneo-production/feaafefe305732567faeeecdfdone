package com.examly.springapp.model;
public class Laptop{
    private int laptopId;
    private string laptopBrand;
    private int laptopPrice;
    public int getLaptopId(){
        return laptopId;
    }
    public void setLaptopId(int laptopId){
        this.laptopId = laptopId;
 
    }
    public String getLaptopBrand(){
        return laptopBrand;

    }
    public void setLaptopBrand(String laptopBrand){
        this.laptopBrand = laptopBrand;
    }
    public int getLaptopPrice(){
        return laptopPrice;
    }
    public void setLaptopPrice(int laptopPrice){
        this.laptopPrice = laptopPrice;
    }
}
