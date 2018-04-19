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
 
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    
    public boolean cadastrarAluno(Aluno aluno){
        boolean status = listaDeAlunos.add(aluno);
        return status;
    }
    public boolean removerAluno(Aluno aluno){
        boolean status = listaDeAlunos.remove(aluno);
        return status;
    }
//    public void alterarDadosAluno(String matricula){
//        boolean teste;
//        for(Aluno a: listaDeAlunos){
//            if(matricula.equals(a.getMatricula())){
//                
//            }
//        }
//    }
    
}
