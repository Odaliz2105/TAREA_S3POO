//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Objetos
        Libro Libro1= new Libro("Don Quijote","Miguel Cervantes",1605);
        Libro Libro2= new Libro("Caperucita Roja", "Juanita Perez", 2000);

        //Mostrar Infromacion
        System.out.println("--- Información de los Libros---");
        Libro1.mostrarInformacion();
        Libro2.mostrarInformacion();

        //Actualizacion de año
        Libro1.establecerAnio();
        Libro2.establecerAnio();

        //Mostrar Nuevo Año
        System.out.println("--- Información Actualizada de los Libros ---");
        Libro1.mostrarInformacion();
        Libro2.mostrarInformacion();
    }
}