package ec.edu.epn.git.calculator;

public class Calculator {


    private int respuesta;


    public int suma(int a, int b){
        return a + b;
    }

    public int resta(int a, int b){
        return a - b;
    }

    public int multiplicacion(int a, int b){
        return a * b;
    }

    public double division(double a, double b){
        double respDivision = 0;
        try {
            respDivision = a / b;
        } catch(Exception e){
            e.printStackTrace();
        }
        return respDivision;
    }


    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }


}
