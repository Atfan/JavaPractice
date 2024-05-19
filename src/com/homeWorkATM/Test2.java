package com.homeWorkATM;
import com.homeWorkATM.ATM.ATM;
import com.homeWorkATM.Bill.Bill;

import java.util.ArrayList;
import java.util.List;


public class Test2 {
    public static void main(String[] args) {

        try {
        // Create bills
        Bill bill1 = new Bill(500, 100);
        Bill bill2 = new Bill(200, 100);
        Bill bill3 = new Bill(100, 100);

        // Initialize bills
        List<Bill> initialBills = new ArrayList<>();
        initialBills.add(bill1);
        initialBills.add(bill2);
        initialBills.add(bill3);

        // Create ATM
        ATM atm = new ATM(10); // Assuming minDenomination is 10

        // Initialize ATM
        atm.initialize(initialBills);

            // Manual input bills
            atm.manualInput(50, 10);
            atm.manualInput(20, 20);

        // Withdraw from ATM
        atm.withdraw();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

