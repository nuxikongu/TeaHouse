import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeaOrderTest {

    @Test
    void testTeaOrderConstructor() {
        TeaOrder teaOrder = new TeaOrder("Matcha", 2, true, false, true, false);

        // Kiểm tra các thuộc tính của TeaOrder
        assertEquals("Matcha", teaOrder.getGeschmack());
        assertEquals(2, teaOrder.getAnzahl());
        assertTrue(teaOrder.isTapioka());
        assertFalse(teaOrder.isFruechte());
        assertTrue(teaOrder.isTakeAway());
        assertFalse(teaOrder.isLaktosefrei());
    }

    @Test
    void testGetDetails() {
        TeaOrder teaOrder = new TeaOrder("Black", 3, true, true, false, true);
        String expectedDetails = "Geschmack: Black, Anzahl: 3, Topping: Tapioka, Früchte, TakeAway: Nein, Laktosefrei: Ja";
        assertEquals(expectedDetails, teaOrder.getDetails());
    }
}