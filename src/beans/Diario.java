package beans;

/**
 *
 * @author Ramalho
 */
public class Diario {
//    O professor que tem um diario
//    private Professor professor;

//    Esse array tem que ficar na classe Banco
//    private ArrayList<Aluno> listadeAlunos = new ArrayList<>();

    private int quantidadeEtapas;
    private float notafinal;
    
    public int getQuantidadeEtapas() {
        return quantidadeEtapas;
    }

    public void setQuantidadeEtapas(int quantidadeEtapas) {
        this.quantidadeEtapas = quantidadeEtapas;
    }

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }
    
    public void alocarAlunoNaTurma(Aluno aluno) {
        //teste
    }

    public void removerAlunoDaTurma(Aluno aluno) {

    }

}
