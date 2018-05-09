
package beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author matheus
 */
public class Banco {
 
    public static ArrayList<Diario> listaDeDiarios = new ArrayList<Diario>();
    public static ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
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

    
    
    public static void prencherParaTeste(){
        usuarios.add(new Secretaria( "1234","1234", "Admin", "", "", "", new Date(), 'P'));
        usuarios.add(new Professor( "12345","1234", "Admin", "", "", "", new Date(), 'P'));
        usuarios.add(new Aluno( "","","1","1234", "Aluno1", "", "", "", new Date(), 'A'));
        usuarios.add(new Aluno( "","","2","1234", "Aluno2", "", "", "", new Date(), 'A'));
        usuarios.add(new Aluno( "","","3","1234", "Aluno3", "", "", "", new Date(), 'A'));
      
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
