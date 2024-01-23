public class MenuCalc {

    public static double operador(String LineaPostfix){
        CustomStack<Double> stack = new CustomStack<>();
        Calculador calc = new Calculador();
        for(int i = 0; i < LineaPostfix.length(); i++ ){
            char Simbolo = LineaPostfix.charAt(i);
            if( Character.isDigit(Simbolo)){
                stack.push(Double.valueOf(Character.getNumericValue(Simbolo)));

            } else if( isOperator(Simbolo)){
                double op2 = stack.pop();
                double op1 = stack.pop();
                switch (Simbolo) {
                    case '+':
                        stack.push(calc.suma(op1, op2));
                        break;
                    case '-':
                        stack.push(calc.resta(op1, op2));
                        break;
                    case '*':
                        stack.push(calc.multiplicacion(op1, op2));
                        break;
                    case '/':
                        stack.push(calc.division(op1, op2));
                        break;
                    default:
                        System.out.print("La linea ingresada: " + LineaPostfix + " no a sido valida para calcular");
                        return 0.0;
                }
            } 
        }

        if (!stack.isEmpty()) {
            return stack.pop();
        }

        throw new RuntimeException("Expresión Postfix no válida");
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static void main(String[] args) {
        String postfix = "23*5+"; // Este es un ejemplo de expresión en notación Postfix
        double result = operador(postfix);
        System.out.print("Resultado: " + result);
    }

}
