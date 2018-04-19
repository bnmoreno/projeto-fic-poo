/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class Professor extends Pessoa{

    private Diario turma;
    
    //construtor
    public Professor(Diario turma, String matricula, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        super(matricula, nome, cpf, endereco, telefone, nascimento, perfil);
        this.turma = turma;
    }

    public Diario getTurma() {
        return turma;
    }

    public void setTurma(Diario turma) {
        this.turma = turma;
    }
    
    public void alterarDados(Professor professor) {
    
    }
    
  
}
