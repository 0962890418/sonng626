package Main;
import src.Shapes.HinhChuNhat;
import src.Shapes.HinhTron;
import src.Shapes.HinhTruTron;

       public class App {
       public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System. in);
        String name;
        System.out.printin(x: "Nhap hinh can su dung:
        ");
        name = scanner.nextLine();
        I
        switch (name) {
        case "HinhTron":
        HinhTron hinhTron = new HinhTron();
        hinhTron.Ten();
        hinhTron.nhapBanKinh();
        hinhTron.tinhchuvi();
        hinhTron.inChuvi();
        hinhTron.tinhDienTich();
        hinhTron.inDienTich();
        break;
        case "HinhTruTron":
        hinhTruTron hinhTruTron = new HinhTru();
        hinhTru.Ten();
        hinhTru.nhapChieucao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();
        break;
     case "HinhChuNhat":
        HinhChuNhat hinhChuNhat = new HinhChuNhat () ;
        hinhChuNhat.Ten();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong(I;
        hinhChuNhat.tinhChuvi();
        hinhChuNhat.inChuvi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inDienTich();
        break;
        case "Hinhvuong":
        HinhVuong hinhvuong = new Hinhvuong();
        hinhvuong.Ten();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuvi();
        hinhvuong.inChuvi();
        hinhvuong.tinhDienTich();
        hinhvuong-inDienTich();
        break:
        default:
        System.out.println(x:
