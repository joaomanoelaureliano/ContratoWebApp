package fontes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exemploArrayString {
    public static void lerVetor(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]=JOptionPane.showInputDialog("Valor").toUpperCase();
        }
    }
    public static void mostraVetor(String[] vetor,JTextArea areaTexto){
        for (int i = 0; i < vetor.length; i++) {
            areaTexto.append(vetor[i]+"\t"+
                    vetor[i].length()+"\t"+
                    vetor[i].trim().isEmpty()+"\t"+
                    vetor[i].charAt(0)+"\n");
        }
    }
    public static void main(String[] args) {
        String[] vetor = new String[Integer.parseInt(JOptionPane.showInputDialog("Tamanho"))];
        
        lerVetor(vetor);
        JTextArea areaTexto = new JTextArea(10, 20);
        areaTexto.setEditable(false);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
        
        mostraVetor(vetor,areaTexto);                
        
        JOptionPane.showMessageDialog(null, barraRolagem);
                
    }
}
