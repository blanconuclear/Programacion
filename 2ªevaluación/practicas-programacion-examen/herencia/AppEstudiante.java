package herencia;

public class AppEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(null, 0, 0, null);

        estudiante1.setNome("Efrén");
        estudiante1.setEdad(33);
        estudiante1.setNomCarreira("matemáticas");
        estudiante1.setNumEstudiante(1);

        System.out.println(estudiante1.getNome());
        System.out.println(estudiante1.getEdad());
        System.out.println(estudiante1.getNomCarreira());
        System.out.println(estudiante1.getNumEstudiante());

        System.out.println();

        System.out.println(estudiante1.toString());
    }
}
