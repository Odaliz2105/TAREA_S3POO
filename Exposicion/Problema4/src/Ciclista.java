import java.util.Scanner;

public class Ciclista {
    String nombre;
    int edad;
    double kmsRecorridos;

    // Constructor
    public Ciclista(String nombre, int edad, double kmsRecorridos) {
        this.nombre = nombre;
        this.edad = edad;
        this.kmsRecorridos = kmsRecorridos;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre del ciclista: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Kilómetros recorridos: " + kmsRecorridos + " km");
    }

    public void actualizarKilometros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los nuevos kilómetros recorridos por " + nombre + ": ");
        double nuevosKms = scanner.nextDouble();
        this.kmsRecorridos += nuevosKms;
        System.out.println("-- Kilómetros actualizados --");
        System.out.println("Total de kilómetros ahora: " + kmsRecorridos + " km");
    }

    public void calcularPromedioMensual() {
        double promedio = kmsRecorridos / 12;
        System.out.println("Promedio mensual de kilómetros de " + nombre + ": " + promedio + " km/mes");
    }
}
