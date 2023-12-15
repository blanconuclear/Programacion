package exercicio3;

public class AppCilindro {

    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(12, 3.4);
        Cilindro cilindro2 = new Cilindro(2, 5.5);
        Cilindro cilindro3 = new Cilindro();

        cilindro3.setAltura(4.6);
        cilindro3.setRadio(1.56);

        System.out.println("O radio do cilindo1 é: " + cilindro1.getRadio());
        System.out.println("A altura do cilindo1 é: " + cilindro1.getAltura());
        System.out.println("O radio do cilindo2 é: " + cilindro2.getRadio());
        System.out.println("A altura do cilindo2 é: " + cilindro2.getAltura());
        System.out.println("O radio do cilindo3 é: " + cilindro3.getRadio());
        System.out.println("A altura do cilindo3 é: " + cilindro3.getAltura());

        System.out.println("------------------------------");

        System.out.println("A area do cilindro1 é: " + cilindro1.calculaArea());
        System.out.println("A area do cilindro1 é: " + cilindro1.calculaArea());
        System.out.println("A area do cilindro2 é: " + cilindro2.calculaArea());
        System.out.println("A area do cilindro2 é: " + cilindro2.calculaArea());
        System.out.println("A area do cilindro3 é: " + cilindro3.calculaArea());
        System.out.println("A area do cilindro3 é: " + cilindro3.calculaArea());

        System.out.println("------------------------------");

        System.out.println("O volume do cilindro1 é: " + cilindro1.calculaVolume());
        System.out.println("O volume do cilindro1 é: " + cilindro1.calculaVolume());
        System.out.println("O volume do cilindro2 é: " + cilindro2.calculaVolume());
        System.out.println("O volume do cilindro2 é: " + cilindro2.calculaVolume());
        System.out.println("O volume do cilindro3 é: " + cilindro3.calculaVolume());
        System.out.println("O volume do cilindro3 é: " + cilindro3.calculaVolume());

    }

}