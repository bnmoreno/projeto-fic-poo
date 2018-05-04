/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author matheus
 */
public class Secretaria extends Pessoa{
    
    public boolean cadastrarSecretaria(Secretaria secretaria){
        Banco.listaDeSecretarias.add(secretaria);
        return Banco.usuarios.add(secretaria);
    }
    public boolean deletarSecretaria(Secretaria secretaria){
        return Banco.listaDeSecretarias.remove(secretaria);
    }
}
