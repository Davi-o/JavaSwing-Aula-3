package visao;
import modelo.Calculadora3;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Alves - 10:40
 * @since 13/03/2019
 * @version 1.0 Arya Version
 */
public class Principal3 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor", "Inserção",JOptionPane.INFORMATION_MESSAGE));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor", "Inserção",JOptionPane.INFORMATION_MESSAGE));
        
        Calculadora3 calc = new Calculadora3(n1,n2);
        
        int op = JOptionPane.showConfirmDialog(null, "Você deseja ver o resultado?", "Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(op == 0){
            JOptionPane.showMessageDialog(null, calc.toString());
        }else{
            JOptionPane.showMessageDialog(null, "Talkei");
        }
        
    }
}
