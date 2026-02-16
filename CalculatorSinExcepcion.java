public class CalculatorSinExcepcion {

    public static boolean esNumerico(String str) {
        if (str == null || str.isEmpty())
            return false;

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Calculadora Sin Excepcion ingresa: operando1 operador operando2");
            System.exit(1);
        }

        if (!esNumerico(args[0])) {
            System.out.println("Error: El primer operando no es numérico -> " + args[0]);
            System.exit(1);
        }

        if (!esNumerico(args[2])) {
            System.out.println("Error: El segundo operando no es numérico -> " + args[2]);
            System.exit(1);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

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
