package com.homework02_03;

public class City {
    private String name;
    private String region;
    private Country country;
    private int population;
    private String postal;
    private String phoneCode;

    public City(String name, String region, Country country) {
        this.name = name;
        this.region = region;
        this.country = country;
    }
    public City(String name, String region){
        this(name ,region,null);
    }
    public City(){
        this("","");
    }

    public String Card(){
        return "Назва: " + name +"\nРегіон: " + region+ "\nКраїна: " + country +
                "\nНаселення: "+population+"\nІндекс: " + postal;
    }

    // Setter & Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country.getName();
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
