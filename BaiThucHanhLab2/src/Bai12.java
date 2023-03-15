import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran: ");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
             
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran = " + max);
        scanner.close();
    }
}
