
package opp;


public class Matematica {
    
    private double[] vetor;
    private int tamanhoVetor;
    
    public Matematica(double[] entrada){
        vetor = entrada;
        tamanho();        
    }
    
    public void tamanho(){
        tamanhoVetor = vetor.length;
    }
    
    public double getSomatorio(){
        double saida = 0;
        for (int i = 0; i < tamanhoVetor; i++){
            saida = saida + vetor[i];
        }
        return saida;
            
    }
    
    public double getMedia(){
        return getSomatorio()/tamanhoVetor;
    }
    
    public double getProdutorio(){
        double saida = 1;
        for (int i = 0; i < tamanhoVetor; i++){
            saida = saida * vetor[i];
    }
    
    public double getPares(){
        
    }
    
    public double getImpares(){
    
    }
    
}
