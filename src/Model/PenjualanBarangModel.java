/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author farhanm
 */
public class PenjualanBarangModel {
    private DBConn koneksi = new DBConn();
    private boolean user;
    private String errmsg;
    

    public PenjualanBarangModel() {
    }
    
    public void JualBarang(String id, String nama,int harga, int jumlah,int jAwal){
        int total = harga*jumlah;
        DateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String tanggal = dateform.format(date);
        String query = "INSERT INTO `penjualan` (`Tanggal`, `Kode Barang`, `Nama Barang`, `Harga`, `Jumlah`, `Total`) VALUES ('"+tanggal+"', '"+id+"', '"+nama+"', '"+harga+"', '"+jumlah+"', '"+total+"') ";
        koneksi.updateData(query);
        jumlah = jAwal-jumlah;
        query = "UPDATE `barang` SET `Jumlah Barang`='"+jumlah+"' WHERE `Nama Barang`='"+nama+"'";
        koneksi.updateData(query);        
    }
    
    
    
    
    
    
}
