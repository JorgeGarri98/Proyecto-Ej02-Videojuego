package Videojuego;

public abstract class Arma {
    public String nombre;
    public int danno;

    public abstract void usar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }
    
}
