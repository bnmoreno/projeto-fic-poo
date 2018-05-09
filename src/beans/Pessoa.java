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
    private String senha;

    private char perfil;

    @Override
    public String toString() {
        return nome;
    }

    //public abstract void alterarDados();
    public Pessoa() {

    }

    public Pessoa(String matricula, String senha, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.perfil = perfil;
    }

    public Object alterarDados(Pessoa pessoa){
        Pessoa pessoasaida = null;
        
        for (Pessoa p : Banco.usuarios) {
            if (pessoa.getMatricula().equals(p.getMatricula())) {
                pessoasaida =  p;
            }
        }
        
        return pessoasaida;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa) obj;
        if(pessoa.getMatricula() == matricula)
            return true;
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
