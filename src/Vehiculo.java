public abstract class Vehiculo {

    Vehiculo(int cantMaximaDePasajeros) {
        this.cantMaximaDePasajeros = cantMaximaDePasajeros;
    }

    private int cantidadActualDePasajeros = 0;

    private int cantMaximaDePasajeros;

    public int cuantosPasajerosLlevas() {
        return cantidadActualDePasajeros;
    }

    public void subirPasajero(Pasajero unPasajero) {
        this.cantidadActualDePasajeros ++;
    }

    public boolean estaCompleto() {
        return cantidadActualDePasajeros >= cantMaximaDePasajeros;
    }


}
