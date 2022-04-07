package opp;

public class Pessoa {
    private String Nome;
    private int Idade;
    private Double Altura;
    private Double Peso;
    
    public Pessoa(String nome,int idade,double altura,double peso){
        Nome = nome;
        Idade = idade;
        Altura = altura;
        Peso = peso;
    };
    /*
    public void setNome(String nome){
        if (nome.contains("#")){
            System.out.println("Caracteres invalidos");
        }
        else{
            Nome = nome;
        }
    }
    */
    public String getNome(){
        return Nome;
    }
    
    
    public double IMC()
    {
        return Peso/(Altura*Altura);
    }
    
    
    
}
