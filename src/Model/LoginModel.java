/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author farhanm
 */
public class LoginModel {
    private DBConn koneksi = new DBConn();
    private ResultSet rs;
    private boolean user;
    private String errmsg;


    public LoginModel() {
    }

    
   
    public void DataUser(String username,String pass){
        System.out.println(username);
        System.out.println(pass);
        //---------------------------------
        String query = "SELECT * FROM `user` WHERE `username` LIKE '"+username+"' AND `password` LIKE '"+pass+"'";
        //-----------------------------------
        System.out.println(query);
        //------------------------------------
        this.rs = koneksi.getData(query);
        this.user = false;

        try {
            if(rs.getString(1) == username && rs.getString(2) == pass)
                System.out.println(rs.getFetchSize());
                System.out.println(rs.getString(1)+" pass "+rs.getString(2));
                this.user = true;
        } catch (Exception ex) {
            System.out.println("error: "+ex);
        }
    }

    public boolean isUser() {
        return user;
    }
    
   public String jabatan(){
       String jab = null;
        try {
            jab =  rs.getString(3);
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jab;
   }
    
    
    
    
    
}
