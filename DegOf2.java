import java.util.Scanner;

public class DegOf2 {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int pow2 = 1;
        while(pow2 <= n){
            System.out.print(pow2 + " ");
            pow2 *= 2;
        }
    }
}
