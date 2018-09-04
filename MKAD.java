import java.util.Scanner;

public class MKAD {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);

        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = (a * b) % 109;

        System.out.print((c + 109) % 109);
    }
}
