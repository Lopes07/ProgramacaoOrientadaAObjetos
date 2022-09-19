/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Despesas;

/**
 *
 * @author Lucas
 */
public class DespesaMes {
    private int mes; //mes da despesa
    private float valor; //valor da despesa
    
    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }
    
    public int getMes(){
        return mes;
    }
    
    public float getValor(){
        return valor;
    }
}
