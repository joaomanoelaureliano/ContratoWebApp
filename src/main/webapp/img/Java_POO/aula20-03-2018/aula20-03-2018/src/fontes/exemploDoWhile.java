package fontes;

import javax.swing.JOptionPane;

public class exemploDoWhile {
    public static void main(String[] args) {
        do{
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Número"));
            JOptionPane.showMessageDialog(null,(numero%2==0)?"Par":"Impar");
        }while(JOptionPane.showConfirmDialog(null, "Continua?")==0);
    }
}
