import java.util.Scanner;

public class max2 {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        if(a>b)
            System.out.print("1");
        if(b>a)
            System.out.print("2");
        if(a==b)
            System.out.print("0");
    }
}
