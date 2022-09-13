/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;

/**
 *
 * @author Lucas
 */
public abstract class Veiculo implements Comparable<Veiculo>{
    protected String marca;
    protected int qtdRodas;
    protected String modelo;
    protected int velocidade = 0;
    protected int velocidadeAtual;
    
    public Veiculo(String marca, int qtdRodas, String modelo){
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
    }


    public void imprimirInformacoes(){
    System.out.println("###Veículo###");
    System.out.println("Marca: "+ marca + "\nQuantidade de rodas: " + qtdRodas +"Modelo: " + modelo + "Velocidade: " + velocidade);    
    }

    public void acelerar(int valor){
    velocidade = valor + velocidadeAtual;
    }
    
    public void frear(int valor){
    velocidade = valor + velocidadeAtual;
    }
    
    public void setVelocidadeAtual(int velocidadeAtual){
        if(velocidadeAtual > 0){
            this.velocidadeAtual = velocidadeAtual;
        } else{
            System.out.println("Entre com uma velocidade valida.");
        }
    }
    
    
    public int compareTo(Veiculo v) {
        return this.modelo.compareTo(v.modelo);
    }
}
