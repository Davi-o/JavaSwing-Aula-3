package modelo;
/**
 *
 * @author Davi Alves - 10:38
 * @since 13/03/2019
 * @version 1.0 Arya Version
 */
public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora() {}

    /**
     *
     * @param num1 local envia seu valor para num1 global
     * @param num2 local envia seu valor para num2 global
     */
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters'n Setters
    public double getNum1(){return num1;}
    public void setNum1(double num1){this.num1 = num1;}
    public double getNum2(){return num2;}
    public void setNum2(double num2){this.num2 = num2;}
    // Getters'n Setters

    /**
     *
     * @return a divisão de num1 e num2
     */
    public double dividir() {
        return this.num1 / this.num2;
    }

    /**
     *
     * @return a multiplicação de num1 e num2
     */
    public double multiplicar() {
        return this.num1 * this.num2;
    }

    /**
     *
     * @return a soma de num1 e num2
     */
    public double somar() {
        return this.num1 + this.num2;
    }

    /**
     *
     * @return a subtração de num1 e num2
     */
    public double subtrair() {
        return this.num1 - this.num2;
    }

    @Override
    public String toString() {
        return "Primeiro numero" + getNum1() +
               "\nPrimeiro numero" + getNum2() +
               "\nA soma dos números é: " + somar() +
               "\nA subtração dos números é: " + subtrair() +
               "\nA multiplicação dos números é: " + multiplicar() +
               "\nA divisão dos números é: " + dividir();
    }
}