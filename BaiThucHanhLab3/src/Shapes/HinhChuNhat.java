package Shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc{
        Scanner sc = new Scanner(System.in);
        float dai, rong;
        float Chuvi;
        float Dientich;
        void nhapThongtin(){
            System.out.print("Nhap chieu dai: " );
            Scanner sc = new Scanner(System.in);
            dai = sc.nextFloat();
            System.out.print("Nhap chieu rong: ");
            rong = sc.nextFloat();
            sc.close();
        }
        public HinhChuNhat() {
            ten = "Hinh Chu Nhat";
        }
        void tinhChuvi() { 
            Chuvi = 2*dai + 2*rong;
        }
        void tinhDientich(){
            Dientich = dai * rong;
        }
    }        

