package com.homeWorkATM;
import com.homeWorkATM.ATM.ATM;
import com.homeWorkATM.ATM.ATMFabric;
import com.homeWorkATM.Bill.Bill;

import java.util.ArrayList;
import java.util.List;

import static com.homeWorkATM.ATM.ATMs.Show;


public class Test2 {
    public static void main(String[] args) {

        try {
        // Create ATM
        ATM atm = ATMFabric.generate(); // Assuming minDenomination is 10


        Show(atm);

        // Manual input bills
        atm.manualInput(50, 10);
        atm.manualInput(20, 20);

            System.out.println();
            System.out.println("After Input: ");
        Show(atm);

        atm.Output(1000);
            System.out.println();
            System.out.println("After REMOVE: ");
        Show(atm);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}

