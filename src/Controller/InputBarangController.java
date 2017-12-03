/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.InputBarangView;
import Model.InputBarangModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.ConsString;

/**
 *
 * @author farhanm
 */
public class InputBarangController {
    private InputBarangView view;
    private InputBarangModel model;

    public InputBarangController() {
        this.view = new InputBarangView();
        this.model = new InputBarangModel();
        this.view.setVisible(true);
        this.view.tambahListener(new tambahListener());
        this.view.cariListener(new cariListen());
        this.view.cariFormListener(new cariFormListener());
        //-------------------------------------
        this.model.initBarang();
        view.updateTabel(model.getBarang());
        
    } 

    class cariFormListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getCari_form()==""){
                model.initBarang();
                ResultSet rs = model.getBarang();
                view.updateTabel(rs);
            }
        }
    }

    class cariListen implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String nama = view.getCari_form();
            ResultSet rs;
            if(!"".equals(view.getCari_form())){
                model.cariBarang(nama);
                rs = model.getBarang();
                view.updateTabel(rs);
            }
            else{
                model.initBarang();
                rs = model.getBarang();
                view.updateTabel(rs);
            }
                
            
            
        }
    }

    class tambahListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            String id = view.getIDBarang_form();
            String nama = view.getNamaBarang_form();
            String tanggal = view.getTanggalPesan_form();
            String harga = view.getHarga_form();
            String jumlah = view.getJumlah_form();

            model.cekBarang(nama);
            if(model.isBarang()==true){
                System.out.println("ada");
                model.updateBarang(nama, id, tanggal, Integer.parseInt(jumlah), Integer.parseInt(harga));
            }
            else{
            
                model.inputBarang(nama, id, tanggal, Integer.parseInt(jumlah), Integer.parseInt(harga));
            }
            view.Message("Data berhasil diinput");
        }
    }
    
    
}
