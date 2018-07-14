
package abstratas;

public class Professor extends Funcionario{
    protected double numeroHoras;
    protected double valorHora;
    //
    public Professor(){
        super();
        this.setNumeroHoras(0);
        this.setValorHora(0);
    }
    public Professor(String nome,String cpf,
                     double numeroHoras,double valorHora){
        super(nome, cpf);
        this.setNumeroHoras(numeroHoras);
        this.setValorHora(valorHora);        
    }
    //set
    public void setNumeroHoras(double numeroHoras){
        this.numeroHoras = numeroHoras < 0 ? 0 : numeroHoras;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora < 0 ? 0 : valorHora;
    }
    //get
    public double getNumeroHoras(){
        return this.numeroHoras;
    }
    public double getValorHora(){
        return this.valorHora;
    }
    @Override
    public double getSalario(){
        return this.numeroHoras * this.valorHora;
    }
    
}
