package com.homeWorkATM.Bill;

import com.homeWorkATM.MyException.MyBillException;

public class Bill implements Comparable<Bill>{
    private int denomination;
    private int maxCountInBundle;
    private int count;

    public Bill(int denomination, int maxCountInBundle) {
        this.denomination = denomination;
        this.maxCountInBundle = maxCountInBundle;
        this.count = 0;
    }

    public int getDenomination() {
        return denomination;
    }

    public int getCount() {

        return count;
    }

    public void addBills(int billsToAdd) throws MyBillException {
        if (count + billsToAdd <= maxCountInBundle) {
            count += billsToAdd;
        } else {
            throw new MyBillException("Cannot add bills, maximum count exceeded.");
        }
    }

    public void removeBills(int billsToRemove) throws MyBillException {
        if (count - billsToRemove >= 0) {
            count -= billsToRemove;
        } else {
            throw new MyBillException("Cannot remove bills, insufficient count.");
        }
    }

    @Override
    public int compareTo(Bill other) {
        return Integer.compare(this.denomination, other.denomination);
    }
}
