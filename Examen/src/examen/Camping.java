package examen;

import java.util.Scanner;

/**
 * @author Macarena Cardozo.
 */
public class Camping extends AlojamientoExtrahotelero {

    Scanner read = new Scanner(System.in);

    //ATRIBUTOS
    private int cantidadDuchas;
    private boolean aguaPotable;
    private double precio;

    //CONSTRUCTOR
    public Camping() {
    }

    //GET Y SET
    public int getCantidadDuchas() {
        return cantidadDuchas;
    }

    public void setCantidadDuchas(int cantidadDuchas) {
        this.cantidadDuchas = cantidadDuchas;
    }

    public boolean isAguaPotable() {
        return aguaPotable;
    }

    public void setAguaPotable(boolean aguaPotable) {
        this.aguaPotable = aguaPotable;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //METODOS
    //METODO N°1
    public void crearCamping() {

        System.out.print("Ingresá los datos del Camping ");

        System.out.print("Cantidad de duchas: ");
        cantidadDuchas = read.nextInt();

        System.out.print("¿Tiene agua potable? ");
        aguaPotable = read.nextBoolean();

        System.out.print("TSRIFA POR NOCHE: ");
        precio = read.nextDouble();

    }

    //METODO N°2
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
       

        System.out.println("Posee: " + cantidadDuchas + " Duchas. - ¿Tiene agua potable? " + aguaPotable
                + ". - TARIFA POR NOCHE: $" + precio + ".");

    }

}
