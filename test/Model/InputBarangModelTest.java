/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author farhanm
 */
public class InputBarangModelTest {
    
    public InputBarangModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of cariBarang method, of class InputBarangModel.
     */
    @Test
    public void testCariBarang() {
        System.out.println("cariBarang");
        String nama = "Susu kaleng";
        InputBarangModel instance = new InputBarangModel();
        instance.cariBarang(nama);
        try {
            nama = instance.getBarang().getString("Nama Barang");
        } catch (SQLException ex) {
            Logger.getLogger(InputBarangModelTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("Susu kaleng", nama);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
/**
    /**
     * Test of initBarang method, of class InputBarangModel.
    */ 
    @Test
    public void testInitBarang() {
        System.out.println("initBarang");
        InputBarangModel instance = new InputBarangModel();
        instance.initBarang();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBarang method, of class InputBarangModel.
     */
    @Test
    public void testGetBarang() {
        System.out.println("getBarang");
        InputBarangModel instance = new InputBarangModel();
        ResultSet expResult = null;
        ResultSet result = instance.getBarang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inputBarang method, of class InputBarangModel.
     */
    @Test
    public void testInputBarang() {
        System.out.println("inputBarang");
        String nama = "";
        String id = "";
        String tanggal = "";
        int jumlah = 0;
        int harga = 0;
        InputBarangModel instance = new InputBarangModel();
        instance.inputBarang(nama, id, tanggal, jumlah, harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBarang method, of class InputBarangModel.
     */
    @Test
    public void testUpdateBarang() {
        System.out.println("updateBarang");
        String nama = "";
        String id = "";
        String tanggal = "";
        int jumlah = 0;
        int harga = 0;
        InputBarangModel instance = new InputBarangModel();
        instance.updateBarang(nama, id, tanggal, jumlah, harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekBarang method, of class InputBarangModel.
     */
    @Test
    public void testCekBarang() {
        System.out.println("cekBarang");
        String nama = "";
        InputBarangModel instance = new InputBarangModel();
        instance.cekBarang(nama);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBarang method, of class InputBarangModel.
     */
    @Test
    public void testIsBarang() {
        System.out.println("isBarang");
        InputBarangModel instance = new InputBarangModel();
        boolean expResult = false;
        boolean result = instance.isBarang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
