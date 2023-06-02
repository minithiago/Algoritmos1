import java.util.HashSet;

public class Cablejat {

    public static class CableUSB {
        private String[] connectors;

        public CableUSB(String[] connectors) {
            this.connectors = connectors;
        }

        public boolean esPotConnectar() {
            // Crear un conjunto para almacenar los extremos de los cables
            HashSet<String> endsSet = new HashSet<>();

            // Recorrer cada cable en el vector de conectores
            for (String connector : connectors) {
                // Obtener los extremos del cable
                String end1 = connector.substring(0, 1);
                String end2 = connector.substring(1);

                // Verificar si ambos extremos son diferentes
                if (end1.equals(end2)) {
                    return false;
                }

                // Verificar si los extremos están en el conjunto
                if (endsSet.contains(end1)) {
                    endsSet.remove(end1);
                } else {
                    endsSet.add(end1);
                }

                if (endsSet.contains(end2)) {
                    endsSet.remove(end2);
                } else {
                    endsSet.add(end2);
                }
            }

            // Si el conjunto está vacío, se puede formar un círculo con todos los cables
            return endsSet.isEmpty();
        }

        public static void main(String[] args) {
            String[] connectors1 = {"HM"};
            String[] connectors2 = {"HH"};
            String[] connectors3 = {"HM", "MH"};
            String[] connectors4 = {"HM", "HH", "MM"};

            CableUSB cable1 = new CableUSB(connectors1);
            CableUSB cable2 = new CableUSB(connectors2);
            CableUSB cable3 = new CableUSB(connectors3);
            CableUSB cable4 = new CableUSB(connectors4);

            System.out.println(cable1.esPotConnectar()); // TRUE
            System.out.println(cable2.esPotConnectar()); // FALSE
            System.out.println(cable3.esPotConnectar()); // TRUE
            System.out.println(cable4.esPotConnectar()); // TRUE
        }
    }

}
