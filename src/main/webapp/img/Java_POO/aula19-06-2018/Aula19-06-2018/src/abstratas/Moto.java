package abstratas;

public class Moto extends Veiculo{
    //especializados
    private boolean tripe;
    
    //construtores
    public Moto(){
        super();
        this.setTripe(false);
    }
    public Moto(String placa,String modelo,boolean tripe){
        super(placa, modelo);
        this.setTripe(tripe);
    }
    //set
    public void setTripe(boolean tripe){
        this.tripe = tripe;
    }
    //get
    public boolean isTripe(){
        return this.tripe;
    }
    
}
