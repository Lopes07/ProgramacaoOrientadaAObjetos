/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Despesas;

/**
 *
 * @author Lucas
 */
public class DespesaDia extends DespesaMes{
    private int dia; // dia da despesa
    public DespesaDia(int dia, int mes, int valor){
        super(mes, valor);
        this.dia = dia;
    }
    
    public int getDia(){
        return dia;
    }
}
