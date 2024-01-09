package exercicio3;

/**
 * FestaGastronomica
 */
public class FestaGastronomica extends Festa {

    private String productoSorteo;
    private double presuposto;

    
    public FestaGastronomica() {
    }
    public FestaGastronomica(String lugar, int dia, String productoSorteo, double presuposto) {
        super(lugar, dia);
        this.productoSorteo = productoSorteo;
        this.presuposto = presuposto;
    }

    public String getProductoSorteo() {
        return productoSorteo;
    }
    public void setProductoSorteo(String productoSorteo) {
        this.productoSorteo = productoSorteo;
    }
    public double getPresuposto() {
        return presuposto;
    }
    public void setPresuposto(double presuposto) {
        this.presuposto = presuposto;
    }

    public void dobrapresuposto(){
        double presupostoDobrado=this.presuposto*2;
        System.out.println("O presuposto de: "+this.presuposto+" .Foi dobrado a: "+ presupostoDobrado);
    }


    public static FestaGastronomica comparaGastroDiaAnterior( FestaGastronomica festaGastronomica1,FestaGastronomica festaGastronomica2){
        if(festaGastronomica1.getPresuposto()>festaGastronomica2.getPresuposto()){
            return -1;
        }
    }

    public static FestaGastronomica comparaGastroMaiorPrsuposto(FestaGastronomica festaGastronomica1,FestaGastronomica festaGastronomica2){
        if(festaGastronomica1.getPresuposto()>festaGastronomica2.getPresuposto()){
            return festaGastronomica1;
        }else{
            return festaGastronomica2;
        }
    }


    
   



}

