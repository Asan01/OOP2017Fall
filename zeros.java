import java.util.Scanner;

public class zeros {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int x;
        int k = 0;
        for (int i = 1; i <= n ; i++)
        {
            x = cs.nextInt();
            if (x == 0)
                k++;
        }
        System.out.print(k);
    }
}
