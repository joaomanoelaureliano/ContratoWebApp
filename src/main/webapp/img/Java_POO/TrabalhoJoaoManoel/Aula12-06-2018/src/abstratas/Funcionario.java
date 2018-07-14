
package abstratas;

public class Funcionario extends Base{
    //atributo
    private double salario;
    //construtores
    public Funcionario(){
        super();
        this.setSalario(0);
    }
    public Funcionario(int codigo, String nome, double salario){
        super(codigo, nome);
        this.setSalario(salario);
    }
    //set
    public void setSalario(double salario){
        this.salario= salario < 0 ? 0 : salario;
    }
    //get
    public double getSalario(){
        return this.salario;
    }
    
    
}
