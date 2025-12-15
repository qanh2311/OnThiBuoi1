package Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KtrSoNguyenTest {
    public KtrSoNguyen service;
    @BeforeEach
    public void setUp(){
        service = new KtrSoNguyen();
    }

    @Test
    public void KHL_MinTru1(){
        assertThrows(IllegalArgumentException.class, ()-> service.SoNguyen(0));
    }

    @Test
    public void HL_Min(){
        int thucTe = service.SoNguyen(1);
        int mongDoi = 1;
        assertEquals(mongDoi,thucTe);
    }

    @Test
    public void HL_MinCong1(){
        int thucTe = service.SoNguyen(2);
        int mongDoi = 2;
        assertEquals(mongDoi,thucTe);
    }

    @Test
    public void HL_MaxTru1(){
        int thucTe = service.SoNguyen(99);
        int mongDoi = 99;
        assertEquals(mongDoi,thucTe);
    }

    @Test
    public void HL_Max(){
        int thucTe = service.SoNguyen(100);
        int mongDoi = 100;
        assertEquals(mongDoi,thucTe);
    }

    @Test
    public void KHL_MaxCong1(){
        assertThrows(IllegalArgumentException.class, ()-> service.SoNguyen(101));

    }
}