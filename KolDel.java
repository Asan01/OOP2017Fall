import java.util.Scanner;

public class KolDel {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = 0;
        for(int i = 1; i <= a; i++)
            if (a % i == 0)
                b++;
            System.out.print(b);
    }
}
