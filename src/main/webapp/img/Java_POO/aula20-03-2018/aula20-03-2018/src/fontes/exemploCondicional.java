package fontes;

import javax.swing.JOptionPane;

public class exemploCondicional {
    public static void main(String[] args) {
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
        /*
        double novoPreco =0.0;
        
        if (preco > 10.0){
            novoPreco = preco * 0.9;
        }else{
            novoPreco = preco * 0.925;
        }
        */
        
        double novoPreco = preco * ((preco > 10.0) ? 0.9 : 0.925);               
                
                
        JOptionPane.showMessageDialog(null, "Novo Preço:" +novoPreco);
    }
}
