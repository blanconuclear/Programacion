package exercicio4;

public class AppParcela {

    public static void main(String[] args) {

        Parcela parcela1 = new Parcela("Parcela de Linda", 2.3, 3.5);
        Parcela parcela2 = new Parcela("Parcela de Fina", 1.3, 3.2);
        Parcela parcela3 = new Parcela("Parcela Dormidera", 2.9, 23);
        Parcela parcela4 = new Parcela("Parcela de Paca", 5, 4.09);
        Parcela parcela5 = new Parcela("Parcela de Limpa", 11.7, 3);

        Parcela parcelaMaior1 = Parcela.calculaMaiorArea2(parcela1, parcela2);
        Parcela parcelaMaior2 = Parcela.calculaMaiorArea2(parcela3, parcela4);
        System.out.println("------------------------------");
        System.out.println("A area da parcela1 é: " + parcela1.area());
        System.out.println("A area da parcela2 é: " + parcela2.area());
        System.out.println("A area da parcela3 é: " + parcela3.area());
        System.out.println("A area da parcela4 é: " + parcela4.area());
        System.out.println("A area da parcela5 é: " + parcela5.area());
        System.out.println("------------------------------");
        System.out.println(parcelaMaior1.getNome() + " é a máis grande");

        System.out.println(parcelaMaior2.getNome() + " é a máis grande");

    }
}