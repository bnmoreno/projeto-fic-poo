
package beans;

import java.util.ArrayList;

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
    private float media;

    public int getQuantidadeEtapas() {
        return quantidadeEtapas;
    }

    public void setQuantidadeEtapas(int quantidadeEtapas) {
        this.quantidadeEtapas = quantidadeEtapas;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public void alocarAlunoNaTurma(Aluno aluno) {
        //teste
    }

    public void removerAlunoDaTurma(Aluno aluno) {

    }

}
