package NNS634STUDENT;
import java.util.ArrayList;
import java.util.Scanner;

public class NNS634CAU1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> prsLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Person prs = new Person();
        
        // Nhap thong tin
        System.out.print("Nhap vao so nguoi`: ");
        int n = sc.nextInt();
        sc.close();

        // Them thong tin
        prs.Add(prsLists, n);

        // Hien thi du lieu
        prs.HienThi(prsLists);

        // Sua Thong Tin
        prs.SuaThongTin(prsLists);

        // Xoa Thong Tin
        prs.XoaThongTin(prsLists);

    }
}