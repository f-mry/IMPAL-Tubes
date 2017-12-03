/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.InputBarangModel;
import Model.PenjualanBarangModel;
import View.PenjualanBarangView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

        

/**
 *
 * @author farhanm
 */
public class PenjualanBarangController {
    private PenjualanBarangModel model;
    private PenjualanBarangView view;
    private InputBarangModel barang;

    public PenjualanBarangController() {
        this.model = new PenjualanBarangModel();
        this.view = new PenjualanBarangView();
        this.barang = new InputBarangModel();
        view.setVisible(true);
        
        this.view.cariListener(new cariListen());
        this.view.tambahListener(new tambahListen());
        this.view.bayarListener(new bayarListen());
        
        
        
        
    }

    private class bayarListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = 0;
            ResultSet rs;
            String[] value;
            while (i < view.nBarang()){
                value = view.kernajangRow(i);
                System.out.println("bayarlisten valuee 1: "+value[1]);
                barang.cariBarang(value[1]);
                rs = barang.getBarang();
                int jAwal=0;
                try {
                    jAwal = Integer.parseInt(rs.getString(4));
                } catch (SQLException ex) {
                    Logger.getLogger(PenjualanBarangController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                model.JualBarang(value[0], value[1], Integer.parseInt(value[3]), Integer.parseInt(value[2]),jAwal);
                i++;
            }
            
        }
    }



    private class tambahListen implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String nama = view.getNamaBarangForm();
            int jumlah = view.getJumlahForm();
            int harga = view.getHargaForm();
            String id = view.getKodeBarangForm();

            view.updateTableKeranjang(id,nama, jumlah, harga);
            view.setTotalForm();
        }
    }

    private class cariListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ResultSet rs;
            String nama = view.getCariForm();
            if("".equals(view.getCariForm())){
                //System.out.println("kosong");
                barang.initBarang();
                rs = barang.getBarang();
                view.updateCariTable(rs);
            }
            else{
                barang.cariBarang(nama);
                rs = barang.getBarang();
                view.updateCariTable(rs);
            }  
        }
    }
    

    
 
}
