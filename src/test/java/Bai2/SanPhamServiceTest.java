package Bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    public SanPhamService service;
    @BeforeEach
    public void setUp(){
        service = new SanPhamService();
    }

    @Test
    public void HL_themSp(){
        SanPham sp = new SanPham("Ma01", "Banh cua", 2026 , 10000, 45, "Đồ ăn vặt");
        assertTrue(service.themSP(sp));

    }

    @Test
    public void KHL_ThemMaTonTai(){
        SanPham sp1 = new SanPham("Ma01", "Banh cua", 2026 , 10000, 45, "Đồ ăn vặt");
        SanPham sp2 = new SanPham("Ma01", "Banh cua", 2026 , 10000, 45, "Đồ ăn vặt");
        service.themSP(sp1);
        assertThrows(IllegalArgumentException.class, () -> service.themSP(sp2));
    }


}