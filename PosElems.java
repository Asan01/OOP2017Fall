import java.util.Scanner;


public class PosElems {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            a[i] = cs.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (a[i] > 0)
                cnt++;
        }
        System.out.print(cnt);
    }
}
