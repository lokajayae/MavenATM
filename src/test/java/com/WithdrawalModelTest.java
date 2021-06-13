package com;

import static org.junit.Assert.*;
import org.junit.Ignore;

import org.junit.Test;

import com.model.BankDatabase;
import com.model.CashDispenser;
import com.model.Withdrawal;
import com.model.Account;
import static com.model.Constants.*;

/**
 * Unit test for model Cash Withdrawal
 */
public class WithdrawalModelTest {

	private BankDatabase bankDatabase;
	private CashDispenser cashDispenser;
    private int userAccountNumber;

    @Test
    public void constructorCreationSucceedTest()
    {
        /**
         * Description: menguji proses pembuatan objek model Withdrawal.
         * Author: Zara Veda
         */
        bankDatabase = new BankDatabase();
		cashDispenser = new CashDispenser();
        userAccountNumber = 1234;
        Withdrawal withdrawal = new Withdrawal(userAccountNumber, bankDatabase, cashDispenser);
        assertNotNull(withdrawal);
    }

    @Test
<<<<<<< HEAD
    public void testSetAmount()
    {
        /**
         * Description : Menguji fungsi set amount pada model withdrawal
         * Author
         */
        BankDatabase bd = new BankDatabase();
        CashDispenser cd = new CashDispenser();
        Withdrawal withdrawal = new Withdrawal(1234, bd, cd);
        withdrawal.setAmount(90);
        assertEquals(withdrawal.getAmount(), 90);
    }

=======
    public void executeCashDispenserNotEnoughTest()
    {
        /**
         * Description: Menguji proses Withdrawal jika Cash Dispenser kurang.
         * Author: Zara Veda
         */
        bankDatabase = new BankDatabase();
        userAccountNumber = 1212;
        bankDatabase.addAccount(new Account(userAccountNumber, 4321, 1000.0, 1200.0, 2, 1));
		cashDispenser = new CashDispenser();
        Withdrawal withdrawal = new Withdrawal(userAccountNumber, bankDatabase, cashDispenser);
        withdrawal.setAmount(260);
        int actualStatus = withdrawal.execute();
        assertEquals(CASHDISPENSER_NOT_ENOUGH, actualStatus);
    }

    @Test
    public void executeBalanceNotEnoughTest()
    {
        /**
         * Description: Menguji proses Withdrawal jika Avl. Balance kurang.
         * Author: Zara Veda
         */
        bankDatabase = new BankDatabase();
        userAccountNumber = 1235;
        cashDispenser = new CashDispenser();
        Withdrawal withdrawal = new Withdrawal(userAccountNumber, bankDatabase, cashDispenser);
        withdrawal.setAmount(500);
        int actualStatus = withdrawal.execute();
        assertEquals(BALANCE_NOT_ENOUGH, actualStatus);
    }

    @Test
    public void executeWithdrawSuccessfulTest()
    {
        /**
         * Description: Menguji proses Withdrawal jika Avl. Balance dan Cash Dispenser cukup.
         * Author: Zara Veda
         */
        bankDatabase = new BankDatabase();
        userAccountNumber = 1234;
		cashDispenser = new CashDispenser();
        Withdrawal withdrawal = new Withdrawal(userAccountNumber, bankDatabase, cashDispenser);
        withdrawal.setAmount(100);
        int actualStatus = withdrawal.execute();
        assertEquals(WITHDRAW_SUCCESSFUL, actualStatus);
    }

    @Test
    public void executeWithdrawalCanceledTest()
    {
        /**
         * Description: Menguji proses pembatalan Withdrawal.
         * Author: Zara Veda
         */
        bankDatabase = new BankDatabase();
        userAccountNumber = 1234;
		cashDispenser = new CashDispenser();
        Withdrawal withdrawal = new Withdrawal(userAccountNumber, bankDatabase, cashDispenser);
        withdrawal.setAmount(7);
        int actualStatus = withdrawal.execute();
        assertEquals(WITHDRAWAL_CANCELED, actualStatus);
    }

    @Test
    public void getAmountTest()
    {
        /**
         * Description:
         * Menguji fungsionalitas fungsi getAmount.
         * Author: Zara Veda
         */
        bankDatabase = new BankDatabase();
        userAccountNumber = 1234;
		cashDispenser = new CashDispenser();
        Withdrawal withdrawal = new Withdrawal(userAccountNumber, bankDatabase, cashDispenser);
        
        int expectedAmount = 100;
        withdrawal.setAmount(expectedAmount);
        int actualAmount = withdrawal.getAmount();
        assertEquals(expectedAmount, actualAmount);
    }
>>>>>>> 7f6a315 (create test for Withdrawal model)
}
