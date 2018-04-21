/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Aluno extends Pessoa{

    
    
    private String nomePai;
    private String nomeMae;
    
    
    //construtor
    public Aluno(String nomePai, String nomeMae, String matricula, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        super(matricula, nome, cpf, endereco, telefone, nascimento, perfil);
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    public Aluno alterarDados(String matricula) {
        Aluno a = null;       
        for (Aluno aluno : Banco.listaDeAlunos) {
            if(matricula.equals(aluno.getMatricula())){
                a = aluno;
            }
        }
        if(a!=null){
            return a;
        }else{
            JOptionPane.showConfirmDialog(null, "ALUNO NÃO ENCONTRADO NO SISTEMA!!!!");
            return null;
        }        
    }
    
    public void verBoletim(String matricula){
        
    }

    
}
