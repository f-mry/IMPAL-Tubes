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
        
        this.view.cariListener(new cariListen());
        this.view.tambahListener(new tambahListen());
        this.view.bayarListener(new bayarListen());
        
        
    }

    private class bayarListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }



    private class tambahListen implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String nama = view.getNamaBarangForm();
            int jumlah = view.getJumlahForm();
            int harga = view.getHargaForm();
  

            view.updateTableKeranjang(nama, jumlah, harga);
        }
    }

    private class cariListen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ResultSet rs;
            String nama = view.getCariForm();
            if("".equals(view.getCariForm())){
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
