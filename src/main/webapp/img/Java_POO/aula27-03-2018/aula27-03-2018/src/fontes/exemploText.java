package fontes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exemploText {
    public static void main(String[] args) {
        JTextArea areaTexto= new JTextArea(10, 20);
        areaTexto.setEditable(false);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
           
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        mostraTabuada(numero,areaTexto);
        JOptionPane.showMessageDialog(null, barraRolagem);
    }
    
    public static void mostraTabuada(int numero,JTextArea areaTexto){
        for (int i = 1; i <= 10; i++) {
            areaTexto.append(numero+"x"+i+"="+(numero*i)+"\n");
        }
    }

}
