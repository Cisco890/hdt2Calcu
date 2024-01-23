public class Calculador implements ICalculadora {

    public double suma(double op1, double op2) {
        double value;
        value = op1 + op2;
        return value;
       
    }

    public double resta(double op1, double op2) {
        double value;
        value = op1 - op2;
        return value;
    }

    public double multiplicacion(double op1, double op2) {
        double value;
        value = op1 * op2;
        return value;
        
    }
    public double division(double op1, double op2) {
        double value;
        if(op2 == 0){
            throw new ArithmeticException("No podemos dividir entre cero, tonoto");
        } else {
            value = op1/op2;
            return value;
        }   
    }
    
}
