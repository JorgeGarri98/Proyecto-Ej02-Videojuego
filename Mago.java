package Videojuego;

public class Mago {
    private String nombre;
    private Arma arma;
    private int ataque;
    private int vida;
    private int inteligencia = 15;

    public Mago(String nombre, Arma arma, int ataque, int vida) {
        this.nombre = nombre;
        this.arma = arma;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    public void atacar() {
        System.out.println("Esta atacando " + nombre + "!!");
        arma.usar();
    }

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

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Mago{" + "nombre=" + nombre + ", arma=" + arma + ", ataque=" + ataque + ", vida=" + vida + ", inteligencia=" + inteligencia + '}';
    }
    
}
