package exemploTrabalho;

abstract public class Veiculos {
    private String placa;
    private String modelo;
    
    public Veiculos(){
        this.setPlaca("AAA0000");
        this.setModelo("PADRÃO");
       
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.length()!=7?"AAA0000":placa.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.trim().isEmpty()?"PADRÃO":modelo.toUpperCase();
    }

    public Veiculos(String placa, String modelo){

    }

    @Override
    public String toString() {
        return "Veiculos: " + "Placa = " + placa + "\n Modelo = " + modelo;
    }
    
}