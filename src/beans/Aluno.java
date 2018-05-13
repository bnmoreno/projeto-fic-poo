
package beans;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bruno
 */
public class Aluno extends Pessoa {

    private String nomePai;
    private String nomeMae;
    //Referencia a turma que o aluno pertence...
    private Diario minhaTurma;
    ArrayList<Nota> notasDoAluno = new ArrayList<>();
    
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
        if(aluno.equals(this)){}
        return Banco.usuarios.add(aluno);
    }
    public boolean deletarAluno(Aluno aluno){
        return Banco.usuarios.remove(aluno);
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

    public ArrayList<Nota> getNotasDoAluno() {
        return notasDoAluno;
    }

    public void setNotasDoAluno(ArrayList<Nota> notasDoAluno) {
        this.notasDoAluno = notasDoAluno;
    }

    public double media(){
        double media = 0;
        int pesos = 0;
        for(Nota n : notasDoAluno){
            pesos += n.getPeso();
            media += n.getNota();
        }
        return media/pesos;
    }
    
}
