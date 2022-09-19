/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestaoEquipamento;

/**
 *
 * @author Lucas
 */
public class EquipamentoCorrigido extends Equipamento {
    private int mesCorrente;
    private int[] mesCompra;
    
    public EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente){
        super(numeroEquipamentos);
        this.mesCorrente = mesCorrente;
        this.mesCompra = new int[numeroEquipamentos];
    }
    
    public int getMesCompra(int numeroEquipamentos){
        return this.mesCompra[numeroEquipamentos];
    }
    
    public void setMesCompra(int numeroEquipamentos, int mesCorrente){
        this.mesCompra[numeroEquipamentos] = mesCorrente;
    }
    
    public int getMesCorrente(){
        return this.mesCorrente; 
    }
    
    public void setMesCorrente(int mesCorrente){
        this.mesCorrente = mesCorrente;
    }
    
    public void corrige(int percentual){
        for (int i = 0; i < this.getNumeroEquipamentos(); i++){
            int corrigido = getValor(i);
            if(this.mesCompra[i] == this.mesCorrente){
                corrigido *= percentual/100;
                setValor(i, corrigido);
            }
        }
        if(mesCorrente < 12){
        this.mesCorrente++;
    } else {
            this.mesCorrente = 1;
        }
    }
    
    public void substitui(EquipamentoCorrigido ec){
        if(this.getNumeroEquipamentos()== ec.getNumeroEquipamentos()){
            for(int i = 0; i < this.getNumeroEquipamentos(); i++){
                this.setMesCompra(i, ec.getMesCompra(i));
                this.setValor(i, ec.getValor(i));
                this.setMesCorrente(ec.getMesCorrente());
            }
        }
    }
}
