package fontes;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exemploLinkedList {
    public static void lerLista(LinkedList<String> lista){
        do{
            lista.add(JOptionPane.showInputDialog("Valor").toUpperCase());
        }while(JOptionPane.showConfirmDialog(null, "Continua?")==0);
    }
    public static void mostraLista(LinkedList<String> lista,
            JTextArea areaTexto){
/*
        for(int i=0; i < lista.size(); i++){
            areaTexto.append(lista.get(i)+"\n");
        }
*/
        for (String valor : lista){
            areaTexto.append(valor+"\n");
        }
    }
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lerLista(lista);
        JTextArea areaTexto = new JTextArea(10, 20);
        mostraLista(lista,areaTexto);
        JOptionPane.showMessageDialog(null, areaTexto);
    }
}
