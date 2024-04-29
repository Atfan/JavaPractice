package com.homework02_03;

import com.homework02_03.City.City;
import com.homework02_03.Country.Country;
import com.homework02_03.Fraction.Fraction;
import com.homework02_03.Person.Person;

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
        city.setCountry(country);
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
        person.setCountry(country);

        System.out.println(person.getFullName());
        System.out.println(person.Card());
        System.out.println();

        System.out.println(city.getPhoneCode());
        System.out.println(city.Card());
        System.out.println();

        System.out.println(country.getContinent());
        System.out.println(country.Card());
        System.out.println();

        //Завдання 4
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Fraction frac1 = new Fraction();
        Fraction frac2 = new Fraction();
        frac1.setNumerator(2);
        frac1.setDenominator(3);
        frac2.setNumerator(3);
        frac2.setDenominator(4);
        frac1.Add(frac2).Print();
        frac1.Subtract(frac2).Print();
        frac1.Add(2).Print();
        frac1.Divide(frac2).Print();
        frac1.Multiply(frac2).Print();
        //frac1.FractiondivideInteger(0).Print();

    }
}
