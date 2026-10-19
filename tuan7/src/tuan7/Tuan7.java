package tuan7;

import java.util.ArrayList;

class SinhVien {
    String maSV;
    String hoTen;
    double diemTB;

    SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    void hienThi() {
        System.out.println(maSV + " - " + hoTen + " - " + diemTB);
    }
}

public class Tuan7 {
    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();
        ds.add(new SinhVien("SV01", "Nguyen An", 8.0));
        ds.add(new SinhVien("SV02", "Tran Binh", 7.5));
        ds.add(new SinhVien("SV03", "Le Chi", 9.0));

        ds.forEach((sv) -> {
            sv.hienThi();
        });
    }
}