
public class Main {
    public static void main(String[] args) {
        Comparendor comparendo = new ComparendorImpl(); // Instanciar la implementación
        Vehiculo carro = new Carro();
        Vehiculo camion = new Camion();
        Vehiculo mula = new Mula();

        comparendo.construirFotoMulta(80, "CARRO");
        comparendo.construirFotoMulta(200, "MULA");
        comparendo.construirFotoMulta(40, "CAMION");
        comparendo.construirFotoMulta(40, "AVION");
    }
}