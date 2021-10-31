import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input nilai A: ");
        double val = in.nextDouble();
        System.out.print("Input nilai B: ");
        double val2 = in.nextDouble();
        System.out.print("Pilih operator(* / + -): ");
        char op = in.next().charAt(0);
        operator(op,val,val2);
    }

    static void operator(char operator, double val, double val2) {
        switch (operator) {
            case '*':
                double result = (val * val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '/':
                result = (val / val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '+':
                result = (val + val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            case '-':
                result = (val - val2);
                System.out.printf("Hasil dari %f %s %f adalah %f\n", val, operator, val2, result);
                break;
            default:
                System.out.println("Check operator");
        }
    }
}