package exercicio3;

/**
 * AppPlaneta
 */
public class AppPlaneta {

    public static void main(String[] args) {

        PlanetaHabitable planetaHabitable = new PlanetaHabitable("Fión", 24, 1.5, false, 1000000, 0, 10);
        PlanetaHostil planetaHostil = new PlanetaHostil("Kaleva", 50, 0.4, false, true, true);
        PlanetaHabitable planetaHabitable2 = new PlanetaHabitable("Kaspita", 34, 700000, false, 500000, 10, 100);
        PlanetaHostil planetaHostil2 = new PlanetaHostil("Pomodoro", 80, 6.8, false, true, false);

        System.out.println(planetaHabitable.getNome());
        System.out.println(planetaHabitable.getTamaño());
        System.out.println(planetaHabitable.getDistanciaTerra());
        System.out.println(planetaHabitable.getTemperaturaMinima());
        System.out.println(planetaHabitable.getTemperaturaMaxima());

        planetaHabitable.setDistanciaTerra(2000000);
        planetaHabitable.setNome("Fiona");

        System.out.println("- - - - - - Novos datos - - - - - -  ");
        System.out.println(planetaHabitable.getNome());
        System.out.println(planetaHabitable.getTamaño());
        System.out.println(planetaHabitable.getDistanciaTerra());
        System.out.println(planetaHabitable.getTemperaturaMinima());
        System.out.println(planetaHabitable.getTemperaturaMaxima());

        System.out.println("_____PLANETA HOSTIL_____");
        System.out.println(planetaHostil.getNome());
        System.out.println(planetaHostil.getTamaño());
        System.out.println(planetaHostil.getDistanciaTerra());

        System.out.println("-------Novos planetas------");
        System.out.println();
        System.out.println("-----Planeta habitable------");
        System.out.println(planetaHabitable2.getNome());
        System.out.println(planetaHabitable2.getTamaño());
        System.out.println(planetaHabitable2.getDistanciaTerra());
        System.out.println(planetaHabitable2.getTemperaturaMinima());
        System.out.println(planetaHabitable2.getTemperaturaMaxima());

        System.out.println();
        System.out.println("-----Planeta hostil------");

        System.out.println(planetaHostil2.getNome());
        System.out.println(planetaHostil2.getTamaño());
        System.out.println(planetaHostil2.getDistanciaTerra());

        System.out.println("O total de planetas é: " + planetaHabitable.getNumPlanetasAccesibles());
        planetaHostil2.explotou();
        System.out.println("O total de planetas é: " + planetaHabitable.getNumPlanetasAccesibles());

        planetaHabitable.listaTodo();
        planetaHabitable2.listaTodo();
        planetaHostil.listaTodo();
        planetaHostil2.listaTodo();
    }
}