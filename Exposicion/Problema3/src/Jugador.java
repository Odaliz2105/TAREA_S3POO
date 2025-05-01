import java.util.Scanner;

public class Jugador {
    String nombre;
    int numero;
    String posicion;

    // Constructor
    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Posición: " + posicion);
    }

    public void actualizarPosicion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nueva posición para " + nombre + ": ");
        String nuevaPosicion = scanner.nextLine();
        this.posicion = nuevaPosicion;
        System.out.println("-- Posición actualizada --");
        System.out.println("Nueva posición de " + nombre + ": " + posicion);
    }
}
