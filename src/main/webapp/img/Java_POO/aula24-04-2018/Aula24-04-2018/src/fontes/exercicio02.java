
package fontes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exercicio02 {
    public static double retornaMedia(double nota1, double nota2){
        return ((nota1+nota2)/2);
    }
    public static String retornaSituacao(double media){
        return ((media>=7)?"APROVADO":"RECUPERAÇÃO");
        /*
        if (media >= 7){
            return "APROVADO";
        }else{
            return "RECUPERAÇÃO";
        }
        */
    }
    public static void main(String[] args) {
        JTextArea areaTexto=new JTextArea(10,20);
        areaTexto.setEditable(false);
        JScrollPane barraRolagem= new JScrollPane(areaTexto);
        int cont=0;
        double mediaGeral=0;
        do{            
            String nome=JOptionPane.showInputDialog("Nome:");
            double nota1=Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
            double nota2=Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
            double media=retornaMedia(nota1, nota2);
            String situacao=retornaSituacao(media);
            areaTexto.append(nome+"\t"+media+"\t"+situacao+"\n");
            
            cont++;
            mediaGeral+=media;
        }while(JOptionPane.showConfirmDialog(null, "Continua?")==0);
        areaTexto.append("Média Geral: "+(mediaGeral/cont));
        
        JOptionPane.showMessageDialog(null, barraRolagem);
    }
}
