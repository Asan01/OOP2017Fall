import java.util.Scanner;

public class delChisla {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        for(int i = 1; i <= a; i++)
            if (a % i == 0)
                System.out.print(i + " ");
    }
}
