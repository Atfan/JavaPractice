package com.company.homeWorkATM.ATM;

import com.company.homeWorkATM.Bill.Bill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ATM {
    private List<Bill> bills = new ArrayList<>();
    private int minDenomination;
    private HashMap<Integer, Integer> manualInput = new HashMap<>();

    public ATM(int minDenomination) {
        this.minDenomination = minDenomination;
    }

    public void initialize(List<Bill> initialBills) {
        bills.addAll(initialBills);
    }

    public void manualInput(int denomination, int count) {
        if (denomination >= minDenomination) {
            manualInput.put(denomination, count);
        } else {
            System.out.println("Cannot input bill of lower denomination than " + minDenomination);
        }
    }

    public void withdraw(int amount) {
        // Algorithm for withdrawal
        // ...

        // For demonstration, just printing out the manual input
        System.out.println("Manual Input:");
        for (int denomination : manualInput.keySet()) {
            System.out.println("Denomination: " + denomination + ", Count: " + manualInput.get(denomination));
        }
    }
}
