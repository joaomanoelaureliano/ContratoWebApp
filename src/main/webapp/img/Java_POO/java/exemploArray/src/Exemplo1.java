
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Exemplo1 {
    public static void lerVetor(String[] vetor) {
        for(int i=0; i < vetor.length; i++) {
            vetor[i]=JOptionPane.showInputDialog("Valor ");    
        }
       
}
    
    public static void mostraVetor(String[] vetor, JTextArea areaTextArea) {
        int i=0;
        while (i < vetor.length) {
            areaTextArea.append(vetor[i]+"\n");
        }
    }
    
    public static void main(String[] args) {
        String[] vetor = new String[Integer.parseInt(JOptionPane.showInputDialog("tamanho"))];
        lerVetor(vetor);
        JTextArea areaTexto = new JTextArea(20,30);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);

        
        mostraVetor(vetor, areaTexto);
        
        JOptionPane.showMessageDialog(null, barraRolagem);
                                        
    }
    
}
