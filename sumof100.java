import java.util.Scanner;


public class sumof100 {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int x;
        long sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            x = cs.nextInt();
            sum += x;
        }
        System.out.print(sum);
    }
}
