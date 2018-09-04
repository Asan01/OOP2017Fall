import java.util.Scanner;

public class pow {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        double a = cs.nextDouble();
        int b = cs.nextInt();
        System.out.print(power(a, b));
    }

    static double power(double a, int b){
        return Math.pow(a, b);
    }
}
