package visao;
import modelo.Calculadora;
import javax.swing.JOptionPane;


/**
 *
 * @author Davi Alves - 10:40
 * @since 13/03/2019
 * @version 1.0 Arya Version
 */
public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor")));
        calc.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor")));
        
        int op = JOptionPane.showConfirmDialog(null, "Você deseja ver o resultado?", "Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(op == 0){
            JOptionPane.showMessageDialog(null, calc.toString());
        }else{
            JOptionPane.showMessageDialog(null, "Talkei");
        }
        
    }
}
