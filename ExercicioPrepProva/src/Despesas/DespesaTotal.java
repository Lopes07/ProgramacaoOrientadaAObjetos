/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Despesas;

/**
 *
 * @author Lucas
 */
public class DespesaTotal {
    private DespesaMes[] despesas;
    private String cpf;
    
    public DespesaTotal(String cpf, DespesaMes[] despesas){
        this.cpf = cpf;
        this.despesas = despesas;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public DespesaMes totalizaMes(int mes){
        float soma = 0;
        
        for(int i = 0; i < despesas.length; i++){
                if(despesas[i].getMes() == mes){
                    soma = soma + despesas[i].getValor();
                }       
        }
        return new DespesaMes(mes, soma);
    }
}