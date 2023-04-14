package Shapes;
import java.util.Scanner;
public class HinhTruTron extends HinhTron {
    Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
         float h;
         float Chuvi;
         float Dientich;
         float Thetich;
        void nhapBanKinh(){
            System.out.print("Nhap ban kinh: ");
            r = sc.nextFloat();
            System.out.print("Nhap chieu cao: ");
            h = sc.nextFloat();
            sc.close();
        }
        public HinhTruTron() {
            ten = "Hinh Tru Tron";
        }
        void tinhChuvi() { 
            Chuvi = 2 * r * pi;
        }
        void tinhDientich(){
            Dientich = pi * r * r;
        }
        void tinhthetich(){
            Thetich = pi*r*r*h;
        }
}