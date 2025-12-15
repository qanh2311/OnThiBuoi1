package Bai1;
public class KtrSoNguyen {
    public int SoNguyen(int n){
        if(n < 1 || n > 100){
            throw new IllegalArgumentException("So tri cho phep trong khoan tu 1 den 100");
        }
        return n;
    }
}
