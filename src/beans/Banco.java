/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class Banco {
 
    private ArrayList<Aluno> listadeAlunos = new ArrayList<>();
    
    public void cadastrarAluno(Aluno aluno){
        boolean status = listadeAlunos.add(aluno);
        if(status){
            JOptionPane.showMessageDialog(null, "ALUNO CADASTRADO COM SUCESSO!");
        }else{
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR ALUNO!!");
        }
    }
    public void removerAluno(Aluno aluno){
        boolean status = listadeAlunos.remove(aluno);
        if(status){
            JOptionPane.showMessageDialog(null, "ALUNO REMOVIDO DO SISTEMA COM SUCESSO!");
        }else{
            JOptionPane.showMessageDialog(null, "ERRO AO REMOVER ALUNO!!");
        }
    }
    
}
