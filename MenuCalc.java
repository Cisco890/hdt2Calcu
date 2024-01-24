/** Anthony Lou Shwank 23410/Juan Francisco Martínez 23617
  * Icalculadora
 
  * @param   no_hay
  * @throws Menu Implementador de logica de calculadora junto a la diferenciacion entre operandos y operadores
  */
  import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.IOException;
  public class MenuCalc {                     

    public static double operador(String LineaPostfix){                             //Indica Metodo operador, aceptando una linea de palabras como postfix
        CustomStack<Number> stack = new CustomStack<>();                            //Creamos una pila de tipo Number, generico para cualquier numero
        Calculador calc = new Calculador();                                         //Instanciamos a calculadora para acceder a sus metodos
        for(int i = 0; i < LineaPostfix.length(); i++ ){                            //Recorremos la pila de numeros
            char Simbolo = LineaPostfix.charAt(i);                                  //Reconocemos cada cosa dentro de la linea como tipo "Character"
            if( Character.isDigit(Simbolo)){                                            //Revisamos si un dato Character es parte de la lista de numeros
                stack.push(Double.valueOf(Character.getNumericValue(Simbolo)));         //Si es el caso, metemos el dato a la lista y lo convertimos en dato double
            } else if( isOperator(Simbolo)){                                        //Encuentra operador
                double op2 = stack.pop().doubleValue();                             //"Borramos" los datos de la lista y accedemos a estos valores tipo double, los asignamos a operandos 1 y 2
                double op1 = stack.pop().doubleValue();
                switch (Simbolo) {                                                  //Cambiamos dependiendo del operador
                    case '+':           
                        stack.push(calc.sumar(op1, op2));
                        break;
                    case '-':
                        stack.push(calc.restar(op1, op2));
                        break;
                    case '*':
                        stack.push(calc.multiplicar(op1, op2));
                        break;
                    case '/':
                        stack.push(calc.dividir(op1, op2));
                        break;
                    default:
                        System.out.println("La linea ingresada: " + LineaPostfix + " no a sido valida para calcular"); //Linea de postfix no bien escrita o logica incorrecta
                        return 0;
                }
            } 
        }

        if (!stack.isEmpty()) {                                     //Si esta vacio, devolvemos el ultimo
            return stack.pop().doubleValue();
        }

        throw new RuntimeException("Expresión Postfix no válida");
    }

    private static boolean isOperator(char c) {                             //Indica metodo boolean isOperator
        return c == '+' || c == '-' || c == '*' || c == '/';                //Indicamos un dato "char", donde comparamos con cualquiera de las 4 opciones para confirmar el inicio de una operacion
    }

    public static void main(String[] args) {
        try {
            String Archivo = "datos.txt";  // Nombre del archivo de texto
            BufferedReader leer = new BufferedReader(new FileReader(Archivo));

            String linea;
            while ((linea = leer.readLine()) != null) {
                double resultado = operador(linea);
                System.out.println("Resultado para la operación \"" + linea + "\": " + resultado);
            }

            leer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}