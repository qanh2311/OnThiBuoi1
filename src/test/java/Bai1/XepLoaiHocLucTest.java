package Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XepLoaiHocLucTest {
    public XepLoaiHocLuc service;
    @BeforeEach
    public void setUp(){
        service = new XepLoaiHocLuc();
    }

    @Test
    public void testCase1(){
        String result = service.diemTB(9.8);
        assertEquals("Xuất Sắc", result);
    }
    @Test
    public void testCase2(){
        String result = service.diemTB(8.5);
        assertEquals("Giỏi", result);
    }
    @Test
    public void testCase3(){
        String result = service.diemTB(7.6);
        assertEquals("Giỏi", result);
    }
    @Test
    public void testCase4(){
        String result = service.diemTB(5.9);
        assertEquals("Trung Bình", result);
    }
    @Test
    public void testCase5(){
        String result = service.diemTB(4.8);
        assertEquals("Yếu", result);
    }
}