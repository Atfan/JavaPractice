package com.homework02;

public class Country {
    private String name;
    private String continent;
    private int population;
    private String phoneCode;
    private String capitalName;
    private String[] cities;

    public String Card(){
        return "Назва: " + name +"\nКонтинент: " + continent+
                "\nНаселення: "+population+"\nСтолиця: " + capitalName;
    }

    // Setter & Getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
