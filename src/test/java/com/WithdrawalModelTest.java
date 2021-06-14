package com;

import static org.junit.Assert.*;
import org.junit.Ignore;

import org.junit.Test;

import com.model.Withdrawal;
import com.model.CashDispenser;
import com.model.BankDatabase;

/**
 * Unit test for model Cash Withdrawal
 */
public class WithdrawalModelTest {
    @Test
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

    
}
