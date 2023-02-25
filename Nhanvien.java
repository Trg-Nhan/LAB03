package lab03;
public class Nhanvien {
     private String tenNhanVien;
    private double luongCoBan;
    private double luongNhanVien;
    private double heSoLuong;
    private double luong_max;
    private final boolean tongluong= true;
     public Nhanvien(String tenNhanVien){
         this.tenNhanVien=tenNhanVien;
     }
 public float getLuongCoBan(){
     return (float) luongCoBan;
 }
 public float getLuongNhanVien(){

     return (float) luongNhanVien;
 }
 public float getHeSoLuong(){
     return (float) heSoLuong;
 }
 public float getLuong_max(){
     return(float) luong_max;
 }
 public void setLuong_max(){
     this.luong_max=luong_max;
 }
 public void setLuongCoBan(){
     this.luongCoBan=lcb;
 }
 public void setLuongNhanVien(){
     luongNhanVien=luongCoBan*heSoLuong;
 }
 public void setHeSoLuong(){
     this.heSoLuong=heSoLuong;
 }
 public void setTongLuong(double luongNhanVien){
     if(luongNhanVien>luong_max){
         System.out.println("Flase");
     }
     else{
         System.out.println("True");
     }
 }
 public String toString(){
     return "ten nhan vien:"+this.tenNhanVien+",luong nhan vien: "+this.luongNhanVien;
 }
}
