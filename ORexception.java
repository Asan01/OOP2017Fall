import java.util.Scanner;

public class ORexception {
    public static int Xor(int a, int b){
        if(a == b) return 0;
        else return 1;

    }

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        System.out.println(Xor(a, b));
    }
}
