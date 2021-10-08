package Videojuego;

public class Curandero {
    private String nombre;
    private Arma arma;
    private int ataque;
    private int vida;
    private int sabiduria = 15;

    public Curandero(String nombre, Arma arma, int ataque, int vida) {
        this.nombre = nombre;
        this.arma = arma;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    public void atacar() {
        System.out.println("Esta atacando " + nombre + "!!");
        arma.usar();
    }
    
    /*if (arma != Rezo){
        sabiduria = 0;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int puntosVida) {
        this.vida = puntosVida;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    @Override
    public String toString() {
        return "Curandero{" + "nombre=" + nombre + ", arma=" + arma + ", ataque=" + ataque + ", vida=" + vida + ", sabiduria=" + sabiduria + '}';
    }
    
}
