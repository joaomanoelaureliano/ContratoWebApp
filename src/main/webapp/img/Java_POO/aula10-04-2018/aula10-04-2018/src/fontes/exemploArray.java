package fontes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exemploArray {
    
    public static void lerVetor(String[] vetor){
        for(int i=0; i < vetor.length; i++){
            vetor[i]=JOptionPane.showInputDialog("Valor");
        }
    }
    public static void mostraVetor(String[] vetor,JTextArea areaTexto){
        int i=0;
        while (i < vetor.length){
            areaTexto.append(vetor[i]+"\n");
            i++;
        }
    }
    public static void main(String[] args) {
        String[] vetor = new String[Integer.parseInt(JOptionPane.showInputDialog("Tamanho"))];
        lerVetor(vetor);
        JTextArea areaTexto = new JTextArea(20, 30);
        areaTexto.setEditable(false);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
        
        mostraVetor(vetor, areaTexto);
        
        JOptionPane.showMessageDialog(null, barraRolagem);
    }
}
