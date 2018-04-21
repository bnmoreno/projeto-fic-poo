package beans;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramalho
 */
public class Diario {
//    O professor que tem um diario
//    private Professor professor;

//    Esse array tem que ficar na classe Banco
//    private ArrayList<Aluno> listadeAlunos = new ArrayList<>();

    Banco bankDiario = new Banco();
    
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
        for (Aluno a : Banco.alunosMatriculadosDiario) {
            //Verfica se já tem um aluno cadastrado com o mesmo CPF
            //caso a verificação seja VERDADEIRA, ele informa que já possui um cadastro com aquele CPF no banco 
            if(aluno.getCpf().equals(a.getCpf())){
                JOptionPane.showMessageDialog(null, "ALUNO JÁ CADASTRADO NO DIÁRIO");
            //caso a verificação seja FALSA, ele cadastra no sistema 
            }else{
                boolean status = bankDiario.adicionarAlunoNoDiario(aluno);
                //compara o retorno de adicionarAlunoNoDiario
                if(status){
                    JOptionPane.showMessageDialog(null, "ALUNO CADASTRADO NO DIÁRIO COM SUCESSO");
                }else{
                    JOptionPane.showMessageDialog(null, "ERRO Nº 1 - AO ALOCAR ALUNO");
                }
                
            }
            
        }
        
        
    }

    public void removerAlunoDaTurma(Aluno aluno) {
         for (Aluno a : Banco.alunosMatriculadosDiario) {
            //Verfica se já tem um aluno cadastrado com o mesmo CPF
            //caso a verificação seja VERDADEIRA, ele informa que já possui um cadastro com aquele CPF no banco 
            if(aluno.getCpf().equals(a.getCpf())){
                boolean status = bankDiario.removerAlunoDoDiario(aluno);
                //compara o retorno de adicionarAlunoNoDiario
                if(status){
                    JOptionPane.showMessageDialog(null, "ALUNO REMOVIDO DO DIÁRIO COM SUCESSO!!");
                }else{
                    JOptionPane.showMessageDialog(null, "ERRO Nº 1 - AO REMOVOER ALUNO");
                }
            //caso a verificação seja FALSA, ele cadastra no sistema 
            }else{
                JOptionPane.showMessageDialog(null, "ALUNO NÃO ESTAR MATRICULADO NO DI");
            }
            
        }
    }
    
    //falta implementar
    public void lancarNota(){
        
    }

}
