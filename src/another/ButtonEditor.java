/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another;

import beans.Aluno;
import gui.FrameEditaAluno;
import gui.Tela_Atribuir_Nota;
import gui.Tela_Cadastros_Secretaria;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author marcio
 */
public class ButtonEditor extends DefaultCellEditor {
  protected JButton button;

  private String label;

  private boolean isPushed;
  
  private JDesktopPane desctop;
  
  private Aluno aluno;
  
  private Tela_Atribuir_Nota tan;
  
  public ButtonEditor(JCheckBox checkBox,JDesktopPane desctop, JTable tabel) {
    super(checkBox);
    this.desctop = desctop;
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         aluno = (Aluno) tabel.getValueAt(tabel.getSelectedRow(), 1);
        fireEditingStopped();
      }
    });
  }

  public Component getTableCellEditorComponent(JTable table, Object value,
      boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else {
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }
    label = (value == null) ? "" : value.toString();
    button.setText(label);
    isPushed = true;
    return button;
  }

  public Object getCellEditorValue() {
    if (isPushed) {
      // 
      //
        if(tan != null)
            tan.dispose();
        tan = new Tela_Atribuir_Nota(aluno);
        desctop.add(tan);
        tan.setVisible(true);
        centralizaForm(tan);
    }
    isPushed = false;
    return new String(label);
  }

  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }

  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
   private void centralizaForm(JInternalFrame frame) {
        
        Dimension desktopSize = desctop.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
      
    }
}

