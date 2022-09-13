/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Lucas
 */
public class MeiosDeTransporte {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastroDeVeiculos cad = new CadastroDeVeiculos(3);
        cad.inserir(new Carro("VW", 4, "Gol", 1000, 4)); 
        cad.inserir(new Bicicleta("Specialized", 2,"Carbon", 12, false));
        cad.inserir(new Moto("Honda", 2,"Bis", 100, true));
        cad.inserir(new Carro("VW", 4, "Fusca", 1600, 2));
        
        cad.ordenar();
        cad.imprimir();
    }
}
