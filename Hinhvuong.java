package lab03;
public class Hinhvuong {
    private float canh;
    private float dientich;
    private float chuVi;
    public HinhVuong(float canh){
     this.canh=canh;
    }
    public float getienTich(){
        return dientich;
    }
   public void tinhdienTich(){
       dientich = canh* canh;
   }
   public float getChuVi(){
       return chuVi;
   }
   public void tinhChuVi(){
       chuVi= canh*4;
         }
   }

