package abstratas;

public class Carro extends Veiculo{
    //especializados
    private int portas;
    private boolean arCondicionado;
    private boolean tetoSolar;
    
    //construtores
    public Carro(){
        super();
        this.setPortas(3);
        this.setArCondicionado(false);
        this.setTetoSolar(false);
    }
    public Carro(String placa, String modelo, int portas,
            boolean arCondicionado, boolean tetoSolar){
        super(placa, modelo);
        this.setPortas(portas);
        this.setArCondicionado(arCondicionado);
        this.setTetoSolar(tetoSolar);
    }
    //set
    public void setPortas(int portas){
        if (portas < 3){
            this.portas = 3;
        }else{
            if (portas > 5){
                this.portas = 5;
            }else{
                this.portas = portas;
            }
        }
    }
    public void setArCondicionado(boolean arCondicionado){
        this.arCondicionado = arCondicionado;
    }
    public void setTetoSolar(boolean tetoSolar){
        this.tetoSolar = tetoSolar;
    }
    //get
    public int getPortas(){
        return this.portas;
    }
    public boolean isArCondicionado(){
        return this.arCondicionado;
    }
    public boolean isTetoSolar(){
        return this.tetoSolar;
        
    }
}
