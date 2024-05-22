package com.homeWorkATM.Bill;

import com.homeWorkATM.MyException.MyBillException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BillsFabric {
    private final static int[] denomination={1, 2, 5, 10, 20, 50, 100, 200, 500 };

    private BillsFabric() {}

    public static List<Bill> Generate()  throws MyBillException {

        Random rand = new Random();
        List<Bill> bills = new ArrayList<>();
        for(int i=0; i<(denomination.length-rand.nextInt(denomination.length)+1); i++) {
            boolean isAdd=false;
            Bill newBill=GenerateBill();
            for(Bill bill:bills) {
                if(bill.getDenomination()==newBill.getDenomination()) {
                    bill.addBills(newBill.getCount());
                }
            }
            if(!isAdd){
                bills.add(newBill);
            }
        }
        return bills;
    }

    public static Bill GenerateBill() throws MyBillException {
        Random rand = new Random();
        Bill bill =new Bill(denomination[rand.nextInt(denomination.length)], 100);
        bill.addBills(rand.nextInt(100));
        return bill;
    }
}
