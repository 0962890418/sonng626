import java.util.Scanner;
 
public class Bai4 {
   
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Mời bạn nhập số: ");
        month = sc.nextInt();
         
    switch (month) {
        case 1:
            System.out.println("Đây là tháng 1");
            break;
        case 2:
            System.out.println("Đây là tháng 2");
            break;
        case 3:
            System.out.println("Đây là tháng 3");
            break;
        case 4:
            System.out.println("Đây là tháng 4");
            break;
        case 5:
            System.out.println("Đây là thámg 5");
            break;
        case 6:
            System.out.println("Đây là tháng 6");
            break;
        case 7:
            System.out.println("Đây là thứ tháng 7");
            break;
        case 8:
            System.out.println("Đây là thứ tháng 8");
            break;    
        case 9:
            System.out.println("Đây là thứ tháng 9");
            break; 
        case 10:
            System.out.println("Đây là thứ tháng 10");
            break; 
        case 11:
            System.out.println("Đây là thứ tháng 11");
            break;                  
        case 12:
            System.out.println("Đây là thứ tháng 12");
            break;  
        }
        sc.close();
    }
}
