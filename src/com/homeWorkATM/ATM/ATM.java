package com.homeWorkATM.ATM;

import com.homeWorkATM.Bill.Bill;
import com.homeWorkATM.MyException.MyATMException;
import com.homeWorkATM.MyException.MyBillException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ATM {
    private List<Bill> bills = new ArrayList<>();
    private int minDenomination;

    public ATM(int minDenomination) {
        this.minDenomination = minDenomination;
    }

    public void initialize(List<Bill> initialBills) {
        bills.addAll(initialBills);
    }
    public void Output(int count) throws MyBillException, MyATMException {
        int sum=count;
        bills.sort(Collections.reverseOrder());
 ;       List<Bill> newBills = new ArrayList<>(bills);
        for (Bill bill : newBills) {
            while(sum>=bill.getDenomination()&& bill.getCount()!=0){
                sum-=bill.getDenomination();
                bill.removeBills(1);
               // System.out.println("Sum: "+ sum+ " Denomination: "+ bill.getDenomination());
            }
        }
        if(sum==0){
            sum=count;
            for (Bill bill : newBills) {
                while(sum>=bill.getDenomination()){
                    sum-=bill.getDenomination();
                    bill.removeBills(1);
                }
            }
        }
        else{

            throw new MyATMException("Cannot output bill with your count, remainder " + sum);
        }
    }

    public void manualInput(int denomination, int count) throws MyATMException, MyBillException {
        boolean isSuccess = false;
        if (denomination >= minDenomination) {
            for(Bill bill : bills) {
                if(bill.getDenomination()==denomination) {
                    bill.addBills(count);
                    isSuccess = true;
                    break;
                }
            }
            if(!isSuccess) {
                Bill bill = new Bill(denomination, 100);
                bill.addBills(count);
                bills.add(bill);
            }

            //logAdd(denomination,count);
        } else {
           throw new MyATMException("Cannot input bill of lower denomination than " + minDenomination);
        }
    }

    private void logAdd(int denomination, int count) {
        System.out.println("Manual Input:");
        System.out.println("Denomination: " + denomination + ", Count: " + count);

    }
    public void Show() {
        System.out.println("Cash in ATM:");
        for (Bill bill : bills) {
            System.out.println("Denomination: " + bill.getDenomination() + ", Count: " + bill.getCount());

        }
    }
}
