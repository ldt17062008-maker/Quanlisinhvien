import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<SinhVien> danhSach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        danhSach.add(new SinhVien("SV001", "Nguyen Van A", 8.5, 7.5, 9.0));
        danhSach.add(new SinhVien("SV002", "Tran Thi B", 6.0, 7.0, 6.5));
        int chon;
        do {
            System.out.println("\n===== QUAN LY SINH VIEN =====");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Them sinh vien");
            System.out.println("4. Tim theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1: nhapDS(); break;
                case 2: hienThi(); break;
                case 3: them(); break;
                case 4: tim(); break;
            }
        } while(chon!=0);
    }
    static void nhapDS(){ System.out.print("So luong: "); int n=Integer.parseInt(sc.nextLine()); for(int i=0;i<n;i++) them(); }
    static void them(){ System.out.print("Ma: "); String ma=sc.nextLine(); System.out.print("Ten: "); String ten=sc.nextLine(); System.out.print("Toan: "); double t=Double.parseDouble(sc.nextLine()); System.out.print("Ly: "); double l=Double.parseDouble(sc.nextLine()); System.out.print("Hoa: "); double h=Double.parseDouble(sc.nextLine()); danhSach.add(new SinhVien(ma,ten,t,l,h)); }
    static void hienThi(){ for(SinhVien sv:danhSach) sv.hienThi(); }
    static void tim(){ System.out.print("Ma can tim: "); String m=sc.nextLine(); for(SinhVien sv:danhSach) if(sv.getMaSV().equalsIgnoreCase(m)) sv.hienThi(); }
}