package exercicio1;

public class AppParticipante {
    public static void main(String[] args) {
        Xogador xogador1 = new Xogador("Andres", 24, "central");
        Xogador xogador2 = new Xogador("Manuel", 27, "porteiro");

        Arbitro arbitro1 = new Arbitro("Lorenzo", 45, 15);
        Arbitro arbitro2 = new Arbitro("José", 35, 10);

        System.out.println("O xogador1 chámase: " + xogador1.getNome() + " e ten: " + xogador1.getIdade()
                + " anos. E a sua posición no campo é: " + xogador1.getPostoCampo());
        System.out.println("O xogador2 chámase: " + xogador2.getNome() + " e ten: " + xogador2.getIdade()
                + " anos. E a sua posición no campo é: " + xogador2.getPostoCampo());

        System.out.println("O árbitro1 chámase " + arbitro1.getNome() + " e ten: " + arbitro1.getIdade()
                + " anos. E leva " + arbitro1.getAnosArbitrando() + " anos arbitrando.");

        System.out.println("O árbitro1 chámase " + arbitro2.getNome() + " e ten: " + arbitro2.getIdade()
                + " anos. E leva " + arbitro2.getAnosArbitrando() + " anos arbitrando.");

        System.out.println("-----------------------------------------");

        xogador1.setPostoCampo("medio");

        System.out.println("Agora o xogador1: " + xogador1.getNome() + " con " + xogador1.getIdade()
                + " anos. Cámbiase para a posición de: " + xogador1.getPostoCampo());

    }
}
