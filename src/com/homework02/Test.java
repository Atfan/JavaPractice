package com.homework02;

public class Test {
    public static void main(String[] args) {
        //Завдання 3
        Country country = new Country();
        country.setName("Ukraine");
        country.setCapitalName("Kiev");
        country.setCities(new String[]{"Chernihiv", "Kiev", "Lviv", "Odesa", "Kharkiv", "Makiivka"});
        country.setContinent("Europe");
        country.setPopulation(33365000);

        //Завдання 2
        City city = new City();
        city.setName("Chernihiv");
        city.setCountry("Ukraine");
        city.setPopulation(287747);
        city.setPostal("14000");
        city.setRegion("Chernihiv Oblast");
        city.setPhoneCode("+380");

        //Завдання 1
        Person person = new Person();
        person.setFullName("Art Zaq");
        person.setPhone("+380000000");
        person.setAddress("street, 65");
        person.setCity(city);
        person.setDateOfBirth("01.01.1990");

        System.out.println(person.getFullName());
        System.out.println(person.Card());
        System.out.println();

        System.out.println(city.getPhoneCode());
        System.out.println(city.Card());
        System.out.println();

        System.out.println(country.getContinent());
        System.out.println(country.Card());
        System.out.println();


    }
}
