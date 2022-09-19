/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprepprova;

/**
 *
 * @author Lucas
 */
public class Agenda {
    private EntradaNaAgenda[] lista;
    private int numeroEntradas;
    
    public Agenda(int tamanho){
        lista  = new EntradaNaAgenda[tamanho];
        numeroEntradas = 0;
    }
}

public EntradaNaAgenda buscaPorEvento(String evento){
    if(evento == getEvento().intern()){ 
    return EntradaNaAgenda e;
    } else {
    System.out.println("Item náo encontrado.");
    return null;
    }
    
}