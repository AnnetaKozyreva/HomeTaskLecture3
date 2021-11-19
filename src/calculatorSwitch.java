import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        double firstValue = 0, secondValue = 0;
        double result;
        String arrayOfOperators = "+-*/%";
        String operator = "+";
        boolean isLoop = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please,Input first value");

            if (!input.hasNextDouble())  {
                System.out.println("Input is wrong");
                input.next();
            }else{
                firstValue = input.nextDouble();
                isLoop = false;
            }
        }
        while (isLoop);

        isLoop = true;
        do {
            System.out.println("Please, input operator: : +, -, *, /, %");
            operator = input.next();

            if (!arrayOfOperators.contains(operator))  {
                System.out.println("You input unsupported operations!");
            }else{
                isLoop = false;
            }
        }
        while (isLoop);

        isLoop = true;
        do {
            System.out.println("Please,Input second value");

            if (!input.hasNextDouble())  {
                System.out.println("Input is wrong");
                input.next();
            }else{
                secondValue = input.nextDouble();
                isLoop = false;
            }
        }
        while (isLoop);


        switch (operator) {
            case "+" : {
                result = firstValue + secondValue;
                System.out.println(firstValue + " + " + secondValue + " = " + result);
                break;
            }
            case "-" : {
                result = firstValue - secondValue;
                System.out.println(firstValue + " - " + secondValue + " = " + result);
                break;
            }
            case "*" : {
                result = firstValue * secondValue;
                System.out.println(firstValue + " * " + secondValue + " = " + result);
                break;
            }
            case "/" : {
                result = firstValue / secondValue;
                System.out.println(firstValue + " / " + secondValue + " = " + result);
                break;
            }
            case "%" : {
                result = firstValue % secondValue;
                System.out.println(firstValue + " % " + secondValue + " = " + result);
                break;
            }
            default : System.out.println("You input unsupported operations!");
        }

        input.close();

    }

}
