/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Notas {
    Aluno aluno;
    ArrayList<Double> notas;

    public Notas(Aluno aluno, ArrayList<Double> notas) {
        this.aluno = aluno;
        this.notas = notas;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    
}
