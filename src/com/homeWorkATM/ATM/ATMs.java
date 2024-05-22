package com.homeWorkATM.ATM;

import com.homeWorkATM.Bill.Bill;

public class ATMs {
    public static void Show(ATM atm){
            System.out.println("Cash in ATM:");
            for (Bill bill : atm.getBills()) {
                System.out.println("Denomination: " + bill.getDenomination() + ", Count: " + bill.getCount());

            }
        }
    }

