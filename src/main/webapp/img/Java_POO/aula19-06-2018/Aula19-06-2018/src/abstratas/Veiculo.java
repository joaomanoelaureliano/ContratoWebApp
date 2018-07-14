package abstratas;

abstract public class Veiculo {
    private String placa;
    private String modelo;
    
    public Veiculo(){
        this.setPlaca("AAA0000");
        this.setModelo("PADRÃO");
    }
    public Veiculo(String placa, String modelo){
        this.setPlaca(placa);
        this.setModelo(modelo);
    }
    //set
    public void setPlaca(String placa){
        this.placa = placa.length()!=7 ? "AAA0000":placa.toUpperCase();
    }
    public void setModelo(String modelo){
        this.modelo=modelo.trim().isEmpty()?"PADRÃO":modelo.toUpperCase();
    }
    //get
    public String getPlaca(){
        return this.placa;
    }
    public String getModelo(){
        return this.modelo;                
    }
    //toString
    @Override
    public String toString(){
        return this.placa+"-"+this.modelo;
    }
}
