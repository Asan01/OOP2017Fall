import java.util.Scanner;

public class viskgod {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        if(a%4 == 0 && a%100!=0 || a%400 == 0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
