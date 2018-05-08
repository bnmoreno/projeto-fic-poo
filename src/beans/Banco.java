
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
    public static String ultimoAluno;
    public static String ultimoProfessor;
    public static String ultimoSecretario;
     public static String geradorDeMatricula(char flag) {
        String mat = "";
        Calendar cal = Calendar.getInstance();
        mat += cal.get(Calendar.YEAR);
        //mat de secretario 2018110001...
        //mat de aluno 2018120001...
        //mat de professor 2018130001...
        if (flag == 'S') {
            if (ultimoSecretario==null) {
                ultimoSecretario = mat += "110001";
                return mat ;
            } else {
                long res = Long.parseLong(ultimoSecretario) + (long) 1;
                mat = String.valueOf(res);
                ultimoSecretario = mat;
            }
        }
        if (flag == 'A') {
            if (ultimoAluno==null) {
                ultimoAluno = mat += "120001";
                return mat; 
            } else {
                long res = Long.parseLong(ultimoAluno) + (long) 1;
                mat = String.valueOf(res);
                ultimoAluno = mat;
            }
        }
        if (flag == 'P') {
            if (ultimoProfessor==null) {
                ultimoProfessor = mat += "130001";
                return mat; 
            } else {
                Long res = Long.parseLong(ultimoProfessor) + (long) 1;
                mat = String.valueOf(res);
                ultimoProfessor = mat;
            }
        }
        return mat;
    }

    
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
        usuarios.add(new Professor(new Diario("Diario Teste"), "1234","1234", "Admin", "", "", "", new Date(), 'P'));
      
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
