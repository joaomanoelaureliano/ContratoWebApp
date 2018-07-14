package fontes;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exemploAleatorios {
    public static double retornaRaiz(int numero){        
        return (Math.sqrt(numero));
    }
    public static void main(String[] args) {
        JTextArea areaTexto = new JTextArea(10, 30);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int numero=r.nextInt(50);
            
            areaTexto.append(numero+" Raiz Quadrada: "+
                             retornaRaiz(numero)+"\n");
        }
        JOptionPane.showMessageDialog(null, barraRolagem);
    }
    
}
