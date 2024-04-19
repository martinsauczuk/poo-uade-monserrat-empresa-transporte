public class Main {
    public static void main(String[] args) {

        Pasajero pasajero1 = new Pasajero();
        Pasajero pasajero2 = new Pasajero();
        Pasajero pasajero3 = new Pasajero();

        Combi miCombi = new Combi(3);
        System.out.println( miCombi.cuantosPasajerosLlevas());
        System.out.println( miCombi.estaCompleto() );
        miCombi.subirPasajero(pasajero1);
        miCombi.subirPasajero(pasajero2);
        miCombi.subirPasajero(pasajero3);
        System.out.println( miCombi.cuantosPasajerosLlevas());
        System.out.println( miCombi.estaCompleto() );

//        Colectivo colectivo8a = new Colectivo(100);
        Vehiculo colectivo8b = new Colectivo(100);

        Vehiculo colectivoElectrico = new ColectivoElectrico(100);
        colectivoElectrico.subirPasajero(pasajero1);

        Combi unaCombiMuyAlta = new Combi(30, 10);

        Vehiculo vehiculo = new Vehiculo();
    }
}