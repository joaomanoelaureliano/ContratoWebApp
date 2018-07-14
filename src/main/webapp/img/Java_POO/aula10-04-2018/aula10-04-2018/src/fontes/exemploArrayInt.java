package fontes;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exemploArrayInt {
    public static int retornaSoma(int[] vetor){
        int soma=0;
        for (int i = 0; i < vetor.length; i++) {
            soma+=vetor[i];
        }
        return soma;
    } 
    
    public static double retornaMedia(int[] vetor){
        return (retornaSoma(vetor) / (double)vetor.length);
    }
    
    public static void geraVetor(int[] vetor){
        Random r = new Random();
        for(int i=0; i<vetor.length; i++){
            vetor[i]= r.nextInt(50);
        }
    }
    public static void mostraVetor(int[] vetor,JTextArea areaTexto){
        for (int i = 0; i < vetor.length; i++) {
            areaTexto.append(vetor[i]+"\n");
        }
    }
    public static void main(String[] args) {
        int[] vetor=new int[
                Integer.parseInt(JOptionPane.showInputDialog("Tamanho"))];
        
        geraVetor(vetor);
        
        JTextArea areaTexto = new JTextArea(10, 20);
        areaTexto.setEditable(false);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
        
        mostraVetor(vetor,areaTexto);
                
        areaTexto.append("Soma dos Valores="+retornaSoma(vetor)+"\n");
        areaTexto.append("Média: "+retornaMedia(vetor)+"\n");
        
        JOptionPane.showMessageDialog(null, barraRolagem);
    }
}
