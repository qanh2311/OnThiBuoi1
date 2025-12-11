public class TinhTong {
    public int sumArray(int [] arr){
        if ( arr == null){
            throw new IllegalArgumentException("Mang không được null");
        }
        for ( int num: arr){
            if ( num < 1 || num > 100){
                throw new IllegalArgumentException("Phần tử trong mảng phải từ 1-100");
            }
        }
        int sum = 0;
        for ( int num : arr){
            sum += num;
        }
        return sum;
    }


}
