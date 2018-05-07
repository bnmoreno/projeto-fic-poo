/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author matheus
 */
public class Banco {
 
    public static ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
    public static ArrayList<Diario> listaDeDiarios = new ArrayList<Diario>();
    public static ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
    public static ArrayList<Professor> listaDeProfessores = new ArrayList<Professor>();
    public static ArrayList<Secretaria> listaDeSecretarias = new ArrayList<Secretaria>();
    

    
    //Area de Funções especificas...
    
    //Metodo que gera a matricula automáticamente a matricula do ALUNO
    //no formato temporario de ano-atual+sequencia-do-aluno
    //Exemplo 20180001 para o primeiro aluno
    
//    public static String geradorDeMatriculaDeAluno() {
//        String mat="";
//        
//        Calendar cal = Calendar.getInstance();
//        mat += cal.get(Calendar.YEAR);
//        if(Banco.listaDeAlunos.isEmpty()){
//            return mat+"0001";
//        }else{
//            int indexOfLastStudent = Banco.listaDeAlunos.size()-1;
//            Aluno a = Banco.listaDeAlunos.get(indexOfLastStudent);
//            int res = Integer.parseInt(a.getMatricula())+1;
//            mat = Integer.toString(res);
//        }
//        
//        return mat;
//    }
    
    public static void prencherParaTeste(){
        usuarios.add(new Professor(new Diario("Diario Teste"), "1234","1234", "Denilson", "", "", "", new Date(), 'P'));
      
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
