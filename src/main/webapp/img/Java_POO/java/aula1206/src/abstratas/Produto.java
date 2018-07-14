package abstratas;

public class Produto extends Base{
    private double estoque;
    private double preco;
    private String tipo;
   
    public Produto(){
        super(); 
        this.setEstoque(0);
        this.setPreco(0.1);
        this.setTipo("padrão");
        
    }
    public Produto(int codigo, String nome, double estoque, double preco, String tipo){
        super(codigo, nome);
        this.setEstoque(estoque);
        this.setPreco(preco);
        this.setTipo(tipo);
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco < 0.0001 ? 0.0001 : preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {         
        this.tipo = tipo.trim().isEmpty()?"PADÃO":tipo.toUpperCase();
        
    }   
  
}
