package com.homeWorkATM.Bill;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BillsFabric {
    private final static int[] denomination={1, 2, 5, 10, 20, 50, 100, 200, 500 };

    private BillsFabric() {}

    public static List<Bill> Generate() {

        Random rand = new Random();
        List<Bill> bills = new ArrayList<>();
        for(int i=0; i<(denomination.length-rand.nextInt(denomination.length)+1); i++) {
            bills.add(GenerateBill());
        }
        return bills;
    }

    public static Bill GenerateBill() {
        Random rand = new Random();
        return new Bill(denomination[rand.nextInt(denomination.length)], 100);
    }
}
