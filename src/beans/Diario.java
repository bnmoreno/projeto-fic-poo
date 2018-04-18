
package beans;

import java.util.ArrayList;

/**
 *
 * @author Ramalho
 */
public class Diario {

    private Professor professor;
    private ArrayList<Aluno> listadeAlunos = new ArrayList<>();

    public void cadastrarAluno() {

    }

    public void removerAluno() {

    }

    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getListadeAlunos() {
        return listadeAlunos;
    }

    public void setListadeAlunos(ArrayList<Aluno> listadeAlunos) {
        this.listadeAlunos = listadeAlunos;
    }

}
