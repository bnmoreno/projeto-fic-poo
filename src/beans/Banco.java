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
 
    public static ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
    public static ArrayList<Aluno> alunosMatriculadosDiario = new ArrayList<Aluno>();
    public static ArrayList<Professor> professorCadastrados = new ArrayList<Professor>();
    public static ArrayList<Object> todasAsNotasDosAluno = new ArrayList<Object>();
    
    public boolean cadastrarAluno(Aluno aluno){
        return listaDeAlunos.add(aluno);
    }
    public boolean removerAluno(Aluno aluno){
        return listaDeAlunos.remove(aluno);
    }

    //metodos para colocar aluno na turma
    public boolean adicionarAlunoNoDiario(Aluno aluno){
        return alunosMatriculadosDiario.add(aluno);
    }
    //metodo para retirar aluno da turma
    public boolean removerAlunoDoDiario(Aluno aluno){
        return alunosMatriculadosDiario.remove(aluno);
    }
    //Lancador de notas
    //static apenas para teste
    public static boolean lancarNotasNoDiario(Aluno a, ArrayList<Double> notas){
        Notas lancarNota = new Notas(a.getNome(),a.getCpf(),a.getMatricula(), notas);
        return todasAsNotasDosAluno.add(lancarNota);
    }
    
    public static ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public static ArrayList<Professor> getProfessorCadastrados() {
        return professorCadastrados;
    }
    
    public Object alterarDados(Object obj){
//        if(){
//            
//        }else if(){
//            
//        }else if(){
//            
        return obj;
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
