package opp;
import java.util.List;
import java.util.ArrayList;

public class Robo {
    private char direcao;
    
    public void setDirecao(char entrada){
        if(entrada == 'N' || entrada == 'S' || entrada == 'L' || entrada == 'O'){
            this.direcao = entrada;
        }
        else{
            System.out.println("Direção Invalida");
            //this.direcao = null;
        }
    }
    
    public char getDirecao(){
        return this.direcao;
    }
    
    public void getDirecoes(){}
    
}
