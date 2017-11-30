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
public class InputBarangModel {
    private DBConn koneksi = new DBConn();
    private ResultSet rs;
    private String errmsg;
    private boolean barang;

    public InputBarangModel() {
    }
    
    public void cariBarang(String nama){
        String query = "SELECT * FROM `barang` WHERE `Nama Barang` LIKE '"+nama+"'";
        System.out.println(query);
        this.rs = koneksi.getData(query);
    }
    
    public void initBarang(){
        String query = "SELECT * FROM `barang`";
        System.out.println(query);
        this.rs = koneksi.getData(query);    
    }

    public ResultSet getBarang() {
        return this.rs;
    }
    
    public void inputBarang(String nama,String id,String tanggal,int jumlah,int harga){
        String query = "INSERT INTO `barang` (`Tanggal Pemesanan`, `ID Barang`, `Nama Barang`, `Jumlah Barang`, `Harga per Satuan`) VALUES ('"+tanggal+"', '"+id+"', '"+nama+"', '"+jumlah+"', '"+harga+"');";
        System.out.println(query);
        koneksi.updateData(query);
    }
    
    public void updateBarang(String nama,String id,String tanggal,int jumlah,int harga){
        String query = "UPDATE `barang` SET `Tanggal Pemesanan`='"+tanggal+"',`ID Barang`='"+id+"',`Nama Barang`='"+nama+"',`Jumlah Barang`='"+jumlah+"',`Harga per Satuan`='"+harga+"' WHERE `Nama Barang`='"+nama+"'";
        System.out.println(query);
        koneksi.updateData(query);
    }
    
    public void cekBarang(String nama){
        this.barang = false;
        String query = "SELECT * FROM `barang` WHERE `Nama Barang` LIKE '"+nama+"'";
        System.out.println(query);
        this.rs = koneksi.getData(query);
        try {
            String cek = this.rs.getString(3);
            System.out.println(cek);
            System.out.println(cek+" = "+nama);
            if (this.rs.getString(3) == nama){
                this.barang = true;
                System.out.println("ada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputBarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("hasil cek : "+this.barang);
    }
    
 

    public boolean isBarang() {
        return this.barang;
    }
    
    
    
    
    
   
    
}
