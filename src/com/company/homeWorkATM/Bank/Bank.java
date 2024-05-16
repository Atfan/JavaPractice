package com.company.homeWorkATM.Bank;

import com.company.homeWorkATM.ATM.ATM;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<ATM> atms = new ArrayList<>();

    public void addATM(ATM atm) {
        atms.add(atm);
    }
}
