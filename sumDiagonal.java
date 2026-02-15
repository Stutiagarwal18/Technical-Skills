import java.util.*;

class sumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int r = sc.nextInt();
        System.out.println("enter columns");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}