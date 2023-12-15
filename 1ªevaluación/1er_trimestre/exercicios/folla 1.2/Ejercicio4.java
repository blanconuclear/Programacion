import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Capital de Francia?");
        String resposta1= sc.nextLine();
        int bote = 0;

        if(resposta1.equals("París")){
            bote += 500;
        };

        System.out.println("¿Capital de España?");
        String resposta2= sc.nextLine();
     

        if(resposta2.equals("Madrid")){
            bote += 500;
        };


        System.out.println("¿Capital de Portugal?");
        String resposta3= sc.nextLine();
      

        if(resposta3.equals("Lisboa")){
            bote += 500;
        };



        System.out.println(bote);

    }
}