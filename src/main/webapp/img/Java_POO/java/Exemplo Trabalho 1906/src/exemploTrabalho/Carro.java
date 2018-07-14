package exemploTrabalho;

public class Carro extends Veiculos{
    private int portas;
    private boolean arCondicionado;
    private boolean tetoSolar;
    
    public Carro(){
        super();
        this.setPortas(3);
        this.setArCondicionado(false);
        this.setTetoSolar(false);
        
    }
    public Carro(String placa, String modelo, int portas, boolean arCondicionado, boolean tetoSolar){
        super(placa, modelo);
        this.setArCondicionado(arCondicionado);
        this.setPortas(portas);
        this.setTetoSolar(tetoSolar);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
       if (portas <3){
        this.portas = 3;
    }else{
           if(portas >5){
               this.portas = 5;
           }else{
               this.portas = portas;
           }
       }
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }    
    
}
