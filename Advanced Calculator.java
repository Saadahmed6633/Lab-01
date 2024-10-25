import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        System.out.println("Choose an operation: +, -, *, /, ^, √, sin, cos, tan");
        String operation = scanner.next();
        
        double result;
        switch (operation) {
            case "+":
                System.out.print("Enter another number: ");
                double addNum = scanner.nextDouble();
                result = num + addNum;
                System.out.println("Result: " + result);
                break;
            case "-":
                System.out.print("Enter another number: ");
                double subNum = scanner.nextDouble();
                result = num - subNum;
                System.out.println("Result: " + result);
                break;
            case "*":
                System.out.print("Enter another number: ");
                double mulNum = scanner.nextDouble();
                result = num * mulNum;
                System.out.println("Result: " + result);
                break;
            case "/":
                System.out.print("Enter another number: ");
                double divNum = scanner.nextDouble();
                if (divNum != 0) {
                    result = num / divNum;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case "^":
                System.out.print("Enter the exponent: ");
                double exponent = scanner.nextDouble();
                result = Math.pow(num, exponent);
                System.out.println("Result: " + result);
                break;
            case "√":
                if (num >= 0) {
                    result = Math.sqrt(num);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot compute square root of a negative number.");
                }
                break;
            case "sin":
                result = Math.sin(Math.toRadians(num));
                System.out.println("Result: " + result);
                break;
            case "cos":
                result = Math.cos(Math.toRadians(num));
                System.out.println("Result: " + result);
                break;
            case "tan":
                result = Math.tan(Math.toRadians(num));
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, /, ^, √, sin, cos, or tan.");
        }
        
        scanner.close();
    }
}
