import static org.junit.jupiter.api.Assertions.*;

class sumaDescendenteTest {

    @org.junit.jupiter.api.Test
    void resultado() {
        assertEquals(5242,sumaDescendente.resultado(4578));
    }
    @org.junit.jupiter.api.Test
    void resultado2() {
        assertEquals(14,sumaDescendente.resultado(12));
    }
    @org.junit.jupiter.api.Test
    void resultado3() {
        assertEquals(30,sumaDescendente.resultado(25));
    }
    @org.junit.jupiter.api.Test
    void resultado4() {
        assertEquals(158,sumaDescendente.resultado(126));
    }
    @org.junit.jupiter.api.Test
    void resultado5() {
        assertEquals(246,sumaDescendente.resultado(222));
    }

}