package test;

import model.Transaction;
import model.User;
import service.DepositService;
import service.WithdrawalService;

public class WithdrawalTest {
    public static void main(String[] args) {
        WithdrawalService ws= new WithdrawalService(new User("mngr399630", "apavEba"));
        ws.login();
        ws.test(new Transaction("09999999","9","withdraw"));
    }
}
