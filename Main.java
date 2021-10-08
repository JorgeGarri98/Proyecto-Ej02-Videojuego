package Videojuego;

/**
 * @author Jorge Garrido
 * @version 1.1
 * @since 08/10/2021
 */

public class Main {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero();
        g1.setNombre("Conan");
        Espada espada = new Espada();
        // Inyección de dependencia
        g1.setArma(espada);
        g1.atacar();
        
        Guerrero g2 = new Guerrero();
        g2.setNombre("Legolas");
        Arco arco = new Arco();
        // Inyección de dependencia
        g2.setArma(arco);
        g2.atacar(); 
    }
}
