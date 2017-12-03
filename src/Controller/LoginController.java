/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.LoginModel;
import View.LoginView;

/**
 *
 * @author farhanm
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;/**
 *
 * @author farhanm
 */
public class LoginController {
    private LoginModel model;
    private LoginView view;

    public LoginController() {
        this.view = new LoginView();
        this.view.setVisible(true);
        this.model = new LoginModel();
        this.view.loginListener(new loginListener());
        
    }
    
    public void nextWindow(String jabatan){
        switch (jabatan){
            case "gudang":
                InputBarangController gudang = new InputBarangController();
                break;
            case "kasir":
                PenjualanBarangController kasir = new PenjualanBarangController();
                break;
                
        }
    }

    class loginListener implements ActionListener {
 
        @Override
        public void actionPerformed(ActionEvent arg0) {
            String username = view.getUser();
            String Pass = view.getPass();
            
            model.DataUser(username, Pass);
            if(model.isUser()== true){
                nextWindow(model.jabatan());
                System.out.println("Berhasil");
                
            }
            else
                view.ErrorMessage("User Tidak Terdaftar");            
        }
    }
    
    
}
