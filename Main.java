package Videojuego;

/**
 * @author Jorge Garrido
 * @version 1.1
 * @since 08/10/2021
 */

public class Main {
    public static void main(String[] args) {
        // Armas
        Espada espada = new Espada();
        Arco arco = new Arco();
        Hechizo hechizo = new Hechizo();
        Rezo rezo = new Rezo();
        
        // Primer personaje
        Guerrero g1 = new Guerrero("Aragorn", espada, 20, 100);
        System.out.println(g1);
        g1.atacar();
        
        System.out.println("----------------------------------------");
        
        // Segundo personaje
        Mago m1 = new Mago("Gandalf", hechizo, 30, 75);
        System.out.println(m1);
        m1.atacar();
    }
}
