package exercicio3;

/**
 * Festival
 */
public class Festival extends Festa{

    private String bandaPrincipal;
    private boolean zonaAcampada;
    private static int numFestivais=0;
 
    public Festival(String lugar, int dia, String bandaPrincipal, boolean zonaAcampada) {
        super(lugar, dia);
        this.bandaPrincipal = bandaPrincipal;
        this.zonaAcampada = zonaAcampada;
        numFestivais++;
    }

    public String getBandaPrincipal() {
        return bandaPrincipal;
    }

    public void setBandaPrincipal(String bandaPrincipal) {
        this.bandaPrincipal = bandaPrincipal;
    }

    public boolean isZonaAcampada() {
        return zonaAcampada;
    }

    public void setZonaAcampada(boolean zonaAcampada) {
        this.zonaAcampada = zonaAcampada;
    }

    public static int getNumFestivais() {
        return numFestivais;
    }

    public static void setNumFestivais(int numFestivais) {
        Festival.numFestivais = numFestivais;
    }

     public void listaTodo(){
        System.out.println("O lugar será: "+ this.bandaPrincipal);
        if(zonaAcampada==true){
            System.out.println("Terá zona de acampada");
        }else{
            System.out.println("Non terá zona de acampada.");
        }
    }



  
}