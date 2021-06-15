package com;

import static org.junit.Assert.*;
import org.junit.Test;

import com.controller.CashDispenserController;
import com.model.BankDatabase;
import com.model.Transaction;
import com.view.Keypad;
import com.view.Screen;
import com.model.Constants;
import com.model.CashDispenser;
/**
 * Unit test for model Cash Dispenser
 */
public class CashDispenserControllerTest {
    @Test
    public void testCashDispenserConstructor()
    {
    	Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	CashDispenser cashDispenser = new CashDispenser();
    	CashDispenserController cdController = new CashDispenserController(cashDispenser, keypad, screen);
        assertNotNull(cdController);

    }  
}
