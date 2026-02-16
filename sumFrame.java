
// wap to find sum of frame elements of a matrix
import java.util.Scanner;

public class sumFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter r and c: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1)
                    sum += m[i][j];
            }
        }
        System.out.println(sum);
    }
}
