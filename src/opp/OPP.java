package opp;
import java.util.Scanner;
import java.util.Set;

public class OPP {
    
    public static void ex1(){
        Pessoa p1 = new Pessoa("Gustavo",23,1.71,55);
        System.out.println(p1.getNome());
        System.out.println(p1.IMC());
        
       /* 
       Pessoa p1 = new Pessoa();
       p1.setNome("Gustavo#");
       System.out.println(p1.getNome());
       */
    }
    
    public static void ex2(){
        Carros c1 = new Carros("Honda","Civic", "Preto",220);
        System.out.println(c1);
        
    }
    
    public static void ex3(){
        Scanner input = new Scanner(System.in);
        boolean andar = true;
        Robo bot = new Robo();
        do{
            
        System.out.println("Qual direção gostaria de ir? N, S, L, O");
            char direcao = input.nextLine().charAt(0);
            bot.setDirecao(direcao);
            System.out.println("Andando para: "
                    + bot.getDirecao()
                    +"\ncontinuar andando? S/N");
            char continuar = input.nextLine().charAt(0);
            if (continuar == 'S'){
                andar = true;
            }
            else{
                andar = false;
            }
        }
        while(andar == true);
        System.out.println("Seu robo parou.");
        
    }
    
    public static void ex4(){
        
        Quadrilatero qua = new Quadrilatero();
        
        double ladoQuadrado = 5;
        double ladoQuadrilatero = 3;
        double alturaQuadrilatero = 4;
        
        System.out.println("Area Quadreado: "+qua.Area(ladoQuadrado));
        
        System.out.println("Area Retangulo: " + qua.Area(ladoQuadrilatero,alturaQuadrilatero));
    }
    
    public static void rev1(){
        Scanner input = new Scanner(System.in);
        Conversor conversor = new Conversor();
        
        System.out.println("Insira um numero para retornar um dia da semana: ");
        int entrada = input.nextInt();
        input.nextLine();
        
        System.out.println("Gostaria da data em ingles? (Y/N)");
        char ingles = input.nextLine().charAt(0);
        conversor.TrocarIdioma(ingles);
        
        System.out.println(conversor.Conversor(entrada));
    }
    
    public static void rev2(){
        
    }
    
    public static void main(String[] args) {
        
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //rev1();
        rev2();           
    }
    
}
