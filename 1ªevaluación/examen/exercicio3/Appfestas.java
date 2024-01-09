package exercicio3;

/**
 * Appfestas
 */
public class Appfestas {

    public static void main(String[] args) {
        FestaGastronomica festaGastronomica1=new FestaGastronomica("Santiago", 23, "xamon", 500);
        FestaGastronomica festaGastronomica2=new FestaGastronomica("Lestedo", 4, "paleta", 1705);

        Festival festival1=new Festival("Monte do Gozo", 3, "Radiohead", true);
        Festival festival2=new Festival("Tui", 25, "Placebo", false);
        Festival festival3=new Festival("Pontevedra", 11, "Oasis", true);


        System.out.println("**** festas Gastronónicas ****");

        System.out.println("Lugar festagrato1: "+ festaGastronomica1.getLugar()+" Día: "+festaGastronomica1.getDia()+" Producto sorteo: "+festaGastronomica1.getProductoSorteo()+" Presuposto: "+festaGastronomica1.getPresuposto());
        System.out.println("Lugar festagrato2: "+ festaGastronomica1.getLugar()+" Día: "+festaGastronomica1.getDia()+" Producto sorteo: "+festaGastronomica2.getProductoSorteo()+" Presuposto: "+festaGastronomica2.getPresuposto());

        festaGastronomica1.setDia(29);

        System.out.println("Lugar festagrato1: "+ festaGastronomica1.getLugar()+" Día: "+festaGastronomica1.getDia()+" Producto sorteo: "+festaGastronomica1.getProductoSorteo()+" Presuposto: "+festaGastronomica1.getPresuposto());

        festaGastronomica1.dobrapresuposto();

        System.out.println("**** Festivais ****");


        festival1.listaTodo();
        festival2.listaTodo();
        festival3.listaTodo();


        System.out.println("**** Número de Festivais ****");


        System.out.println("O número de festivais en agosto é: " + Festival.getNumFestivais());

       
        System.out.println(FestaGastronomica.comparaGastroMaiorPrsuposto(festaGastronomica1, festaGastronomica2));

    }
}