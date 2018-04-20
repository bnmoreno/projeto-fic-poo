/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Date;
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
    public ArrayList<Aluno> getAlunos(){
        return listaDeAlunos;
    }
    public void prencherParaTeste(){
        cadastrarAluno(new Aluno("João", "Maria", "201", "Niguem", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "202", "Alguem", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "203", "Fulano", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "204", "Sicrano", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "205", "Beotrano", "111", "endereco", "telefone", new Date(), 'A'));
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
