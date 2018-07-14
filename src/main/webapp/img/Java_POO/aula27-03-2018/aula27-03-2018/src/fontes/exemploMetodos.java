package fontes;

import javax.swing.JOptionPane;

public class exemploMetodos {
    public static void mostraTexto(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    public static void mostraInteiro(int numero){
        numero = numero * 2;
        JOptionPane.showMessageDialog(null,"No método: "+numero);
    }
    public static void main(String[] args) {
        //mostraTexto("texto qualquer");
        //String texto = JOptionPane.showInputDialog("Texto");
        //mostraTexto(texto);
        //mostraTexto(texto+" SDFSDFSFDSFSD");
        int x = 10;
        mostraInteiro(x);
        JOptionPane.showMessageDialog(null, "Fora do Método: "+x);
    }
}
