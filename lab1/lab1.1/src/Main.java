import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        double result = scan.nextDouble();
        boolean run = true;
        scan.nextLine();

        while(run)
        {
            char math = scan.nextLine().charAt(0);
            if (math == '=') {
                run = false;
                break;
            }

            double num = scan.nextDouble();
            switch (math) {
                case '*':
                    result *= num;
                    break;
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '/':
                    if (num != 0.0) {
                        result /= num;
                    } else {
                        System.out.println("Cannot divide by zero");
                        scan.nextLine();
                        run = false;
                    }
                    break;
                default:
                    System.out.println("Something unbelievable");
                    run = false;
            }
            scan.nextLine();
        }

        System.out.println("Result: " + result);
    }
}
