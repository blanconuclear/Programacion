import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

          String nome="";
        String apelido="";
        String contrasinal="";
        String nomeMaisLongo="";

    
        while (!nome.equals("rui")&& !apelido.equals("silva")&& !contrasinal.equals("abc123.")) {
            System.out.println("Dime un nome: ");
           nome=sc.nextLine();
            
            System.out.println("Dime un apelido: ");
            apelido=sc.nextLine();

            System.out.println("Dime un contrasinal: ");
           contrasinal=sc.nextLine();


                //Pasar a maiusculas.
                String nomeCompleto=nome.concat(" ").concat(apelido);

                String [] palabras=nomeCompleto.split(" ");

                StringBuilder resultado= new StringBuilder();

                for (String palabra : palabras) {
                    resultado.append(palabra.substring(0,1).toUpperCase()).append(palabra.substring(1)).append(" ");
                }

                String resultadoMaisculas=resultado.toString().trim();
            

                //letra e por a.
                String intermedia=resultadoMaisculas.replace("a", "+").replace("e", "*").replace("+", "e").replace("*", "a");


                System.out.println("Moi boas "+resultadoMaisculas+" con contrasinal: "+contrasinal+" !!!!!!");
                System.out.println("Para os amigos eres: "+intermedia+" jejeje");

                

                if(nome.length()>nomeMaisLongo.length()){
                    nomeMaisLongo=nome;
                }
              
            }
                System.out.println("O nome mais longo de todos os introducidos foi: "+ nomeMaisLongo);

                sc.close();
        }
  
    }
