import java.util.Scanner;

public class BiggerThanNeighbours {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int cnt = 0;
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = cs.nextInt();
        }
        for (int i = 1 ; i < n - 1; i++){
            if (a[i] > a[i-1] && a[i]>a[i+1])
                cnt ++;
        }
        System.out.print(cnt);
    }
}
