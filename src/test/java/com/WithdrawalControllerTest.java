package com;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import java.util.Scanner;

import com.controller.WithdrawalController;
import com.model.BankDatabase;
import com.model.Transaction;
import com.view.Keypad;
import com.view.Screen;
import com.model.Constants;
import com.model.CashDispenser;

/**
 * Unit test for controller CashDispenser
 */
public class WithdrawalControllerTest {
    private final PrintStream stdOut = System.out;
    private final InputStream stdIn = System.in;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Constants constant = new Constants();

    private byte[] toBytes(int i){
      byte[] result = new byte[4];
    
      result[0] = (byte) (i >> 24);
      result[1] = (byte) (i >> 16);
      result[2] = (byte) (i >> 8);
      result[3] = (byte) (i /*>> 0*/);
    
      return result;
    }

    @Before
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown(){
        System.setOut(stdOut);
        System.setIn(stdIn);
    }

    @Test
    public void testMenuWithInputOne()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input 1
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("1".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), 20);
    }

    @Test
    public void testMenuWithInputTwo()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input 2
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("2".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), 40);
    }

    @Test
    public void testMenuWithInputThree()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input 3
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("3".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), 60);
    }

    @Test
    public void testMenuWithInputFour()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input 4
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("4".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), 100);
    }

    @Test
    public void testMenuWithInputFive()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input 5
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("5".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), 200);
    }

    @Test
    public void testMenuWithInputSeven()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input 7
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("7".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), constant.WITHDRAWAL_CANCELED);
    }

    @Test
    public void testMenuWithInputBelowOne()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input dibawah batas bawah
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("0".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), constant.WITHDRAWAL_ERROR_INPUT_MENU);
    }

    @Test
    public void testMenuWithInputAboveSeven()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input diatas batas atas
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream("8".getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), constant.WITHDRAWAL_ERROR_INPUT_MENU);
    }

    @Test
    public void testOtherAmountwithBelowLimitInput(){
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input other amount
         * Input amount dibawah range yang disediakan
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream(("6" + System.lineSeparator() + "0").getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
        Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), constant.WITHDRAWAL_ERROR_RANGE_AMOUNT);
    }
    
    @Test
    public void testConstructorWithdrawalController(){
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
    public void testOtherAmountwithAboveLimitInput()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input other amount
         * Input amount diatas range yang disediakan
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream(("6" + System.lineSeparator() + "520").getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
        Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), constant.WITHDRAWAL_ERROR_RANGE_AMOUNT);
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
    public void testOtherAmountwithInputNotMultipleOfTwenty()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input other amount
         * Input amount dalam range yang disediakan namun bukan kelipatan 20
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream(("6" + System.lineSeparator() + "45").getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
        Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), constant.WITHDRAWAL_ERROR_INPUT_AMOUNT);
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
    public void testOtherAmountwithValidInput()
    {
        /**
         * Description : Mencoba method run pada cash withdrawal controller dengan input other amount
         * Input amount dalam range yang disediakan namun bukan kelipatan 20
         * Author : Evan Lokajaya
         */
        InputStream input = new ByteArrayInputStream(("6" + System.lineSeparator() + "120").getBytes());
        System.setIn(input);
        Keypad keypad = new Keypad();
    	Screen screen = new Screen();
    	BankDatabase bankdb = new BankDatabase();
    	Transaction transaction = null;
    	WithdrawalController wdController = new WithdrawalController(transaction, keypad, screen);

        assertEquals(wdController.displayMenuOfAmounts(), 120);
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
