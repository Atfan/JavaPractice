package com.homeWorkATM.ATM;

import com.homeWorkATM.Bill.Bill;
import com.homeWorkATM.MyException.MyATMException;

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

    public void manualInput(int denomination, int count) throws MyATMException {
        if (denomination >= minDenomination) {
            manualInput.put(denomination, count);
        } else {
           throw new MyATMException("Cannot input bill of lower denomination than " + minDenomination);
        }
    }

    public void withdraw() {
        System.out.println("Manual Input:");
        for (int denomination : manualInput.keySet()) {
            System.out.println("Denomination: " + denomination + ", Count: " + manualInput.get(denomination));
        }
    }
}
