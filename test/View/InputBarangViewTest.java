/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author farhanm
 */
public class InputBarangViewTest {
    
    public InputBarangViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIDBarang_form method, of class InputBarangView.
     */
    @Test
    public void testGetIDBarang_form() {
        System.out.println("getIDBarang_form");
        InputBarangView instance = new InputBarangView();
        String expResult = "";
        String result = instance.getIDBarang_form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarga_form method, of class InputBarangView.
     */
    @Test
    public void testGetHarga_form() {
        System.out.println("getHarga_form");
        InputBarangView instance = new InputBarangView();
        String expResult = "";
        String result = instance.getHarga_form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJumlah_form method, of class InputBarangView.
     */
    @Test
    public void testGetJumlah_form() {
        System.out.println("getJumlah_form");
        InputBarangView instance = new InputBarangView();
        String expResult = "";
        String result = instance.getJumlah_form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamaBarang_form method, of class InputBarangView.
     */
    @Test
    public void testGetNamaBarang_form() {
        System.out.println("getNamaBarang_form");
        InputBarangView instance = new InputBarangView();
        String expResult = "";
        String result = instance.getNamaBarang_form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTanggalPesan_form method, of class InputBarangView.
     */
    @Test
    public void testGetTanggalPesan_form() {
        System.out.println("getTanggalPesan_form");
        InputBarangView instance = new InputBarangView();
        String expResult = "";
        String result = instance.getTanggalPesan_form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCari_form method, of class InputBarangView.
     */
    @Test
    public void testGetCari_form() {
        System.out.println("getCari_form");
        InputBarangView instance = new InputBarangView();
        String expResult = "";
        String result = instance.getCari_form();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tambahListener method, of class InputBarangView.
     */
    @Test
    public void testTambahListener() {
        System.out.println("tambahListener");
        ActionListener tambahListen = null;
        InputBarangView instance = new InputBarangView();
        instance.tambahListener(tambahListen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cariListener method, of class InputBarangView.
     */
    @Test
    public void testCariListener() {
        System.out.println("cariListener");
        ActionListener cariListen = null;
        InputBarangView instance = new InputBarangView();
        instance.cariListener(cariListen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cariFormListener method, of class InputBarangView.
     */
    @Test
    public void testCariFormListener() {
        System.out.println("cariFormListener");
        ActionListener cariFormListen = null;
        InputBarangView instance = new InputBarangView();
        instance.cariFormListener(cariFormListen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Message method, of class InputBarangView.
     */
    @Test
    public void testMessage() {
        System.out.println("Message");
        String s = "";
        InputBarangView instance = new InputBarangView();
        instance.Message(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTabel method, of class InputBarangView.
     */
    @Test
    public void testUpdateTabel() {
        System.out.println("updateTabel");
        ResultSet rs = null;
        InputBarangView instance = new InputBarangView();
        instance.updateTabel(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class InputBarangView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InputBarangView.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
