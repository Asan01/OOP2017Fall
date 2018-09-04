import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        if (a > b) {
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
}
