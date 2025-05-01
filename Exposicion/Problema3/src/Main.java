public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel Messi", 10, "Delantero");

        System.out.println("--- Información Inicial del Jugador ---");
        jugador1.mostrarInformacion();

        jugador1.actualizarPosicion();

        System.out.println("--- Información Actualizada del Jugador ---");
        jugador1.mostrarInformacion();
    }
}
