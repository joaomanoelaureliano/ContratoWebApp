package abstratas;

public class Produto extends Base{
    //atributos especializados
    private double estoque;
    private double preco;
    private String tipo;
    
    public Produto(){
        super();
        this.setEstoque(0);
        this.setPreco(0.1);
        this.setTipo("padrão");
        
    }
    public Produto(int codigo, String nome, double estoque, double preco,String tipo){
        super(codigo, nome);
        this.setEstoque(estoque);
        this.setPreco(preco);
        this.setTipo(tipo);
    }
    //set
    public void setEstoque(double estoque){
        this.estoque = estoque;
    }
    public void setPreco(double preco){
        this.preco = preco < 0.0001 ? 0.0001 : preco;
    }
    public void setTipo(String tipo){
        this.tipo = tipo.trim().isEmpty() ? "PADRÃO" : tipo.toUpperCase();               
    }
    //get
    public double getEstoque(){
        return this.estoque;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getTipo(){
        return this.tipo;
    }
}
