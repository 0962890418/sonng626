import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a = ");
        a = scanner.nextInt();
        System.out.println("Nhap so b = ");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Hai so bang nhau");
        } else if (a < b) {
            System.out.println("So nho hon la: " + a);
        } else {
            System.out.println("So nho hon la: " + b);
        }
        ;
    }
}
