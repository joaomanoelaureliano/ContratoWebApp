package fontes;

import javax.swing.JOptionPane;

public class exemploMensagem {
    public static void main(String[] args) {
        System.out.println("Mensagem");
        System.out.println("Número: " + 10);
        System.out.println("Cálculo: " + (15.0 / 2));
        System.out.println("Cálculo: " + (15 / 2));
        
        JOptionPane.showMessageDialog(null, "Mensagem");
        JOptionPane.showMessageDialog(null, "Mensagem:"+10);
        
        JOptionPane.showMessageDialog(null,                
                "Mensagem",
                "Aviso!!!",
                JOptionPane.ERROR_MESSAGE);
    }
}
