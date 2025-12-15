package Bai1;

public class XepLoaiHocLuc {
    public String diemTB(double n){
        if ( n < 0 || n > 10){
            throw new IllegalArgumentException("Diem tư 0 den 10");
        }
        if(n >= 9.0){
            return "Xuất Sắc";
        }else if( n >= 7.0 ){
            return "Giỏi";
        }else if( n >= 5.0 ){
            return "Trung Bình";
        }else {
            return "Yếu";
        }
    }
}
