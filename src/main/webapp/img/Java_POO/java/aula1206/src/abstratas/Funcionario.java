package abstratas;

public class Funcionario extends Base{
    private double salario;
    
    public Funcionario(){
        super();
        this.setSalario(0);
    }
    public Funcionario(int codigo, String nome, double salario){
        super(codigo, nome);
        this.setSalario(salario);  
}

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario <0 ? 0 : salario;
    }
    
}
