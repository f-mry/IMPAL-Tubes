/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;


/**
 *
 * @author farhanm
 */
public class DBConn {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMPAL","root","");
            st = con.createStatement();
            System.out.println("Koneksi Berhasil");
            
            
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }        
    }
    
    public ResultSet getData(String query){
        try {
            rs = st.executeQuery(query);
            System.out.println(query);
            rs.next();
            System.out.println("Get data berhasil");
            
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        return rs;
    }
    
    public void updateData(String query){
        try {
            st.execute(query);
            System.out.println("berhasil update");
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
