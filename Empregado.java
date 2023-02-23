public class Empregado{
    private int tipo;
    private String nome;
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;

    public double calcularSalario(){
        if (tipo == 0) 
            return salario;
        if (tipo == 1)
            return salario + salario * comissao;
        if (tipo == 2)
            return salario + bonus;
        return 0;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
 


}