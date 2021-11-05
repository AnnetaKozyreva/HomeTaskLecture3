import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        double firstValue, secondValue, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please,Input first value");
        firstValue = input.nextDouble();
        System.out.println("Please, input operator: : +, -, *, /, %");
        String operator = input.next();
        System.out.println("Please,Input second value");
        secondValue = input.nextDouble();

        switch (operator) {
            case "+" -> {
                result = firstValue + secondValue;
                System.out.println(firstValue + " + " + secondValue + " = " + result);
            }
            case "-" -> {
                result = firstValue - secondValue;
                System.out.println(firstValue + " - " + secondValue + " = " + result);
            }
            case "*" -> {
                result = firstValue * secondValue;
                System.out.println(firstValue + " * " + secondValue + " = " + result);
            }
            case "/" -> {
                result = firstValue / secondValue;
                System.out.println(firstValue + " / " + secondValue + " = " + result);
            }
            case "%" -> {
                result = firstValue % secondValue;
                System.out.println(firstValue + " % " + secondValue + " = " + result);
            }
            default -> System.out.println("You input unsupported operations!");
        }

        input.close();

    }

}
