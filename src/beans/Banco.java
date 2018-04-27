/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class Banco {
 
    public static ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
    public static ArrayList<Diario> listaDeDiarios = new ArrayList<Diario>();
    public static ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
    public static ArrayList<Object> todasAsNotasDosAluno = new ArrayList<Object>();
    
    public static boolean cadastrarAluno(Aluno aluno){
        return listaDeAlunos.add(aluno);
    }
    public static boolean removerAluno(Aluno aluno){
        return listaDeAlunos.remove(aluno);
    }

    //metodos para colocar aluno na turma
 
    //Lancador de notas
    //static apenas para teste
    public static boolean lancarNotasNoDiario(Aluno a, ArrayList<Double> notas){
        Notas lancarNota = new Notas(a.getNome(),a.getCpf(),a.getMatricula(), notas);
        return todasAsNotasDosAluno.add(lancarNota);
    }
    
    public static ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    //Area de Funções especificas...
    
    //Metodo que gera a matricula automáticamente a matricula do ALUNO
    //no formato temporario de ano-atual+sequencia-do-aluno
    //Exemplo 20180001 para o primeiro aluno
    
    public static String geradorDeMatriculaDeAluno() {
        String mat="";
        Calendar cal = Calendar.getInstance();
        mat += cal.get(Calendar.YEAR);
        if(Banco.getListaDeAlunos().isEmpty()){
            return mat+"0001";
        }else{
            int indexOfLastStudent = Banco.getListaDeAlunos().size()-1;
            Aluno a = Banco.listaDeAlunos.get(indexOfLastStudent);
            int res = Integer.parseInt(a.getMatricula())+1;
            mat = Integer.toString(res);
        }
        
        return mat;
    }
    
    public static Object alterarDados(Pessoa pessoa){
        Pessoa pessoasaida = null;
        String matricula = pessoa.getMatricula();
        
        if(pessoa instanceof Aluno){
            for (Aluno aluno : Banco.listaDeAlunos) {
            if (matricula.equals(aluno.getMatricula())) {
                pessoasaida = aluno;
            }
        }
        }else if(pessoa instanceof Professor){
            
        }else if(pessoa instanceof Secretaria){
            
        }   
        return pessoasaida;
    }
    
    public void prencherParaTeste(){
        usuarios.add(new Professor(new Diario("Diario Teste"), "1234","1234", "Denilson", "", "", "", new Date(), 'P'));
        cadastrarAluno(new Aluno("João", "Maria", "201","1234", "Niguem", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "202","1234", "Alguem", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "203","1234", "Fulano", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "204","1234", "Sicrano", "111", "endereco", "telefone", new Date(), 'A'));
        cadastrarAluno(new Aluno("João", "Maria", "205","1234", "Beotrano", "111", "endereco", "telefone", new Date(), 'A'));
   }
//    public void alterarDadosAluno(String matricula){
//        boolean teste;
//        for(Aluno a: listaDeAlunos){
//            if(matricula.equals(a.getMatricula())){
//                
//            }
//        }
//    }
    
}
