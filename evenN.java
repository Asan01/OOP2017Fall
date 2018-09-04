import java.util.Scanner;

public class evenN {
    public static void main(String[] args){
        Scanner cs =  new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        for(int i = a; i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
