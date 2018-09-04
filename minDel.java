import java.util.Scanner;

public class minDel {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int i = 2;
        int mindel = 1;
        int sqrtN = (int) Math.sqrt(Math.round(n));
        while(i<=sqrtN){
            if(n%i == 0){
                mindel = i;
                break;
            }
            i++;
        }
        if(mindel == 1)
            System.out.print(n);
        else
            System.out.print(mindel);
    }
}
