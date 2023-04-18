package Main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTruTron;
import Shapes.HinhVuong;

       public class App {
       public static void main(String[] args) {
   
        HinhTron HinhTron = new HinhTron();
        HinhTron.xuatTen();
        HinhTron.NhapBanKinh();
        HinhTron.TinhChuVi();
        HinhTron.inChuVi();
        HinhTron.TinhDienTich();
        HinhTron.inDienTich();
     
        HinhTruTron HinhTruTron = new HinhTruTron();
        HinhTruTron.Ten();
        HinhTruTron.nhapBanKinh();
        HinhTruTron.tinhTheTich();
        HinhTruTron.inTheTich();
 
        HinhChuNhat HinhChuNhat = new HinhChuNhat () ;
        HinhChuNhat.Ten();
        HinhChuNhat.nhapChieuDai();
        HinhChuNhat.nhapChieuRong();
        HinhChuNhat.tinhChuvi();
        HinhChuNhat.inChuvi();
        HinhChuNhat.tinhDienTich();
        HinhChuNhat.inDienTich();
  
        HinhVuong HinhVuong = new HinhVuong();
        HinhVuong.Ten();
        HinhVuong.nhapCanh();
        HinhVuong.tinhChuvi();
        HinhVuong.inChuvi();
        HinhVuong.tinhDienTich();
        HinhVuong.inDienTich();
      
      }
   }


