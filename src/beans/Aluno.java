/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import static beans.Banco.listaDeAlunos;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bruno
 */
public class Aluno extends Pessoa {

    private String nomePai;
    private String nomeMae;
    //Referencia a trma que o aluno pertence...
    private Diario minhaTurma;
    ArrayList<Double> notasDoAluno = new ArrayList<>();
    
    //construtor
    public Aluno(String nomePai, String nomeMae, String matricula, String senha, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        super(matricula, senha, nome, cpf, endereco, telefone, nascimento, perfil);
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }
    
//    public Aluno verBoletim(Aluno a) {
//       Aluno notaDoAluno=null;
//       for (Aluno aluno: Banco.listaDeAlunos) {    
//            if(a.getMatricula().equals(aluno.getMatricula())){
//                notaDoAluno = aluno;
//            }
//        }
//       return notaDoAluno;
//    }

    public boolean cadastrarAluno(Aluno aluno){
        Banco.listaDeAlunos.add(aluno);
        return Banco.usuarios.add(aluno);
    }
    public boolean deletarAluno(Aluno aluno){
        return listaDeAlunos.remove(aluno);
    }
    
    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Diario getMinhaTurma() {
        return minhaTurma;
    }

    public void setMinhaTurma(Diario minhaTurma) {
        this.minhaTurma = minhaTurma;
    }

    public ArrayList<Double> getNotasDoAluno() {
        return notasDoAluno;
    }

    public void setNotasDoAluno(ArrayList<Double> notasDoAluno) {
        this.notasDoAluno = notasDoAluno;
    }
    
    
}
