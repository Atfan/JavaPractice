package com.homework02_03.Person;

import com.homework02_03.City.City;
import com.homework02_03.Country.Country;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private City city;
    private Country country;
    private String address;

    public Person(String fullName, String dateOfBirth, String phone, String address){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
    }
    public Person(String fullName, String phone){
        this(fullName,"",phone,"");
    }
    public Person(String fullName){
        this(fullName,"");
    }
    public Person(){
        this("");
    }

    public String Card() {
        return "Ім'я: " + fullName +
                "\nДата народження: " + dateOfBirth+
                "\nМісто: "+ city.getName();
    }

    // Setter & Getter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city.getName();
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCountry() {
        return country.getName();
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
