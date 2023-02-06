package examen;

import java.util.Scanner;

/**
 * @author Macarena Cardozo.
 */
public class HotelCuatroEstrella {

    Scanner read = new Scanner(System.in);

//ATRIBUTOS
    protected int cantidadHabitaciones;
    protected int numerosCamas;
    protected int cantidadPisos;
    protected double precioHabitacion;
    protected int cantidadPiletas;
    protected int cantidadValet;
    protected Gimnasio gym;
    protected Restaurante resto;

    //CONSTRUCTOR
    public HotelCuatroEstrella(int cantidadMaquinas, int cantidadEntrenadores, String nombre, int capacidad, double precioHabitacion) {
        gym = new Gimnasio(cantidadMaquinas, cantidadEntrenadores);
        resto = new Restaurante(nombre, capacidad);
        this.precioHabitacion = precioHabitacion;
    }

    public HotelCuatroEstrella(int cantidadHabitaciones, int numerosCamas, int cantidadPisos, double precioHabitacion, int cantidadPiletas, int cantidadValet, int cantidadMaquinas, int cantidadEntrenadores, String nombre, int capacidad) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numerosCamas = numerosCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
        this.cantidadPiletas = cantidadPiletas;
        this.cantidadValet = cantidadValet;
        gym = new Gimnasio(cantidadMaquinas, cantidadEntrenadores);
        resto = new Restaurante(nombre, capacidad);
    }

    //GET Y SET
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumerosCamas() {
        return numerosCamas;
    }

    public void setNumerosCamas(int numerosCamas) {
        this.numerosCamas = numerosCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantidadPiletas() {
        return cantidadPiletas;
    }

    public void setCantidadPiletas(int cantidadPiletas) {
        this.cantidadPiletas = cantidadPiletas;
    }

    public int getCantidadValet() {
        return cantidadValet;
    }

    public void setCantidadValet(int cantidadValet) {
        this.cantidadValet = cantidadValet;
    }

    public Gimnasio getGym() {
        return gym;
    }

    public void setGym(Gimnasio gym) {
        this.gym = gym;
    }

    public Restaurante getResto() {
        return resto;
    }

    public void setResto(Restaurante resto) {
        this.resto = resto;
    }

    //MÉTODOS
    //METODO N°1
    public void crearHotel() {

        System.out.print(" Cantidad de Habitaciones: ");
        cantidadHabitaciones = read.nextInt();

        System.out.print(" Cantidad de Camas: ");
        numerosCamas = read.nextInt();

        System.out.print(" Número de Pisos: ");
        cantidadPisos = read.nextInt();

        System.out.print(" Cantidad de Valet: ");
        cantidadValet = read.nextInt();

        System.out.print(" Cantidad de Piletas: ");
        cantidadPiletas = read.nextInt();

    }

    //METODO N°2
    public void imprimirDatosHotel() {
        System.out.println("El hotel posee: " + cantidadPisos + " Pisos que cuenta con " + cantidadHabitaciones + " Habitaciones y "
                + + +numerosCamas + " Camas. " + cantidadValet + " Valets, " + cantidadPiletas + " Piletas. Y LA TARIFA "
                + "POR NOCHE ES DE $ " + precioHabitacion + ".");

        System.out.println("Tiene un gimnasio con: " + gym.getCantidadMaquinas() + " Máquinas para realizar ejercicios y " + gym.getCantidadEntrenadores()
                + " Entrenadores. ");

        System.out.println("Nuestro restaurante '" + resto.getNombre() + "' cuenta con una capacidad"
                + " de " + resto.getCapacidad() + " personas.");

    }

    //METODO N°3
    public void calcularTarifa() {

        int noches;
        double tarifa;
        System.out.print("Ingresa la cantidad de noches que desea "
                + "hospedarse: ");
        noches = read.nextInt();

        tarifa = noches * precioHabitacion;
        System.out.println("");
        System.out.printf("EL PRECIO FINAL POR " + noches + " ES DE: $ %.2f", tarifa);

    }

}
