/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author Ramalho
 */
public abstract class Pessoa {

    public static final char ALUNO = 'A';
    public static final char PROFESSOR = 'P';
    public static final char ADMINISTRADOR = 'D';
    
    private String matricula;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Date nascimento;
    private char perfil;
    
    //Não precisa
//    @Override
//    public String toString() {
//        return String.format("Nome: %s\nMatricula: %s\n", nome, matricula);
//    }

    //public abstract void alterarDados();

    public Pessoa() {
    
    }

    
    public Pessoa(String matricula, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.perfil = perfil;
    }
    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public char getPerfil() {
        return perfil;
    }

    public void setPerfil(char perfil) {
        this.perfil = perfil;
    }
    
    
    
}