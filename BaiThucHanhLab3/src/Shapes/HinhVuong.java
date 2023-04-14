package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    Scanner sc = new Scanner(System.in);
        float canh;
        float Chuvi;
        float Dientich;
        void nhapThongtin(){
    System.out.println("Nhap do dai canh: ");
    Scanner sc = new Scanner(System.in);
    canh = sc.nextFloat();
    sc.close();
}
public HinhVuong() {
    ten = "Hinh Vuong";
}
void tinhChuvi() {
    Chuvi = 4*canh;
}
void tinhDientich() {
    Dientich = canh * canh;
}
}