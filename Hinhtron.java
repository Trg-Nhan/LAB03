package lab03;
public class Hinhtron {
    private final float PI=3.14;
    private float banKinh;
    private float chuVi;
    private float dienTich;
    public Hinhtron(float banKinh){
        this.banKinh=banKinh;
    }
    public float getChuvi(){
        return chuVi;
    }
    public float getDienTich(){
        return dienTich;
    }
    public void tinhchuvi(){
        chuVi=2*PI*banKinh;
    }
    public void tinhDienTich(){
        dienTich=PI*banKinh*banKinh;
    }
}
