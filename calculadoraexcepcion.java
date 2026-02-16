public class calculadoraexcepcion {

    public static void main(String[] args) {

        // Verificar que se pasen 3 argumentos
        if (args.length != 3) {
            System.out.println("Calculadora Con Excepcion ingresa : operando1 operador operando2");
            System.exit(1);
        }

        int num1 = 0;
        int num2 = 0;
        int result = 0;

        try {
            // Intentar convertir los operandos
            num1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: El primer operando no es numérico -> " + args[0]);
            System.exit(1);
        }

        try {
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: El segundo operando no es numérico -> " + args[2]);
            System.exit(1);
        }

        char operador = args[1].charAt(0);

        switch (operador) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: División entre cero.");
                    System.exit(1);
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Operador no válido.");
                System.exit(1);
        }

        System.out.println(num1 + " " + operador + " " + num2 + " = " + result);
    }
}
