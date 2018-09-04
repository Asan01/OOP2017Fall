import java.util.Scanner;


public class ZnakChisla {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        if(a>0){
            System.out.print("1");
        }
        if (a<0){
            System.out.print("-1");
        }
        if (a==0){
            System.out.print("0");
        }
    }
}
