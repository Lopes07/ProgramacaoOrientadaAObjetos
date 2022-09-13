/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Lucas
 */
public abstract class Automovel extends Veiculo{
    protected double potenciaMotor;
    
    public Automovel(String marca, int qtdRodas, String modelo, double potenciaMotor){
        super(marca, qtdRodas, modelo);
        this.potenciaMotor = potenciaMotor;
    }
    
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Potencia do motor: "+ potenciaMotor);
    }
    
}
