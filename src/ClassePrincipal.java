
import gui.PrincipalJanela;

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
                new PrincipalJanela().setVisible(true);
            }
        });

    }

}
