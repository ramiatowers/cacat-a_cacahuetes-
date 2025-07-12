import java.util.Scanner;

public class Calculate {
    public static void operation() {
        Scanner sc = new Scanner(System.in);
        char answer;
        do {
            System.out.println("Choose an operation: + | - | * | /");
            answer = sc.next().charAt(0);

            if (answer == 's') {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Enter the first number you want to operate with");
            double a = sc.nextDouble();
            System.out.println("Enter the second number you want to operate with");
            double b = sc.nextDouble();

            double result;

            switch (answer) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = subtract(a, b);
                    break;
                case '*':
                    result = multiply(a, b);
                    break;
                case '/':
                    result = division(a, b);
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;
            }

            System.out.println("Result: " + result);
        } while (true);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double division (double a, double b) {
        return a / b;
    }
}
