package Shapes;
import java.util.Scanner;

public class HinhTron extends HinhHoc {
    //git commit -m BTH_21_03
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;

    public HinhTron() {
        ten = "Hinh Tron";
    }

    void NhapBanKinh() {
        System.out.println("Nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        sc.close();
    }

    void TinhChuVi() {
        cv = 2 * PI * r;
    }
    void TinhDienTich() {
        dt = PI * r * r;
    }
}
