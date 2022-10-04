/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapratica.q2;

/**
 *
 * @author aluno
 */
public class AviaoPremium extends Aviao{
    private int numeroDePoltronas; // Numero total de poltronas do aviao
    private int numeroDePoltronasPremium;
    
    public AviaoPremium(int numero, Data d, int n, int nPremium) {
        super(numero, d);
        this.numeroDePoltronas = n;
        this.numeroDePoltronasPremium = nPremium;
        super.poltronas = new boolean[this.numeroDePoltronas];
        for (int i = 0; i< poltronas.length; i++) {
            poltronas[i] = false;
        }
    }
    
    
    public int maxVagas(){
        return this.numeroDePoltronas;
    }
    
    public int cadeirasPremium() {
        return this.numeroDePoltronasPremium;
    }
    
    public char tipo(int posicao) {
        if(posicao >= 0 && 
           posicao < this.numeroDePoltronasPremium) {
            return 'P';
        } else if (posicao >= this.numeroDePoltronasPremium &&
                   posicao < this.numeroDePoltronas) {
            return 'C';
        }
        return 'X';
    }
    
    @Override
    public int proximoLivre() {
        int posicao = this.numeroDePoltronasPremium;
        while(poltronas[posicao] != false && 
              posicao < this.numeroDePoltronas) {
            posicao++;
        }
        // ----------- Codigo complementar -----------
        if (posicao >= this.numeroDePoltronas){
            return -1;
        }
        // -------------------------------------------
        return posicao;
    }
    
    public int proximoPremiumLivre() {
        int posicao = 0;
        while(poltronas[posicao] != false && 
              posicao < this.numeroDePoltronasPremium) {
            posicao++;
        }
        // ----------- Codigo complementar -----------
        if (posicao >= this.numeroDePoltronasPremium){
            return -1;
        }
        // -------------------------------------------
        return posicao;
    }    
}
