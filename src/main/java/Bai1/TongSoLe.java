package Bai1;

public class TongSoLe {
    public int tongSoLe(int n){
        if(n < 1 || n > 1000){
            throw new IllegalArgumentException("Gia tri trong khoang 1 den 1000");
        }
        int result = 0;
        for (int i = 1; i <= n; i++){
            if(i % 2 != 0){
                result += i;
            }
        }
        return result;
    }
}
