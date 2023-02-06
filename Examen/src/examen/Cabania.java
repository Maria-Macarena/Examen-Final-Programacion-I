package examen;

import java.util.Scanner;

/**
 * @author Macarena Cardozo.
 */
public class Cabania extends AlojamientoExtrahotelero {

    Scanner read = new Scanner(System.in);

    //ATRIBUTOS
    private int cantidadCamas;
    private boolean pileta;
    private double precio;

    //CONSTRUCTOR
    public Cabania() {
    }

    public Cabania(int cantidadCamas, boolean pileta, double precio) {
        this.cantidadCamas = cantidadCamas;
        this.pileta = pileta;
        this.precio = precio;
    }

    //GET Y SET
    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public boolean isPileta() {
        return pileta;
    }

    public void setPileta(boolean pileta) {
        this.pileta = pileta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //MÉTODOS 
    //METODO N°1
    public void crearCabania() {

        System.out.print("Cantidad de camas: ");
        cantidadCamas = read.nextInt();

        System.out.print("¿Tiene pileta? ");
        pileta = read.nextBoolean();

        System.out.print("TARIFA POR NOCHE: ");
        precio = read.nextDouble();

    }

    ////METODO N°2
    public void calcularPrecio() {

        int noches;
        double tarifa;
        System.out.print("Ingresa la cantidad de noches que desea "
                + "hospedarse: ");
        noches = read.nextInt();

        tarifa = noches * precio;

        System.out.println("");
        System.out.printf("EL PRECIO FINAL POR " + noches + " ES DE: $ %.2f", tarifa);

    }

    //METODO N°3
    public void mostrarDatos() {
        

        System.out.println("Contamos con " + cantidadCamas + " Camas. - ¿Tiene Pileta? " + pileta + ". - TARIFA POR NOCHE: $ " + precio + ".");

    }

}
