package Bai2;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> dsSP = new ArrayList<>();
    public boolean themSP(SanPham sp){
        if(sp.getSoLuong() < 1 || sp.getSoLuong() > 100){
            throw new IllegalArgumentException("So Luong tu 1 den 100");
        }
        for (SanPham sp1: dsSP){
            if(sp.getMa().equals(sp1.getMa())){
                throw new IllegalArgumentException("Mã đã tồn tại");
            }

        }
        dsSP.add(sp);
        return true;
    }
}
