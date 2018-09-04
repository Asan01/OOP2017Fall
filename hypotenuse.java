import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();

        System.out.print(Math.sqrt((a*a) + (b*b)));
    }
}
