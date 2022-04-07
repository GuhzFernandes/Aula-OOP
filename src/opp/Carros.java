
package opp;


public class Carros {
    public String marca;
    public String modelo;
    public String cor;
    public double velocidadeMaxima;
    
    public Carros(String marca, String modelo,String cor, double velocidadeMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String toString(){
    return this.marca
        +  " "
        + this.modelo
        +  " "
        + this.cor
        + " - velocidade maxima: "
        + this.velocidadeMaxima;
    }
    
}
