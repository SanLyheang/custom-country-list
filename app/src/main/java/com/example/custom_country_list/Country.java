package com.example.custom_country_list;

public class Country {
    private String countryName,language;
    private double area;
    private  int img,population;

    public Country(String countryName, int population, String language, double area,int img) {
        this.countryName = countryName;
        this.population = population;
        this.language = language;
        this.area = area;
        this.img = img;

    }
    //set

    public void setCountryName(String countryName) {this.countryName = countryName;}
    public void setPopulation(int population) {this.population = population;}
    public void setLanguage(String language) {this.language = language;}
    public void setArea(double area) {this.area = area;}
    public void setImg(int img) {this.img = img;}

    //get

    public String getCountryName() {return countryName;}
    public int getPopulation() {return population;}
    public String getLanguage() {return language;}
    public double getArea() {return area;}
    public int getImg() {return img;}

}
