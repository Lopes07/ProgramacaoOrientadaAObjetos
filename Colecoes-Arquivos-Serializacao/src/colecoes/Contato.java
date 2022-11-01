/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package colecoes;
import java.io.Serializable;

/*@author aluno*/

public class Contato implements Serializable {

    private final String nome;
    private final Data dataDeNascimento;
    private final Telefone telefone;
    
    public Contato(String n, Data d, Telefone t){
        this.nome = n;
        this.dataDeNascimento = d;
        this.telefone = t;
    }
 
     public String getNome() {
        return nome;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Telefone getTelefone() {
        return telefone;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + " - " + telefone + 
                "\nData de nascimento: " + dataDeNascimento;
    }
}