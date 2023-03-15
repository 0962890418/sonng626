import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao b: ");
        int b = scanner.nextInt();
        
        int tong = a + b;
        System.out.println(a + "+" + b + "=" + tong);

        int hieu = a - b;
        System.out.println(a + "-" + b + "=" + hieu);

        int nhan = a * b;
        System.out.println(a + "*" + b + "=" + nhan);

        int chia = a / b;
        System.out.println(a + "/" + b + "=" + chia);

        float duhaiso = a % b;
        System.out.println(a + "/" + b + " du " + duhaiso);

        System.out.println("Ket qua so sanh 2 so " +  a  + " va " +  b  + " la " + (a == b));
        System.out.println("Ket qua so sanh 2 so " +  a  + " va " +  b  + " la " + (a > b));
        System.out.println("Ket qua so sanh 2 so " +  a  + " va " +  b  + " la " + (a < b));
        scanner.close();
    }
}