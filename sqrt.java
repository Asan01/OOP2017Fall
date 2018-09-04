import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

import static java.lang.Math.ceil;

public class sqrt {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int sqrtA = (int) Math.ceil(Math.sqrt(a + 0.0));
        int sqrtB = (int) Math.sqrt(Math.round(b));
        for (int i = sqrtA ; i <= sqrtB ; i++)
            System.out.print(i*i + " ");

    }
}
