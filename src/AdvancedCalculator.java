import java.util.Scanner;

public class AdvancedCalculator {
    static double add(double a, double b) {
        return a + b;

    }

    static double subtract(double a, double b) {
        return a - b;

    }

    static double divide(double a, double b) {
        return a / b;

    }

    static double multiply(double a, double b) {
        return a * b;

    }

    static int exponent(int a, int b) {
        return (int) Math.pow(a,b);

    }

    static int factorial(double a) {
        int fac = 1;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                fac = fac * i;
            }
        } else {
            System.out.println("Invalid value entered !");
        }
    return fac;
    }

    public static void main(String[] args) {
        System.out.println("Please enter the action you want to do.\n" +
                "1- Add \n"+
                "2- Subtract \n"+
                "3- Divide \n"+
                "4- Multiply \n"+
                "5- Exponent \n"+
                "6- Factorial \n");
        Scanner input = new Scanner(System.in);
        int action = input.nextInt();

        switch (action){
            case 1:
                System.out.println("Please enter numbers.");
                double x = input.nextDouble();
                double y = input.nextDouble();
                System.out.println(add(x,y));
                break;
            case 2:
                System.out.println("Please enter numbers.");
                double x2 = input.nextDouble();
                double y2 = input.nextDouble();
                System.out.println(subtract(x2,y2));
                break;
            case 3:
                System.out.println("Please enter numbers.");
                double x3 = input.nextDouble();
                double y3 = input.nextDouble();
                System.out.println(divide(x3,y3));
                break;
            case 4:
                System.out.println("Please enter numbers.");
                double x4 = input.nextDouble();
                double y4 = input.nextDouble();
                System.out.println(multiply(x4,y4));
                break;
            case 5:
                System.out.println("Please enter the number first, then the exponent, respectively.");
                int x5 = input.nextInt();
                int y5 = input.nextInt();
                System.out.println(exponent(x5,y5));
                break;
            case 6:
                System.out.println("Please enter a number.");
                int x6 = input.nextInt();
                System.out.println(factorial(x6));
                break;
            default:
                System.out.println("Invalid value entered !");
                break;
        }

    }
}

