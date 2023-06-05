import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {
    @Test
    void esPotConnectar() {

        String[] connectors = {"HM"};
        Cablejat.CableUSB cable = new Cablejat.CableUSB(connectors);

        assertTrue(cable.esPotConnectar());

    }
    @Test
    void esPotConnectar2() {

        String[] connectors = {"HH"};
        Cablejat.CableUSB cable = new Cablejat.CableUSB(connectors);

        assertFalse(cable.esPotConnectar());

    }
    @Test
    void esPotConnectar3() {

        String[] connectors = {"HM", "MH"};
        Cablejat.CableUSB cable = new Cablejat.CableUSB(connectors);

        assertTrue(cable.esPotConnectar());

    }
    @Test
    void esPotConnectar4() {

        String[] connectors = {"HM", "HH", "MM"};
        Cablejat.CableUSB cable = new Cablejat.CableUSB(connectors);

        assertTrue(cable.esPotConnectar());

    }

}