import java.util.Scanner;

public class ExacctSq {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        int i = 1;
        boolean ispowertwo = false;
        while(i <= num){
            if (i == num){
                ispowertwo = true;
            }
            i*=2;
        }
        if (ispowertwo){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
