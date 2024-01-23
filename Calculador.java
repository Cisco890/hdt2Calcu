public class Calculador implements Icalculadora {

    public int suma(int op1, int op2) {
        int value;
        value = op1 + op2;
        return value;
       
    }

    public int resta(int op1, int op2) {
        int value;
        value = op1 - op2;
        return value;
    }

    public int multiplicacion(int op1, int op2) {
        int value;
        value = op1 * op2;
        return value;
        
    }
    public int division(int op1, int op2) {
        int value;
        if(op2 == 0){
            throw new ArithmeticException("No podemos dividir entre cero, tonoto");
        } else {
            value = op1/op2;
            return value;
        }   
    }
    
}
