package fontes;

import javax.swing.JOptionPane;

public class exemploSelecao {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Número A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Número B"));
        
        int c = 0;
        if (a == b){
            JOptionPane.showMessageDialog(null, "São Iguais");
            c = a+b;
        }else{
            c = a*b;
            if (a < b){
                JOptionPane.showMessageDialog(null,a+" é Menor");
            }else{
                JOptionPane.showMessageDialog(null, b+" é menor!");
            }            
        }
        JOptionPane.showMessageDialog(null, "Resultado: " +c);
    }
}
