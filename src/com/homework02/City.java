package com.homework02;

public class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postal;
    private String phoneCode;

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
        return country;
    }

    public void setCountry(String country) {
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
