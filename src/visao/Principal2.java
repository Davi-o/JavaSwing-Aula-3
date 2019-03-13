package visao;
import modelo.Calculadora2;
import javax.swing.JOptionPane;


/**
 *
 * @author Davi Alves - 10:40
 * @since 13/03/2019
 * @version 1.0 Arya Version
 */
public class Principal2 {
    public static void main(String[] args) {
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro valor"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo valor"));
        
       JOptionPane.showMessageDialog(null,"\nA soma dos números é: " + Calculadora2.somar(n1,n2) +
               "\nA subtração dos números é: " + Calculadora2.subtrair(n1,n2) +
               "\nA multiplicação dos números é: " + Calculadora2.multiplicar(n1,n2) +
               "\nA divisão dos números é: " + Calculadora2.dividir(n1,n2),"Resultados",JOptionPane.PLAIN_MESSAGE);
        
    }
}
