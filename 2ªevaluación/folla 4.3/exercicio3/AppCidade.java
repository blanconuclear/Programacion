package exercicio3;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 * AppCidade
 */
public class AppCidade {

    public static void main(String[] args) {

        Cidade[] arrayCidades = new Cidade[4];

        String nomeCidade;
        String poblacion;
        int poblacionInt;
        Cidade cid;

        for (int i = 0; i < arrayCidades.length; i++) {
            nomeCidade = JOptionPane.showInputDialog("Introduce a cidade: ");
            poblacion = JOptionPane.showInputDialog("Introduce a población: ");
            poblacionInt = Integer.parseInt(poblacion);
            cid = new Cidade(nomeCidade, poblacionInt);
            arrayCidades[i] = cid;
        }

        Arrays.sort(arrayCidades);

        for (Cidade cidade : arrayCidades) {
            System.out.println(cidade.getNome());
        }
    }
}
