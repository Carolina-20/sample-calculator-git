package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("Ejecutable");
        Calculator c = new Calculator();
        int suma = c.suma(13, 2);
        System.out.println("Suma: " + "c.suma(13,2) = " + suma);
        int resta = c.resta(13, 2);
        System.out.println("Resta: " + "c.resta(13,2) = " + resta);

        int multiplicacion = c.multiplicacion(13, 2);
        System.out.println("Multiplicacion: " + "c.multiplicacion(13,2) = " + multiplicacion);

        double division = c.division(13, 2);
        System.out.println("Division: " + "c.division(13,2) = " + division);
    }
}
