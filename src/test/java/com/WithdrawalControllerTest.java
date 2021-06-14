package com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.model.CashDispenser;
import com.model.Transaction;
import com.model.BankDatabase;
import com.controller.WithdrawalController;
import com.view.Keypad;
import com.view.Screen;

/**
 * Unit test for controller CashDispenser
 */
public class WithdrawalControllerTest {
    @Test
    public void testRunWithInputOne()
    {
        /**
         * Description
         * Author
         */
        CashDispenser cd = new CashDispenser();
        assertTrue(true);
    }

    @Test
    public void testConstructorWithdrawalController()
    {
        /**
         * Melakukan pengujian untuk constructor kelas Withdrawal Controller
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	assertNotNull(wdController);
    }
    
    @Test
    public void testAmountValid()
    {
        /**
         * Melakukan pengujian untuk amount yang valid
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = true;
    	assertEquals(expected, wdController.rangeValidWithdrawAmount(200));
    }
    
    @Test
    public void testAmountMoreThanMax()
    {
        /**
         * Melakukan pengujian untuk amount yang lebih dari batas maximal range
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = false;
    	assertEquals(expected, wdController.rangeValidWithdrawAmount(600));
    }
    
    @Test
    public void testAmountLessThanMin()
    {
        /**
         * Melakukan pengujian untuk amount yang kurang dari batas manimal range
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = false;
    	assertEquals(expected, wdController.rangeValidWithdrawAmount(10));
    }
    
    @Test
    public void testAmountEqualToMin()
    {
        /**
         * Melakukan pengujian untuk amount yang sama dengan batas manimal range
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = false;
    	assertEquals(expected, wdController.rangeValidWithdrawAmount(20));
    }
    
    @Test
    public void testAmountEqualToMax()
    {
        /**
         * Melakukan pengujian untuk amount yang sama dengan batas maximal range
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = false;
    	assertEquals(expected, wdController.rangeValidWithdrawAmount(500));
    }
    
    @Test
    public void testAmountMultipleValidLimit()
    {
        /**
         * Melakukan pengujian untuk amount apakah kelipatan 20 atau tidak
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = true;
    	assertEquals(expected, wdController.validWithdrawAmount(20));
    }
    
    @Test
    public void testAmountMultipleValid()
    {
        /**
         * Melakukan pengujian untuk amount apakah kelipatan 20 atau tidak
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = true;
    	assertEquals(expected, wdController.validWithdrawAmount(400));
    }
    
    @Test
    public void testAmountMultipleInvalid()
    {
        /**
         * Melakukan pengujian untuk amount apakah kelipatan 20 atau tidak
         * Author : Nadia
         */
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);
    	boolean expected = false;
    	assertEquals(expected, wdController.validWithdrawAmount(250));
    }
}
