import java.util.Scanner;

public class TestSys {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        if((a!=1 && b!=1) || (a == 1 && b==1)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
