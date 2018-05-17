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

    
    private String nome;
    private ArrayList<Aluno> listaDeAlunosDiario;
    private int quantidadeEtapas;
    private float notafinal, mediaAprovado, mediaReprovado;
    private char tipoMedia;
    public static final char PONDERADA = 'P';
    public static final char ARITEMETICA = 'A';
    
    ArrayList<Integer> PesoPorEtapa = new ArrayList<>();
    
    //private double notasDeAluno[] = new double[quantidadeEtapas];
    
    
    
    //criando diario apenas como o nome
    public Diario(String nome){
        this.nome = nome;
        listaDeAlunosDiario = new ArrayList<>();
    }

    public Diario(String nome, ArrayList<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.listaDeAlunosDiario = listaDeAlunos;
    }
    
    
    public Diario(String nome, ArrayList<Aluno> alunos, int quantidadeEtapas, float notafinal, float mediaAprovado, float mediaReprovado) {
        this.nome = nome;
        this.listaDeAlunosDiario = alunos;
        this.quantidadeEtapas = quantidadeEtapas;
        this.notafinal = notafinal;
        this.mediaAprovado = mediaAprovado;
        this.mediaReprovado = mediaReprovado;
    }

    public ArrayList<Aluno> getListaDeAlunosDiario() {
        return listaDeAlunosDiario;
    }

    public void setListaDeAlunosDiario(ArrayList<Aluno> listaDeAlunosDiario) {
        this.listaDeAlunosDiario = listaDeAlunosDiario;
    }

    public char getTipoMedia() {
        return tipoMedia;
    }

    public void setTipoMedia(char tipoMedia) {
        this.tipoMedia = tipoMedia;
    }

    public ArrayList<Integer> getPesoPorEtapa() {
        return PesoPorEtapa;
    }

    public void setPesoPorEtapa(ArrayList<Integer> PesoPorEtapa) {
        this.PesoPorEtapa = PesoPorEtapa;
    }
    
    public boolean cadastrarAlunoDiario(Aluno aluno){
        return listaDeAlunosDiario.add(aluno);
    }
    public boolean deletarAlunoDiario(Aluno aluno){
        return listaDeAlunosDiario.remove(aluno);
    }
    
    
    public ArrayList<Aluno> getAlunos() {
        return listaDeAlunosDiario;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.listaDeAlunosDiario = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public void addAluno(Aluno aluno){
        this.listaDeAlunosDiario.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        this.listaDeAlunosDiario.remove(aluno);
    }
    //falta implementar
//    public void lancarNota(Aluno aluno, ArrayList<Double> notas){
//        boolean status = Banco.lancarNotasNoDiario(aluno, notas);
//        if (status) {
//            JOptionPane.showMessageDialog(null, "NOTAS LANÇADA COM SUCESSO","MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
//        }else{
//            JOptionPane.showMessageDialog(null, "ERRO AO LANÇAR NOTAS","MENSAGEM", JOptionPane.ERROR_MESSAGE);
//        }
//    }

    @Override
    public String toString() {
        return nome; 
    }
    

}
