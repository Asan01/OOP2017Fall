import java.util.Scanner;

public class doubleLog {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        int i = 1;
        int cnt = 0;
        while(i < num){
            i <<= 1;
            cnt++;
        }
        System.out.println(cnt);
    }
}
