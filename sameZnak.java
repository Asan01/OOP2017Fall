import java.util.Scanner;

public class sameZnak {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int cnt = 0;
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = cs.nextInt();
        }
        for (int i = 2; i < n; i++){
            if (a[i]>  0 && a[i - 1] > 0 || a[i] < 0 && a[i - 1] < 0)
                cnt = 1;
        }

        if (cnt == 1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
