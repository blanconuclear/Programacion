package persona;

public class AppPersoa {
    public static void main(String[] args) {
        Persoa persoa1 = new Persoa("Jose", "Rodriguez", 27);
        Persoa persoa2 = new Persoa("Efrén", "Corzón", 15);

        persoa1.imprimir();
        persoa1.maiorIdade();
        persoa1.autenticidade();
        System.out.println("-----------------");
        persoa2.imprimir();
        persoa2.maiorIdade();
        persoa2.autenticidade();

    }
}
