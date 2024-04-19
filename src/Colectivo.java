public class Colectivo extends Vehiculo {
    private int estaEnServicio;

    Colectivo(int cantMaximaDePasajeros) {
        super(cantMaximaDePasajeros);
    }

    public int queLineaSos() {
        return 8;
    }

}
