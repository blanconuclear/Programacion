package exercicio1;

import java.security.cert.TrustAnchor;

/**
 * AppAlugueiroTurismos
 */
public class AppAlugueiroTurismos {

    public static void main(String[] args) {

        Turismo turismo1 = new Turismo("1111-BCD", false, null, 0, 0);
        Camion camion1 = new Camion("2222-BCD", false, 0, 0, 0);

        Turismo turismo2 = new Turismo("3333-BCD", false, null, 0, 0);
        Camion camion2 = new Camion("2222-BCD", false, 0, 0, 0);

        turismo1.setAlugado(true);
        turismo1.setKmAlquiler(1200);

        camion1.setAlugado(true);
        camion1.setDiaInicio(129);

        turismo1.alugar();

        turismo1.mostraInf();

        turismo1.setAlugado(false);
        turismo1.setKmDevolucion(14500);

        camion1.setAlugado(false);
        camion1.setDiaFinal(133);

        System.out.println(camion1.getDiaFinal() - camion1.getDiaInicio());

    }
}