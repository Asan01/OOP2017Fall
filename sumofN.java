import java.util.Scanner;

public class sumofN {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int x;
        long sum = 0;
        for (int i = 1; i <= n; i++)
        {
            x = cs.nextInt();
            sum += x;
        }
        System.out.print(sum);
    }
}
