package fontes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class exercicio05 {
    public static void lerVetores(String[] vetorNome,
            double[] vetorSalario){
        
        for (int i = 0; i < vetorNome.length; i++) {
            vetorNome[i]=JOptionPane.showInputDialog("Nome").trim().toUpperCase();
            vetorSalario[i]=Double.parseDouble(JOptionPane.showInputDialog("Salário"));
        }        
    }
    public static double retornaIR(double salario){
        double retorno = 0;
        if ((salario >= 1500) && (salario <=5000)){
            retorno = salario * 0.1;
        }
        if (salario > 5000){
            retorno = salario * 0.25;
        }
        return (retorno);        
    }
    public static void mostraImposto(String[] vetorNome,
            double[] vetorSalario,
            JTextArea areaTexto){
        for (int i = 0; i < vetorNome.length; i++) {
            areaTexto.append(vetorNome[i]+"\t"+
                    vetorSalario[i]+"\t"+
                    retornaIR(vetorSalario[i])+"\n");
        }
    }   
    public static void mostraIsentos(String[] vetorNome,
            double[] vetorSalario,
            JTextArea areaTexto){
        for (int i = 0; i < vetorNome.length; i++) {
            double ir = retornaIR(vetorSalario[i]);
            if ((ir==0)&&(vetorNome[i].startsWith("F"))){
                areaTexto.append(vetorNome[i]+"\t"+ir);
            }
        }
    }
    public static void main(String[] args) {
        String[] vetorNome = 
        new String[Integer.parseInt(JOptionPane.showInputDialog("Tamanho"))];
        double[] vetorSalario = new double[vetorNome.length];
        
        lerVetores(vetorNome,vetorSalario);
        
        JTextArea areaTexto = new JTextArea(10, 20);
        areaTexto.setEditable(false);
        JScrollPane barraRolagem = new JScrollPane(areaTexto);
        
        mostraImposto(vetorNome,vetorSalario,areaTexto);
        areaTexto.append("---Isentos que iniciam com 'F'\n");
        mostraIsentos(vetorNome, vetorSalario, areaTexto);
        
        JOptionPane.showMessageDialog(null, barraRolagem);
    }
}
