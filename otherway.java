import java.util.Scanner;

public class otherway {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
        }
        for (int i = 0; i < n/2; i++){
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
