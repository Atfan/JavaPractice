package com.homeWorkATM.ATM;

import com.homeWorkATM.Bill.Bill;
import com.homeWorkATM.MyException.MyATMException;
import com.homeWorkATM.MyException.MyBillException;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Bill> newBills = new ArrayList<>();
        for (Bill bill : bills) {
            newBills.add(bill.clone()); // Клонуємо об'єкти Bill
        }
        for (Bill bill : newBills) {
            while(sum>=bill.getDenomination()&& bill.getCount()!=0){
                sum-=bill.getDenomination();
                bill.removeBills(1);
            }
        }
        if(sum==0){
            sum=count;
            for (Bill bill : bills) {
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

        } else {
           throw new MyATMException("Cannot input bill of lower denomination than " + minDenomination);
        }
    }

    public List<Bill> getBills() {
        return bills;
    }
}
