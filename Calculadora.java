/** Anthony Lou Shwank 23410/Juan Francisco Martínez 23617
  * Icalculadora
 
  * @param   no_hay
  * @throws Calculador Logica basica de arimetica para los calculos de la aplicacion
  */
  public class Calculadora implements ICalculadora {

    public double sumar(double op1, double op2) {                //Indicamos metodo suma
        double value;                                           
        value = op1 + op2;                                      //Igualamos el valor decimal "value" hacia la suma de los operandos 
        return value;                                           //Devolvemos "value"
       
    }

    public double restar(double op1, double op2) {               //Indicamos metodo resta
        double value;
        value = op1 - op2;                                      //Igualamos el valor decimal "value" hacia la resta de los operandos
        return value;                                           //Devolvemos "value"
    }

    public double multiplicar(double op1, double op2) {      //Indicamos metodo multiplicacion
        double value;
        value = op1 * op2;                                      //Igualamos el valor decimal "value" hacia la multiplicacion de los operandos
        return value;                                           //Devolvemos "value"
        
    }
    public double dividir(double op1, double op2) {            //Indicamos metodo division
        double value;   
        if(op2 == 0){                                           //Instalamos un if para evitar que la maquina haga una division entre cero
            throw new ArithmeticException("No podemos dividir entre cero");
        } else {
            value = op1/op2;                                    //Igualamos el valor decimal "value" hacia la division de los operandos
            return value;                                       //Devolvemos "value"
        }   
    }
    
}
