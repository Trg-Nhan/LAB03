package lab03;
public class Mainvuong {
    public static void main(String[] args) {
        HinhVuong hv=new HinhVuong(20);
       hv.tinhdienTich();
       hv.tinhChuVi();
      float chuVi=hv.getChuVi();
      float dientich=hv.getdienTich();
        System.out.println("chu vi=" +chuVi );
        System.out.println("dien tich=" +dientich);
                }   
}
