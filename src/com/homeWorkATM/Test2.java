package com.homeWorkATM;
import com.homeWorkATM.ATM.ATM;
import com.homeWorkATM.ATM.ATMFabric;
import com.homeWorkATM.Bill.Bill;

import java.util.ArrayList;
import java.util.List;


public class Test2 {
    public static void main(String[] args) {

        try {
        // Create ATM
        ATM atm = ATMFabric.generate(); // Assuming minDenomination is 10


            atm.Show();
            // Manual input bills
            atm.manualInput(50, 10);
            atm.manualInput(20, 20);

        atm.Show();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

