import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    public TinhTong tt;
    @BeforeEach
    public void setUp(){
        tt = new TinhTong();
    }

    @Test
    public void HL_VungTDGiua(){
        int [] arr = { 23, 45, 67, 32, 15};
        int mongDoi = 182;
        int thucTe = tt.sumArray(arr);
        assertEquals(mongDoi, thucTe);
    }

    @Test
    public void KHL_VungTDDuoi(){
        int [] arr = {-1, -10, -12, -15};
        assertThrows(IllegalArgumentException.class, () -> tt.sumArray(arr));
    }

    @Test
    public void KHL_VungTDTren(){
        int [] arr = {101, 102,103};
        assertThrows(IllegalArgumentException.class, () -> tt.sumArray(arr));
    }

    @Test
    public void KHL_MangNull(){
        int [] arr = null;
        assertThrows(IllegalArgumentException.class, () -> tt.sumArray(arr));
    }

    @Test
    public void KHL_GiaTriKhongHopLe(){
        int [] arr = {101, 102,103, -1 , 34};
        assertThrows(IllegalArgumentException.class, () -> tt.sumArray(arr));
    }

}