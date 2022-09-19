/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestaoEquipamento;

/**
 *
 * @author Lucas
 */
public class Equipamento {
    private int[] valor;
    private int numeroEquipamentos;
    
    public Equipamento(int numeroEquipamentos){
        valor = new int[numeroEquipamentos];        
    }
    
    public int getNumeroEquipamentos(){
        return this.numeroEquipamentos;
    }
    
    public int getValor(int numeroEquipamentos){
      return this.valor[numeroEquipamentos];  
    }
    
    public void setValor(int numeroEquipamentos, int valor){
        this.valor[numeroEquipamentos] = valor;
    }    
}
