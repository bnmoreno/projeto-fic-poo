/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

/**
 *
 * @author matheus
 */
public class Secretaria extends Pessoa{

    public Secretaria() {
    }
    
    public Secretaria(String matricula, String senha, String nome, String cpf, String endereco, String telefone, Date nascimento, char perfil) {
        super(matricula, senha, nome, cpf, endereco, telefone, nascimento, perfil);
    }

    public boolean cadastrarSecretaria(Secretaria secretaria){
        return Banco.usuarios.add(secretaria);
    }
    public boolean deletarSecretaria(Secretaria secretaria){
        return Banco.usuarios.remove(secretaria);
    }
}
