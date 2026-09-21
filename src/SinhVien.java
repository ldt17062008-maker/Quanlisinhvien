public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien(String maSV, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public String getMaSV() { return maSV; }
    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3.0;
    }
    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();
        if (dtb >= 8.5) return "Gioi";
        else if (dtb >= 7.0) return "Kha";
        else if (dtb >= 5.0) return "Trung Binh";
        else return "Yeu";
    }
    public void hienThi() {
        System.out.printf("%-10s | %-20s | DTB: %.2f | %s\n", maSV, hoTen, tinhDiemTrungBinh(), xepLoai());
    }
}// chuc nang tim kiem sinh vien
// xep loai sinh vien
