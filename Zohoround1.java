
//12-02-2021
import java.util.Scanner;

class Zohoround1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n, i, j;
        n = str.length();
        char[] ch = str.toCharArray();
        char[] ch1 = new char[n];

        for (i = n / 2, j = 0; i < n; i++, j++) {
            ch1[j] = ch[i];
            // System.out.print(ch1[j]);

        }

        for (i = 0, j = n / 2 + 1; i < n / 2; i++, j++) {
            ch1[j] = ch[i];

        }

        int l = n, k, m = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < l; j++) {
                System.out.print(" ");
            }
            l--;
            for (k = 0; k <= m; k++) {
                System.out.print(ch1[k]);
            }
            m++;
            System.out.println();
        }
    }
}
