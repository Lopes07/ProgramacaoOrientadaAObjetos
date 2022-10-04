/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapratica.q1;

/**
 *
 * @author aluno
 */
public class Aviao {
    private int numero; 
    private Data dataDaPartida;  
    protected boolean[] poltronas;
        
    public Aviao(int numero, Data d){    // Construtor
        this.numero = numero;
        this.dataDaPartida = d;
        this.poltronas = new boolean[300];      
        
        for(int i = 0; i < poltronas.length; i++){
            poltronas[i] = false;                // Retorna false se está disponível
        }
    }
    
    public int proximoLivre(){
        int posicao = 0;
        
        while(poltronas[posicao] != false && posicao < poltronas.length){ 
            posicao++;
        }
        // ----------- Codigo complementar -----------
        if (posicao >= poltronas.length){
            return -1;
        }
        // -------------------------------------------
        return posicao;
    }
    
    public boolean verifica(int posicao){
        if(posicao >= 0 && posicao < poltronas.length){
            return poltronas[posicao];
        }
        return true;  // só porque se não cair no if ele ainda precisa retornar algo
        // considera ocupada para não poder mexer depois, mas teria de tratar a exceção
    }             
    
    public boolean ocupa(int posicao){
        if(!verifica(posicao)){
            poltronas[posicao] = true;
            return true;
        }
        return false;
    }
    
    public int vagas(){
        int vagas = 0;
        for(int i = 0; i < poltronas.length; i++){
            if (!poltronas[i]){
                vagas++;
            }
        }
        return vagas;
    }
    
    public int getNumeroDoVoo(){
        return numero;
    }
    
    public Data getData(){
        return dataDaPartida;
    }
    
}
