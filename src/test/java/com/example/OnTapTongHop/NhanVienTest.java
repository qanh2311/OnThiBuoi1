package com.example.OnTapTongHop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienTest {
    private NhanVienService service;
    @BeforeEach
    public void setUp(){
        service = new NhanVienService();
    }

    @Test
    public void HL_ThemNV(){
        NhanVien nv = new NhanVien("MA01","PHAN THAO NHI", 9, 100000, "Marketing");
        assertTrue(service.themNhanVien(nv));
    }

    @Test
    public void KHL_ThemTenTrong(){
        NhanVien nv = new NhanVien("MA02","", 9, 100000, "Marketing");
        assertThrows(IllegalArgumentException.class, () -> service.themNhanVien(nv));
    }

    @Test
    public void KHL_ThemMaTrong(){
        NhanVien nv = new NhanVien("","PHAN THAO NHI", 9, 100000, "Marketing");
        assertThrows(IllegalArgumentException.class, () -> service.themNhanVien(nv));
    }

    @Test
    public void KHL_ThemPhongBanTrong(){
        NhanVien nv = new NhanVien("MA03","PHAN THAO NHI", 9, 100000, "");
        assertThrows(IllegalArgumentException.class, () -> service.themNhanVien(nv));
    }

    @Test
    public void KHL_ThemLuong1(){
        NhanVien nv = new NhanVien("MA04","PHAN THAO NHI", 9, -100000, "Marketing");
        assertThrows(IllegalArgumentException.class, () -> service.themNhanVien(nv));
    }

    @Test
    public void KHL_ThemLuong2(){
        NhanVien nv = new NhanVien("MA04","PHAN THAO NHI", 9, 1000000000, "Marketing");
        assertThrows(IllegalArgumentException.class, () -> service.themNhanVien(nv));
    }

    @Test
    public void HL_SuaNV(){
        NhanVien nv = new NhanVien("MA01","PHAN THAO NHI", 9, 100000, "Marketing");
        service.themNhanVien(nv);
        assertTrue(service.suaNV("MA01", 2000000));
    }

    @Test
    public void KHL_SuaLuong(){
        assertThrows(IllegalArgumentException.class, ()-> service.suaNV("MA01", -10000000));
    }
}