package exercicio2;

public class AppTraballador {
    public static void main(String[] args) {

        Conductor conductor1 = new Conductor("34523467A", "Carlos", "Lopes", "1624cer");
        Conductor conductor2 = new Conductor("77463728V", "María", "Rodriguez", "1644cee");
        Conductor conductor3 = new Conductor("55783475T", "Pepa", "Castro", "2546tyu");

        Electricista electricista1 = new Electricista("33746586T", "Rodrigo", "Fariña", false);
        Electricista electricista2 = new Electricista("55576834W", "Manuel", "Pena", true);

        conductor1.setDni("11111111A");
        conductor1.setNome("Carlos");
        conductor1.setApelido("Lopes");

        electricista1.setNome("Ana");
        electricista1.setApelido("Sánchez");
        electricista1.setDni("44332211H");

        System.out.println("O número total de traballadores é: " + Traballador.getNumTraballadores());

        System.out.println("O Electricista1 é: " + electricista1.tipoContrato());
        System.out.println("O Electricista2 é: " + electricista2.tipoContrato());

    }
}
