import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTypeTest {

    @Test
    @Disabled("intput 3,3,3 = true")
    void testTamGiacDeu() {
        boolean result = TriangleType.checkTamGiacDeu(3,3,3);
        assertTrue(result);
    }

    @Test
    @Disabled("Input 3,4,5 = false")
    void testTamGiacDeu2(){
        boolean result = TriangleType.checkTamGiacDeu(3,4,5);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    @Disabled("Input 3,3,4 = true")
    void testTamGiacCan() {
        boolean result = TriangleType.checkTamGiacCan(3,3,4);
        assertTrue(result);
    }

    @Test
    @Disabled("Input 3,4,5 = false")
    void tesamGiacCan2(){
        boolean result = TriangleType.checkTamGiacCan(3,4,5);
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    @Disabled("Input 3,4,5 = true")
    void checkTriangle() {
        boolean result = TriangleType.checkTriangle(3,4,5);
        assertTrue(result);
    }

    @Test
    @Disabled("Input 2,3,9 = false")
    void testTriangle2(){
        boolean result = TriangleType.checkTriangle(2,3,9);
        System.out.println(result);
        assertFalse(result);
    }


}