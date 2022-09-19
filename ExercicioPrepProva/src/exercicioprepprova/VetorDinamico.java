/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprepprova;

/**
 *
 * @author Lucas
 */
public class VetorDinamico {
    int totalSize;
    String[] vec;
    int size = 0;
    
    
    public VetorDinamico(int size){
        this.totalSize = size;
        this.vec = new String[this.totalSize];        
    }
    
    public void doubleSize(){
        String[] vecAux = new String[this.totalSize * 2];
        
        for (int i = 0; i <this.totalSize; i++){
            vecAux[i] = vec[i];
        }
        
        this.totalSize = this.totalSize * 2;
        vec = vecAux;
    }
    
    public void Insert(String s){
        if(size == totalSize){
            doubleSize();
        }
        
        this.vec[size] = s;
        size++;
    }
    
    public String Get(int p){
        if(p >= 0 && p < this.totalSize){
            return vec[p];
        } else {
            return null;
        }
    }
    
    public int Size(){
        return this.size;
    }    
}



