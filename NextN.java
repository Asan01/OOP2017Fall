import java.util.Scanner;

public class NextN {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();

        System.out.println("The next number for the number "+a+" is "+(a+1)+".");
        System.out.print("The previous number for the number "+a+" is "+(a-1)+".");
    }
}
