package visao;
import modelo.Calculadora4;
import javax.swing.JOptionPane;


/**
 *
 * @author Davi Alves - 10:40
 * @since 13/03/2019
 * @version 1.0 Arya Version
 */
public class Principal4 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor", "Inserção",JOptionPane.INFORMATION_MESSAGE));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor", "Inserção",JOptionPane.INFORMATION_MESSAGE));
        
        Calculadora4 calc = new Calculadora4();
        
        int op = JOptionPane.showConfirmDialog(null, "Você deseja ver o resultado?", "Pergunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(op == 0){
            JOptionPane.showMessageDialog
                (null,
                    "\nA soma dos números é: " + calc.somar(n1,n2) +
                    "\nA subtração dos números é: " + calc.subtrair(n1,n2) +
                    "\nA multiplicação dos números é: " + calc.multiplicar(n1,n2) +
                    "\nA divisão dos números é: " + calc.dividir(n1,n2),
                        "Resultados",
                            JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Talkei");
        }
        
    }
}
