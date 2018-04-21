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
    String nome;
    String cpf;
    String matricula;
    ArrayList<Double> notas;

    public Notas(String nome, String cpf, String matricula, ArrayList<Double> notas) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.notas = notas;
    }
    
}
