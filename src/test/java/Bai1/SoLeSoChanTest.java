package Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoLeSoChanTest {

    public SoLeSoChan service;
    @BeforeEach
    public void setUp(){
        service = new SoLeSoChan();
    }

    @Test
    public void testsoChan(){
        boolean result = service.soChan(4);
        assertTrue(result);
    }
    @Test
    public void testsoChan0(){
        boolean result = service.soChan(0);
        assertTrue(result);
    }
    @Test
    public void testsoChanAm(){
        boolean result = service.soChan(-4);
        assertTrue(result);
    }
    @Test
    public void testsoLe(){
        boolean result = service.soChan(5);
        assertFalse(result);
    }
    @Test
    public void testsoLeAm(){
        boolean result = service.soChan(-5);
        assertFalse(result);
    }
}