
package opp;

public class Conversor {
    
    private boolean ingles;
    
    
    public void TrocarIdioma(char entrada){
        
        if(entrada == 'y' || entrada == 'Y'){
            ingles = true;
        }
        else{
            ingles = false;
        }
    }
    
    public String Conversor(int blabla){
        switch(blabla){
            case 1:
                if(ingles == true){
                    return "Sunday";
                }
                else{
                    return "Domingo";
                }
                            
            case 2:
                if(ingles == true){
                    return "Monday";
                }
                else{
                    return "Segunda-Feira";
                }
                
            case 3:
                
                if(ingles == true){
                    return "Tuesday";
                }
                else{
                    return "Terça-Feira";
                }
                
            case 4:
                if(ingles == true){
                    return "Wednesday";
                }
                else{
                    return "Quarta-Feira";
                }
                
            case 5:
                if(ingles == true){
                    return "Thrusday";
                }
                else{
                    return "Quinta-Feira";
                }
                
            case 6:
                if(ingles == true){
                    return "Friday";
                }
                else{
                    return "Sexta-Feira";
                }
                
            case 7:
                if(ingles == true){
                    return "Saturday";
                }
                else{
                    return "Sabado";
                }
            
            default:
                return "Valor Invalido!";
        }
        
    }
}
