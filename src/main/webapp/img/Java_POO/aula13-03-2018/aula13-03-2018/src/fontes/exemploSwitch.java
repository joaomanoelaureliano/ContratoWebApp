package fontes;

import javax.swing.JOptionPane;

public class exemploSwitch {
    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Número"));
        
        switch(numero % 2){
            case 0:JOptionPane.showMessageDialog(null, "Par");break;
            case 1:JOptionPane.showMessageDialog(null, "Impar");break;    
        }
        
        String valor=JOptionPane.showInputDialog("Valor String");
        
        switch(valor){
            case "s":
            case "S":JOptionPane.showMessageDialog(null, "Sim");break;
            case "n":
            case "N":JOptionPane.showMessageDialog(null, "Não");break;
            default:JOptionPane.showMessageDialog(null, "Incorreto");
        }
        
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Mês"));
        switch(mes){
            case 1:JOptionPane.showMessageDialog(null, "Janeiro");break;
            case 2:JOptionPane.showMessageDialog(null, "Fevereiro");break;
            case 3:JOptionPane.showMessageDialog(null, "Março");break;
            case 4:JOptionPane.showMessageDialog(null, "Abril");break;
            case 5:JOptionPane.showMessageDialog(null, "Maio");break;
            case 6:JOptionPane.showMessageDialog(null, "Junho");break;
            case 7:JOptionPane.showMessageDialog(null, "Julho");break;
            case 8:JOptionPane.showMessageDialog(null, "Agosto");break;
            case 9:JOptionPane.showMessageDialog(null, "Setembro");break;
            case 10:JOptionPane.showMessageDialog(null, "Outubro");break;
            case 11:JOptionPane.showMessageDialog(null, "Novembro");break;
            case 12:JOptionPane.showMessageDialog(null, "Dezembro");break;
            default:JOptionPane.showMessageDialog(null, "Valor Incorreto");
        }
    }
}
