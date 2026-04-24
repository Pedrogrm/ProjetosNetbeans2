package logica.ex25;

import javax.swing.JOptionPane;


/**
 *
 * @author Pedro Murilo
 */
public class Ex25 {

    public static void main(String[] args) {
        
    String cidade = JOptionPane.showInputDialog(null, "Digite um nome de cidade");

        switch (cidade.toLowerCase()) {

            case "jundiai", "santos", "mauá", "diadema" -> JOptionPane.showMessageDialog(null, "É uma cidade de São Paulo"); 

            case "monte verde", "camanducaia", "pouso alegre" -> JOptionPane.showMessageDialog(null, "É uma cidade de Minas Gerais");

            default -> JOptionPane.showMessageDialog(null, "É uma cidade não listada no programa"); 
        }  
    }
}
