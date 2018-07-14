package abstratas;

abstract public class Base {
//atributos
    private int codigo;
    private String nome;
//métodos    
    //construtores
    public Base(){
        this.setCodigo(999999);
        this.setNome("padrão");
    }
    public Base(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
    }    
    //set-atribuição
    public void setCodigo(int codigo){
        this.codigo = codigo<=0 ? 999999 : codigo;
    }
    public void setNome(String nome){
        this.nome = nome.trim().isEmpty()?"PADRÃO":nome.toUpperCase();
    }
    //get
    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    //toString
    @Override
    public String toString(){
        return this.codigo+"-"+this.nome;
    }
}
