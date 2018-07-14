package cursojava;

import javax.swing.JOptionPane;

public class ifElse {
    public static void main(String[] args) {
        double media = 10;
        
        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aluno Aprovado com a média: ");           
        }else{
            JOptionPane.showMessageDialog(null,"Aluno Reprovado com a média: ");
        }   
    }
    
}
