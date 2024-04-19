public class ColectivoElectrico extends Colectivo {
    ColectivoElectrico(int cantMaximaDePasajeros) {
        super(cantMaximaDePasajeros);
    }

    @Override
    public void subirPasajero(Pasajero unPasajero) {
        unPasajero.cobrarPasaje(10);
        super.subirPasajero(unPasajero);
    }
}
