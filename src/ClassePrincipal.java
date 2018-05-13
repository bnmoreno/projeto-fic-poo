
import beans.Banco;
import gui.Login_Scream;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class ClassePrincipal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Banco.prencherParaTeste();
                new Login_Scream().setVisible(true);
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
            }
        });

    }

}
