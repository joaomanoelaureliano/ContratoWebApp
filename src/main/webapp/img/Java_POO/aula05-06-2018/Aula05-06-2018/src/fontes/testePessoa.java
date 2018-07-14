
package fontes;

import abstratas.Pessoa;

public class testePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("joao da silva");
        pessoa.setIdade(250);
        pessoa.setProfissao("analista");
        
        System.out.println(pessoa.getNome()+"\n"+
                pessoa.getIdade()+"\n"+
                pessoa.getSexo()+"\n"+
                pessoa.getProfissao());
        
        System.out.println("Resultado toString:"+pessoa);
        
    }
    
}
