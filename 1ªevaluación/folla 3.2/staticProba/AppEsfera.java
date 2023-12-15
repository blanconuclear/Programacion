package staticProba;

public class AppEsfera {

    public static void main(String[] args) {
        Esfera esfera1 = new Esfera();
        Esfera esfera2 = new Esfera();

        System.out.println("Temos " + Esfera.numEsferas);

        System.out.println("O volume de esfera1 " + esfera1.getVolume());

        double radioMaior = Esfera.devolveRadioMaior(esfera1, esfera2);
        esfera1.setRadio(2.);
        System.out.println(radioMaior);
    }
}