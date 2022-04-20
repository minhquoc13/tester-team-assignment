package test;

import model.Transaction;
import model.User;
import service.DepositService;

public class DepositTest {
    public static void main(String[] args) {
        DepositService ds= new DepositService(new User("mngr399630", "apavEba"));
        ds.login();
        ds.test(new Transaction("09999999","9999","done"));
    }
}
