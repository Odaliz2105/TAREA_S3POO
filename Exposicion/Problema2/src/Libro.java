import java.util.Scanner;

public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    //Constructor
    public Libro(String titulo,String autor,int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }
    //Metodos
    public void mostrarInformacion(){
        System.out.println("El titulo del libro es: "+ titulo);
        System.out.println("El autor del libro es: "+ autor);
        System.out.println("El año de publicacion del libro es: "+ anioPublicacion);
    }

    public void establecerAnio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nuevo año del libro " + titulo + ": ");
        int nuevoAnio = scanner.nextInt();
        this.anioPublicacion=nuevoAnio;
        System.out.println("-- Año actualizado --");
        System.out.println("El nuevo año del libro " + titulo + " es: " + anioPublicacion);
    }
}
