import javax.swing.JOptionPane;
public class Escolha_vetor {
public static void main(String[] args) {
Object[] options = {"OK", "CANCELAR", "VOLTAR"};
int n=JOptionPane.showOptionDialog(null, "Escolha uma opção", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
System.out.println(n);
switch(n)
{case 0: 
 JOptionPane.showMessageDialog(null, "Você escolheu ok");
    break;
 case 1: 
 JOptionPane.showMessageDialog(null, "Você escolheu cancelar");
    break;
 case 2: 
 JOptionPane.showMessageDialog(null, "Você voltar");
    break;
 }//fim main
    }//fim classe
}
