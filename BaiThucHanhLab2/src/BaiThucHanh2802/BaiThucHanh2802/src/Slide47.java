import java.util.Scanner;

public class Slide47 {
public static void main(String[] args) {
    int sum = 0, number;
    Scanner sc = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số:");
        number = sc.nextInt();
        sum += number;
        if (sum > 100)
            break;
    } 
    while (number > 0);
         System.out.println("Tổng = " + sum);
         sc.close();
    }
}