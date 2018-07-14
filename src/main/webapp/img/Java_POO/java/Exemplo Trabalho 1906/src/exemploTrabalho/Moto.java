package exemploTrabalho;

public class Moto extends Veiculos{
    private boolean tripe;
    
    public Moto(){
        super();
        this.setTripe(false);
    }
    
    public Moto(String placa, String modelo, boolean tripe){
        super(placa, modelo);
        this.setTripe(tripe);
    }

    public boolean isTripe() {
        return tripe;
    }

    public void setTripe(boolean tripe) {
        this.tripe = tripe;
    }
    
}
