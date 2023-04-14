
import java.util.Scanner;
public class NhanVien {
    Scanner sc = new Scanner(System.in);
    final int Luongcoban = 14900000;
    String Hoten;
    int Namsinh, Luong;
    float Hesoluong;

    public void Nhaphoten() {
        System.out.print("Nhap vao` ho. ten: ");
        Hoten = sc.nextLine();
    }
    public void Namsinh() {
        System.out.print("Nhap. vao` nam sinh: ");
        Namsinh = sc.nextInt();
    }
    void Nhaphesoluong() {
        System.out.print("Nhap vao` he so luong: ");
        Scanner sc = new Scanner(System.in);
        Hesoluong = sc.nextFloat();
        sc.close();
    }
    void TinhLuong() {
        Luong = (int) (Luongcoban * Hesoluong);
    }
    void inLuong() {
        System.out.print("Luong cua nhan vien la " + Luong);
    }


 public static void main(String[] args) {
        NhanVien nv = new NhanVien();
            nv.TinhLuong();
            nv.inLuong();
    }
}

