package opp;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    
    public void setTime(int h, int m, int s){
        if (h < 24 && h >= 0){
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }
        else{
            System.out.println("Hora invalida");
        }
    }
    
    public void getTimeUniversal(){
        
    }
    
    public void getTimeUS(){}
}
