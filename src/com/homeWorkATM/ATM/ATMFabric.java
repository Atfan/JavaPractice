package com.homeWorkATM.ATM;

import com.homeWorkATM.Bill.Bill;
import com.homeWorkATM.Bill.BillsFabric;
import com.homeWorkATM.MyException.MyBillException;

import java.util.List;

public class ATMFabric {
    private ATMFabric(){}
    public static ATM generate() throws MyBillException {
        List<Bill> bills= BillsFabric.Generate();
        int min= bills.get(0).getDenomination();
        for(Bill bill:bills){
            if (min>bill.getDenomination()) {
                min= bill.getDenomination();
            }
        }
        ATM atm = new ATM(min);
        atm.initialize(bills);
        return atm;
    }
}
