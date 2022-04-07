
package opp;

public class Pokemon {
    public String nome, tipo;
    
    public Pokemon(String nome,String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public void Falar(){
        System.out.println(this.nome);
    }
}
