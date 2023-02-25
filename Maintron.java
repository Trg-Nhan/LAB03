package lab03;
public class Maintron {
  public static void main(String[] args) {
        Hinhtron ht=new Hinhtron(30);
        ht.tinhchuvi();
        ht.tinhDienTich();
        float chuVi=ht.getChuvi();
        float dienTich=ht.getDienTich();
        System.out.println("Chu vi hinh tron= "+chuVi+"; dien tich : "+dienTich);
    }  
}
