package lab03;
public class Mainnhanvien {
    public void nhapTin(){
         Scanner sc= new Scanner(System.in);
     System.out.println("Nhap ten nhan vien:");
     sc.nextLine();
     System.out.println("Nhap luong co ban:");
       double luongCoBan = sc.nextDouble();
     System.out.println("Nhap so luong:");
       double heSoLuong = sc.nextDouble();
     }
   public static void main(String[] args) {
       Nhanvien sh =new Nhanvien(" ");
       sh.getLuongNhanVien();
       float luongNhanVien=sh.getLuongNhanVien();
        System.out.println("Luong nhan vien la :"+luongNhanVien);
    }
}
