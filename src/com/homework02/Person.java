package com.homework02;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private City city;
    private String country;
    private String address;


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
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
