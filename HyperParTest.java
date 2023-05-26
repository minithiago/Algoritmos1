import static org.junit.jupiter.api.Assertions.*;

class HyperParTest {

    @org.junit.jupiter.api.Test
    void esHyperPar1() {
        boolean prueba = HyperPar.esHyperPar(32342);
        assertEquals(false,prueba);
    }
}