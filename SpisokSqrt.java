import java.util.Scanner;

public class SpisokSqrt {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int num = 1;
        int eq = num*num;
        while(eq<=n){
            System.out.print(eq + " ");
            num++;
            eq = num*num;
        }
    }
}
