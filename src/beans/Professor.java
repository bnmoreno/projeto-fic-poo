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
 * @author bruno
 */
public class Professor extends Pessoa{

    private Diario turma;
    
    //construtor
    public Professor(Diario turma, String matricula,String senha, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        super(matricula,senha, nome, cpf, endereco, telefone, nascimento, perfil);
        this.turma = turma;
    }

    public Professor(String matricula, String senha, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        super(matricula, senha, nome, cpf, endereco, telefone, nascimento, perfil);
    }
    
    public boolean cadastrarProfessor(Professor professor){
        return Banco.usuarios.add(professor);
    }
    public boolean deletarProfessor(Professor professor){
        return Banco.usuarios.remove(professor);
    }
    
    public void lancarNota(Aluno a, ArrayList<Nota> notas){ 
        a.setNotasDoAluno(notas);
    }
    
    public void atribuirNota(Aluno aluno,Nota nota){
        aluno.addNota(nota);           
    }
    
    public Diario getTurma() {
        return turma;
    }

    public void setTurma(Diario turma) {
        this.turma = turma;
    }
    public void criarDiario(ArrayList<Aluno> alunos,String nome){
         if(!alunos.isEmpty()){
             turma = new Diario(nome, alunos);
             JOptionPane.showMessageDialog(null, "Diario criado com sucesso");
         }else{
             JOptionPane.showMessageDialog(null, "Adicione um aluno");
         }
     }
    
    
}
