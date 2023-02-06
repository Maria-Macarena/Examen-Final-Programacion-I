package examen;

/**
 * @author Macrena Cardozo.
 */
public class HotelCincoEstrella extends HotelCuatroEstrella {

    //ATRIBUTOS
    private int cantidadSalonesCoferencia;
    private Limusina limu;

    //CONSTRUCTOR
    public HotelCincoEstrella(int cantidadSalonesCoferencia, int cantidadHabitaciones, int numerosCamas, int cantidadPisos, double precioHabitacion, int cantidadPiletas, int cantidadValet, int cantidadMaquinas, int cantidadEntrenadores, String nombre, int capacidad) {
        super(cantidadHabitaciones, numerosCamas, cantidadPisos, precioHabitacion, cantidadPiletas, cantidadValet, cantidadMaquinas, cantidadEntrenadores, nombre, capacidad);
        this.cantidadSalonesCoferencia = cantidadSalonesCoferencia;
    }

    //MÉTODO DE AGREGACIÓN
    public void agregarLimusina(Limusina aLimu) {
        limu = aLimu;
    }

    //GET Y SET
    public int getCantidadSalonesCoferencia() {
        return cantidadSalonesCoferencia;
    }

    public void setCantidadSalonesCoferencia(int cantidadSalonesCoferencia) {
        this.cantidadSalonesCoferencia = cantidadSalonesCoferencia;
    }

    public Limusina getLimu() {
        return limu;
    }

    public void setLimu(Limusina limu) {
        this.limu = limu;
    }

    //MÉTODO n°1
    @Override
    public void imprimirDatosHotel() {
        super.imprimirDatosHotel();
        System.out.println("Disponemos de: " + cantidadSalonesCoferencia + " Salones de conferencias" + ". ");
        System.out.println("Nuestro hotel cuenta con servicio de Limusina, tamaño: " + limu.getLimuTamanio()
                + ", capacidad para " + limu.getCantidad() + " personas. ¿La limusina Incluye "
                + "bebidas? " + limu.isBebidas());

    }

}
