package fontes;

import javax.swing.JOptionPane;

public class exemploConversao {
    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog("Nome:");
        int idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        double salario=Double.parseDouble(JOptionPane.showInputDialog("Salário"));
        
        salario = salario * 1.15;
        
        JOptionPane.showMessageDialog(null, 
                nome+
                "\nnovo salário:\n"+
                salario);
        
    }
}
