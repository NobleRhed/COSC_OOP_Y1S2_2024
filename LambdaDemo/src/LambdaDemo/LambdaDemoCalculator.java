package LambdaDemo;

public class LambdaDemoCalculator {

    interface MathOperation {
        int operation(int a, int b);
    }

    interface UnaryOperation {
        int operation(int a);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private int operateUnary(int a, UnaryOperation unaryOperation) {
        return unaryOperation.operation(a);
    }
    public static void main(String args[]) {
        LambdaDemoCalculator tester = new LambdaDemoCalculator();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        //Now trying with a factorial output
        UnaryOperation factorial = (int a) -> {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        System.out.println("5! =" + tester.operateUnary(5, factorial));

    }

}