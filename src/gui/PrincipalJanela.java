/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Aluno;
import beans.Banco;
import beans.Pessoa;
import beans.Professor;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class PrincipalJanela extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJanela
     */
    private CardLayout cd01 = new CardLayout();
    private ArrayList<JPanel> cartoes = new ArrayList<JPanel>();
    private JPanel ultimoPainel;
    private Pessoa pessoa;
    private Banco banco;
    public PrincipalJanela() {
        initComponents();
       
        
        //layout do inicio
        banco = new Banco();
        banco.prencherParaTeste();
        this.setExtendedState(MAXIMIZED_BOTH);   
        jMenuBar1.setVisible(false);//
        
        for(Pessoa pessoa:Banco.usuarios){
            System.out.println(pessoa.getMatricula() + pessoa.getSenha());
        }
    }
    
    public void mudarDeTela(JPanel tela, String nomeDaTela) {
        if (!cartoes.isEmpty()) {
            boolean flag = false;
            for (JPanel t : cartoes) {
                if (t.getClass().isInstance(tela)) {
                    flag = true;
                }
            }
            if (!flag) {

                cartoes.add(tela);
                jPanel3.add(tela, nomeDaTela);
            }
        } else {

            cartoes.add(tela);
            jPanel3.add(tela, nomeDaTela);
        }
        ultimoPainel = cartoes.get(0);
        cartoes.removeAll(cartoes);
        CardLayout layoutDeCartao = (CardLayout) jPanel3.getLayout();
        layoutDeCartao.show(jPanel3, nomeDaTela);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new JGradientPanel(Color.WHITE,Color.BLUE);
        jPanel2 = new JGradientPanel(Color.WHITE,Color.BLUE);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        acessar = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel3.setMaximumSize(new java.awt.Dimension(680, 700));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 700));
        jPanel3.setLayout(new java.awt.CardLayout());

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanel2Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/use.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipady = -14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Faça seu Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("Matricula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(jLabel8, gridBagConstraints);

        acessar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagem2.png"))); // NOI18N
        acessar.setText("Acessar");
        acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel2.add(acessar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(login, gridBagConstraints);

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel2.add(senha, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        jPanel2.add(jLabel1, gridBagConstraints);

        jPanel3.add(jPanel2, "card2");

        getContentPane().add(jPanel3, "card2");

        jMenu1.setText("Diario");

        jMenuItem1.setText("Novo Diario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ver Diario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadatros");

        jMenuItem4.setText("Cadastrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ver diario");

        jMenuItem5.setText("Ver diario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Sair");

        jMenuItem3.setText("Sair do Sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarActionPerformed
        for(Pessoa pessoa:Banco.usuarios){
            if(login.getText().equals(pessoa.getMatricula()) && (senha.getText().equals(pessoa.getSenha()))){
                if(pessoa instanceof Professor){
                    mudarDeTela(new ScreenDiary(pessoa), "ScreenDiary");
                    this.pessoa = pessoa;
                    jMenuBar1.setVisible(true);
                    jMenu4.setVisible(false);
                }else if(pessoa instanceof Aluno){
                    Aluno aluno = (Aluno) pessoa;
                    mudarDeTela(new ScreenReportCard(aluno), "ScreenReportCard");
                    jMenuBar1.setVisible(true);
                    jMenu1.setVisible(false);
                    jMenu2.setVisible(false);
                }
            }else{
                jLabel1.setText("Login ou senha incorreta");
                //
            }
        }
        

    }//GEN-LAST:event_acessarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mudarDeTela(new ScreenNewDiary((Professor)pessoa), "ScreenNewDiary");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        mudarDeTela(new ScreenDiary(pessoa), "ScreenDiary");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            acessar.doClick();
            
        } 
    }//GEN-LAST:event_senhaKeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Integer opcao = JOptionPane.showConfirmDialog(null, "Deseja Sair do Sistena","Saindo",JOptionPane.OK_CANCEL_OPTION);
        
        if (opcao!=2 & opcao!=1){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        mudarDeTela(new Cadastro(), "Cadastro");
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        mudarDeTela(new ScreenReportCard(pessoa), "ScreenReportCard");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
