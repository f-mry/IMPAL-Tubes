/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
public class DBConnTest {
    
    public DBConnTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getData method, of class DBConn.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String query = "SELECT * FROM `barang`";
        DBConn instance = new DBConn();
        //------------------------------------------
        /**Connection con;
        Statement st;
        int row = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMPAL","root","");
            st = con.createStatement();
            expResult = st.executeQuery(query);
              
            row = expResult.getFetchSize();
            System.out.println(row);
        } catch (Exception e) {
            System.out.println("Error di test: "+ e);
        }
        */
        //-------------------------------------------
        
        ResultSet result = instance.getData(query);
        String namaString = null;
        try {
            System.out.println(result.first());
            namaString = result.getString(3);
            
            System.out.println("try: "+namaString);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(namaString);
        assertEquals("Air Mineral", namaString);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateData method, of class DBConn.
     */
/**    @Test
    public void testUpdateData() {
        System.out.println("updateData");
        String query = "";
        DBConn instance = new DBConn();
        instance.updateData(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/    
}
