/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;

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
    
    public void JualBarang(String nama, String id, String tanggal,int harga, int jumlah){
        int total = harga*jumlah;
        String query = "UPDATE `penjualan` SET `Tanggal`='"+tanggal+"',`Kode Barang`='"+id+"',`Nama Barang`='"+nama+"',`Harga`='"+harga+"',`Jumlah`='"+jumlah+"',`Total`='"+total+"' WHERE `Nama Barang`='"+nama+"'";
        koneksi.updateData(query);
        
        query = "UPDATE `barang` SET `Jumlah Barang`='"+jumlah+"' WHERE `Nama Barang`='"+nama+"'";
        koneksi.updateData(query);        
    }
    
    
    
    
    
    
}
