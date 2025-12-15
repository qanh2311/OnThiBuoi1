package Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongSoLeTest {
    public TongSoLe service;
    @BeforeEach
    public void setUp(){
        service = new TongSoLe();
    }

    @Test
    public void testTinhTong(){
        int result = service.tongSoLe(4);
        int ex = 4;
        assertEquals(ex,result);
    }

    @Test
    public void testTinhTong2(){
        int result = service.tongSoLe(1000);
        int ex = 250000;
        assertEquals(ex,result);
    }
    @Test
    public void testTinhTong3(){
        int result = service.tongSoLe(500);
        int ex = 62500;
        assertEquals(ex,result);
    }
    @Test
    public void KHL_testTinhTong(){
        assertThrows(IllegalArgumentException.class, () -> service.tongSoLe(-100));
    }

    @Test
    public void KHL_testTinhTong2(){
        assertThrows(IllegalArgumentException.class, () -> service.tongSoLe(10990));
    }
}