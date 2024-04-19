public class Combi extends Vehiculo {

    private int altura = 3;

    Combi(int cantMaximaDePasajeros) {
        super(cantMaximaDePasajeros);
    }

    Combi(int cantMaximaDePasajeros, int altura) {
        super(cantMaximaDePasajeros);
    }

    @Override
    public void subirPasajero(Pasajero unPasajero) {
        // cobrar con qr
        unPasajero.cobrarPasaje(10000);
        super.subirPasajero(unPasajero);
    }
}
