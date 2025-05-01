//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Objetos
        Curso curso1=new Curso("Programación I", "INF101",5);

        //Mostrar la informaion
        System.out.println("--- Información Inicial del Curso ---");
        curso1.monstrarCurso();

        //Actualizacion de los creditos
        curso1.actualizarCreditos();

        //Informacion Actualizada
        System.out.println("--- Información Actualizada del Curso ---");
        curso1.monstrarCurso();
    }
}