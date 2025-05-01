public class Main {
    public static void main(String[] args) {
        Ciclista ciclista1 = new Ciclista("Odaliz Balseca", 20, 20);
        Ciclista ciclista2 = new Ciclista("Elian Burbano", 21, 12);
        Ciclista ciclista3 = new Ciclista("Juan Perez", 32, 10);

        // Mostrar información inicial
        System.out.println("--- Información Inicial ---");
        ciclista1.mostrarInformacion();
        ciclista2.mostrarInformacion();
        ciclista3.mostrarInformacion();

        // Actualización de kilómetros
        ciclista1.actualizarKilometros();
        ciclista2.actualizarKilometros();
        ciclista3.actualizarKilometros();

        // Mostrar información actualizada
        System.out.println("--- Información Actualizada ---");
        ciclista1.mostrarInformacion();
        ciclista2.mostrarInformacion();
        ciclista3.mostrarInformacion();

        // Calcular promedio mensual
        System.out.println("--- Promedios Mensuales ---");
        ciclista1.calcularPromedioMensual();
        ciclista2.calcularPromedioMensual();
        ciclista3.calcularPromedioMensual();
    }
}
