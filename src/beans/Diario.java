package beans;
import java.util.ArrayList;
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
    
    private String nome;
    private ArrayList<Object> notasLancadas;
    private int quantidadeEtapas;
    private float notafinal, mediaAprovado, mediaReprovado;
    
    //criando diario apenas como o nome
    public Diario(String nome){
        this.nome = nome;
    }
    
    public Diario(String nome, ArrayList<Object> notasLancadas, int quantidadeEtapas, float notafinal, float mediaAprovado, float mediaReprovado) {
        this.nome = nome;
        this.notasLancadas = notasLancadas;
        this.quantidadeEtapas = quantidadeEtapas;
        this.notafinal = notafinal;
        this.mediaAprovado = mediaAprovado;
        this.mediaReprovado = mediaReprovado;
        
    }

    
    




    

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNotasLancadas(ArrayList<Object> notasLancadas) {
        this.notasLancadas = notasLancadas;
    }

    public ArrayList<Object> getNotasLancadas() {
        return notasLancadas;
    }
    
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

    public float getMediaAprovado() {
        return mediaAprovado;
    }

    public void setMediaAprovado(float mediaAprovado) {
        this.mediaAprovado = mediaAprovado;
    }

    public float getMediaReprovado() {
        return mediaReprovado;
    }

    public void setMediaReprovado(float mediaReprovado) {
        this.mediaReprovado = mediaReprovado;
    }
    
    public void alocarAlunoNaTurma(Aluno aluno) {
        for (Aluno a : Banco.alunosMatriculadosDiario) {
            //Verfica se já tem um aluno cadastrado com o mesmo CPF
            //caso a verificação seja VERDADEIRA, ele informa que já possui um cadastro com aquele CPF no banco 
            if(aluno.getCpf().equals(a.getCpf())){
                JOptionPane.showMessageDialog(null, "ALUNO JÁ CADASTRADO NO DIÁRIO","MENSAGEM", JOptionPane.WARNING_MESSAGE);
            //caso a verificação seja FALSA, ele cadastra no sistema 
            }else{
                boolean status = bankDiario.adicionarAlunoNoDiario(aluno);
                //compara o retorno de adicionarAlunoNoDiario
                if(status){
                    JOptionPane.showMessageDialog(null, "ALUNO CADASTRADO NO DIÁRIO COM SUCESSO","MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "ERRO Nº 1 - AO ALOCAR ALUNO","MENSAGEM", JOptionPane.ERROR_MESSAGE);
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
                    JOptionPane.showMessageDialog(null, "ALUNO REMOVIDO DO DIÁRIO COM SUCESSO!!","MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "ERRO Nº 1 - AO REMOVOER ALUNO","MENSAGEM", JOptionPane.ERROR_MESSAGE);
                }
            //caso a verificação seja FALSA, ele cadastra no sistema 
            }else{
                JOptionPane.showMessageDialog(null, "ALUNO NÃO ESTAR MATRICULADO NO DIÁRIO","MENSAGEM", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }
    
    //falta implementar
    public void lancarNota(Aluno aluno, ArrayList<Double> notas){
        boolean status = Banco.lancarNotasNoDiario(aluno, notas);
        if (status) {
            JOptionPane.showMessageDialog(null, "NOTAS LANÇADA COM SUCESSO","MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "ERRO AO LANÇAR NOTAS","MENSAGEM", JOptionPane.ERROR_MESSAGE);
        }
    }

}
