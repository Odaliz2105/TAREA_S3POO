import java.util.Scanner;

public class Curso {
    String nombre;
    String codigo;
    int creditos;


    //constructor
    public Curso(String nombre, String codigo, int creditos){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
    }
    //Metodos
    public void monstrarCurso(){
        System.out.println("Nombre del curso: " +nombre);
        System.out.println("Código: " +codigo);
        System.out.println("Número de créditos: " +creditos);
    }

    public void actualizarCreditos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nuevo número de créditos para el curso " + nombre + ": ");
        int nuevosCreditos = scanner.nextInt();
        this.creditos=nuevosCreditos;
        System.out.println("-- Créditos actualizados --");
        System.out.println("Los nuevos créditos para el curso " + nombre + " son: " + creditos);
        scanner.close();

    }

}
