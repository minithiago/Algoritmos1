import static org.junit.jupiter.api.Assertions.*;

class HyperParTest {

    @org.junit.jupiter.api.Test
    void esHyperPar1() {
        boolean prueba = HyperPar.esHyperPar(32342);
        assertEquals(false,prueba);
    }
    @org.junit.jupiter.api.Test
    void esHyperPar2() {
        boolean prueba = HyperPar.esHyperPar(1);
        assertEquals(false,prueba);
    }
    @org.junit.jupiter.api.Test
    void esHyperPar3() {
        boolean prueba = HyperPar.esHyperPar(-23);
        assertEquals(false,prueba);
    }
    @org.junit.jupiter.api.Test
    void esHyperPar4() {
        boolean prueba = HyperPar.esHyperPar(-6);
        assertEquals(true,prueba);
    }
    @org.junit.jupiter.api.Test
    void esHyperPar5() {
        boolean prueba = HyperPar.esHyperPar(6804);
        assertEquals(true,prueba);
    }
}