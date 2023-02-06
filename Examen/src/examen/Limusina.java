package examen;

/**
 * @author Macarena Cardozo.
 */
public class Limusina {

    private Enum LimuTamanio;
    private boolean bebidas;
    private int cantidad;

    public Limusina(boolean bebidas, int cantidad) {
        this.bebidas = bebidas;
        this.cantidad = cantidad;
    }

    public Enum getLimuTamanio() {
        return LimuTamanio;
    }

    public void setLimuTamanio(Enum LimuTamanio) {
        this.LimuTamanio = LimuTamanio;
    }

    public boolean isBebidas() {
        return bebidas;
    }

    public void setBebidas(boolean bebidas) {
        this.bebidas = bebidas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
