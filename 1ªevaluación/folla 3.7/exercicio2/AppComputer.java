package exercicio2;

/**
 * AppComputer
 */
public class AppComputer {

    public static void main(String[] args) {

        Portatil portatil1 = new Portatil("coreI7", "corsair200",
                "SSD1T", "Atx", 2, "prata");
        Portatil portatil2 = new Portatil(null, null,
                null, null, 0, null);

        Sobremesa sobremesa1 = new Sobremesa("M1", "md",
                "SD2T", "atx");
        Sobremesa sobremesa2 = new Sobremesa(null, null,
                null, null);

        System.out.println("********PORTATIL*********");
        portatil1.listaAtributos();
        System.out.println("********SOBREMESA*********");
        sobremesa1.listaAtributos();

    }
}