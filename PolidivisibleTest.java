import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolidivisibleTest {

    @Test
    void esPolidivisible() {

        String numero = "1234567890";
        assertEquals(true,Polidivisible.tieneTodosLosDigitos(numero));

        assertFalse(Polidivisible.esPolidivisible(Long.parseLong(numero)));

    }

    @Test
    void esPolidivisible2() {

        String numero = "777";
        assertEquals(false,Polidivisible.tieneTodosLosDigitos(numero));

        assertFalse(Polidivisible.esPolidivisible(Long.parseLong(numero)));

    }
    @Test
    void esPolidivisible3() {

        String numero = "381654729";
        assertEquals(false,Polidivisible.tieneTodosLosDigitos(numero));

        assertTrue(Polidivisible.esPolidivisible(Long.parseLong(numero)));

    }
    @Test
    void esPolidivisible4() {

        String numero = "9876";
        assertEquals(false,Polidivisible.tieneTodosLosDigitos(numero));

        assertTrue(Polidivisible.esPolidivisible(Long.parseLong(numero)));

    }
}