/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

/**
 *
 * @author Dr. Baharav
 */
public class Euler461Test {
    
    public Euler461Test() {
    }

    /**
     * Test of fnk method, of class Euler461.
     */
    @Test
    public void t10_testFnk() {
        System.out.print("fnk");
        int n = 200;
        int k = 0;
        Euler461 instance = new Euler461(n);
        //double expResult = Math.exp(k/(double)n)-1;
        double expResult = 0;
        double result = instance.fnk(k);
        assertEquals(expResult, result, 0.01);
        System.out.println("\t\t--> Passed successfuly");
    }

        /**
     * Test of fnk method, of class Euler461.
     */
    @Test
    public void t11_testFnk() {
        System.out.print("fnk");
        int n = 10;
        int k = 3;
        Euler461 instance = new Euler461(n);
        double expResult = 0.3498588;
        double result = instance.fnk(k);
        assertEquals(expResult, result, 0.01);
        System.out.println("\t\t--> Passed successfuly");
    }

    /**
     * Test of distPI method, of class Euler461.
     */
    @Test
    public void t20_testDistPI() {
        System.out.print("distPI");
        double val = 3.1;
        int n = 10;
        Euler461 instance = new Euler461(n);
        double expResult = 0.0415;
        double result = instance.distPI(val);
        assertEquals(expResult, result, 0.01);
        System.out.println("\t\t--> Passed successfuly");
    }


    /**
     * Test of distPI method, of class Euler461.
     */
    @Test
    public void t21_testDistPI() {
        System.out.print("distPI");
        double val = -1;
        int n = 10;
        Euler461 instance = new Euler461(n);
        double expResult = 4.1415;
        double result = instance.distPI(val);
        assertEquals(expResult, result, 0.01);
        System.out.println("\t\t--> Passed successfuly");
    }


    /**
     * Test of g method, of class Euler461.
     */
    @Test
    public void t30_testG() {
        System.out.print("g");
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        
        int n = 10;
        Euler461 instance = new Euler461(n);
        int expResult = 54;
        int result = instance.g(a, b, c, d);
        assertEquals(expResult, result);
        System.out.println("\t\t--> Passed successfuly");
    }

    /**
     * Test of solve method, of class Euler461.
     */
    @Test
    public void t40_testSolve() {
        System.out.print("solve");
        int n=10;
        Euler461 instance = new Euler461(n);
        int expResult = 180;
        int result = instance.solve();
        assertEquals(expResult, result);
        System.out.println("\t\t--> Passed successfuly");
    }
    
    /**
     * Test of solve method, of class Euler461.
     */
    @Test
    public void t42_testSolve() {
        System.out.print("solve");
        int n=20;
        Euler461 instance = new Euler461(n);
        int expResult = 595;
        int result = instance.solve();
        assertEquals(expResult, result);
        System.out.println("\t\t--> Passed successfuly");
    }

    /**
     * Test of solve method, of class Euler461.
     */
    @Test
    public void t43_testSolve() {
        System.out.print("solve");
        int n=30;
        Euler461 instance = new Euler461(n);
        int expResult = 1399;
        int result = instance.solve();
        assertEquals(expResult, result);
        System.out.println("\t\t--> Passed successfuly");
    }

    /**
     * Test of solve method, of class Euler461.
     */
    @Test
    public void t44_testSolve() {
        System.out.print("solve");
        int n=40;
        Euler461 instance = new Euler461(n);
        int expResult = 2443;
        int result = instance.solve();
        assertEquals(expResult, result);
        System.out.println("\t\t--> Passed successfuly");
    }



    /**
     * Test of solve method, of class Euler461.
     */
    @Test
    public void t47_testSolve() {
        System.out.print("solve");
        int n=200;
        Euler461 instance = new Euler461(n);
        int expResult = 64658;
        int result = instance.solve();
        assertEquals(expResult, result);
        System.out.println("\t\t--> Passed successfuly");
    }
    
}
