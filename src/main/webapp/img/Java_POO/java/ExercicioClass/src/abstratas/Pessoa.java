package abstratas;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    private String profissao;
    
    //Métodos
        //construtores
        public Pessoa(){
            setNome("padrão");
            setIdade(0);
            setSexo('M');
            setProfissao("padrão");
        
}
        //set - Atribuição
        public void setNome(String param){
            nome = param.trim().isEmpty()?"PADRÂO": param.toUpperCase();
        } 
        public void setIdade(int param){
            idade = (param < 0) || (param > 130)? 0 : param;
        }
        public void setSexo(char param){
            sexo = (param!='M')&&(param!='F')? 'M' : param;   
        }
        public void setProfissao(String param){
            profissao = param.trim().isEmpty()?"PADRÂO": param.toUpperCase();
        } 
        
        //get -
        public String getNome(){
            return nome;
        }
        public int getIdade(){
            return idade;
        }
        public char getSexo(){
            return sexo;
        }
        public String getProfissao(){
            return profissao;
        }       
        
        //toString - 
    @Override
        public String toString(){
            return nome;
            
        }
        
}
