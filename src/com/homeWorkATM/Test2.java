package com.homeWorkATM;
import com.homeWorkATM.ATM.ATM;
import com.homeWorkATM.ATM.ATMFabric;
import com.homeWorkATM.MyException.MyATMException;
import com.homeWorkATM.MyException.MyBillException;


import static com.homeWorkATM.ATM.ATMs.Show;


public class Test2 {
    public static void main(String[] args) {

        try {
            ATM atm = ATMFabric.generate();


            Show(atm);

            atm.manualInput(50, 10);
            atm.manualInput(20, 20);
            //atm.manualInput(30, 20);                      //throw

            System.out.println();
            System.out.println("After Input: ");
            Show(atm);


            atm.Output(1000);
            //atm.Output(100000000);

            System.out.println();
            System.out.println("After REMOVE: ");
            Show(atm);

        }
        catch (MyBillException e){
            System.out.println("Trouble in Bill: "+e.getMessage());
        }
        catch (MyATMException e){
            System.out.println("Trouble in ATM: "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}

