public class MiniCalculatrice {

    // Addition
    public double addition(double a, double b) {
        return a + b;
    }

    // Soustraction
    public double soustraction(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiplication(double a, double b) {
        return a * b;
    }

    // Division
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return a / b;
    }

    // Méthode principale pour tester la calculatrice
    public static void main(String[] args) {
        MiniCalculatrice calc = new MiniCalculatrice();

        System.out.println("Addition : " + calc.addition(10, 5));
        System.out.println("Soustraction : " + calc.soustraction(10, 5));
        System.out.println("Multiplication : " + calc.multiplication(10, 5));
        System.out.println("Division : " + calc.division(10, 0));
    }
}
