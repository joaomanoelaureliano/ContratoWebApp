package abstratas;

abstract public class Funcionario {
   protected String nome;
   protected String cpf;
   protected double salario;
   //
   public Funcionario(){
       this.setNome("padrão");
       this.setCpf("000.000.000-00");
       this.setSalario(0);
   }
   public Funcionario(String nome,String cpf,double salario){
       this.setNome(nome);
       this.setCpf(cpf);
       this.setSalario(salario);
   }
   public Funcionario(String nome,String cpf){
       this.setNome(nome);
       this.setCpf(cpf);
   }
   //set
   public void setNome(String nome){
       this.nome = nome.trim().isEmpty()?"PADRÃO":nome.toUpperCase();
   }
   public void setCpf(String cpf){
       this.cpf = cpf.length() != 14 ? "000.000.000-00":cpf;
   }
   public void setSalario(double salario){
       this.salario = salario < 0 ? 0 : salario;
   }
   //get
   public String getNome(){
       return this.nome;
   }
   public String getCpf(){
       return this.cpf;
   }
   public double getSalario(){
       return this.salario;
   }
   //toString
   @Override
   public String toString(){
       return this.nome + "-" + this.cpf;
   }
   
   
   
}
