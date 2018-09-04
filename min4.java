import java.util.Scanner;

public class min4 {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = cs.nextInt();
        int d = cs.nextInt();
        System.out.print(min(a,b,c,d));
    }

    static int min(int a, int b, int c, int d){
        int min = a;

        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;

        return min;
    }
}
