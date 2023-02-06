package examen;

/**
 * @author Macarena Cardozo.
 */
public class Gimnasio {

    private int cantidadMaquinas;
    private int cantidadEntrenadores;

    public Gimnasio(int cantidadMaquinas, int cantidadEntrenadores) {
        this.cantidadMaquinas = cantidadMaquinas;
        this.cantidadEntrenadores = cantidadEntrenadores;
    }

    public int getCantidadMaquinas() {
        return cantidadMaquinas;
    }

    public void setCantidadMaquinas(int cantidadMaquinas) {
        this.cantidadMaquinas = cantidadMaquinas;
    }

    public int getCantidadEntrenadores() {
        return cantidadEntrenadores;
    }

    public void setCantidadEntrenadores(int cantidadEntrenadores) {
        this.cantidadEntrenadores = cantidadEntrenadores;
    }

}
