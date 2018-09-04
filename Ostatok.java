import java.util.Scanner;

public class Ostatok {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = cs.nextInt();
        int d = cs.nextInt();
        for(int i = a; i<=b; i++){
            if(i%d==c){
                System.out.print(i + " ");
            }
        }
    }
}
