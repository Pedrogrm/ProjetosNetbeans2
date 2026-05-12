package logica.desafio3;

//import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Pedro Murilo
 */
public class Desafio3 {

    public static void main(String[] args) {

        // Definindo status do whille
        boolean continuar = true;

        // Criamos o objeto 'op' a partir da classe OpMatematicas
        OpMatematicas op = new OpMatematicas();
        
        // Criando um icone
        URL urlImagem = OpMatematicas.class.getResource("/img/calculadora.png");
        ImageIcon icone = new ImageIcon(urlImagem);
        
        //configurações
        UIManager.put("OptionPane.background", Color.TRANSLUCENT);   
        UIManager.put("Panel.background", Color.darkGray);
        UIManager.put("OptionPane.messageForeground", Color.WHITE); 
        UIManager.put("Button.background", Color.TRANSLUCENT);
        UIManager.put("Button.foreground", Color.WHITE);


        // Chamada de método sem retorno/parâmetro
        op.mostrarBoasVindas();

        while (continuar) {

            try {
                //primeiro numero
                op.num1 = (String) JOptionPane.showInputDialog(
                    null,
                    "Digite o primeiro número:",
                    op.modelo,
                    JOptionPane.QUESTION_MESSAGE,
                    icone,
                    null,
                    null
                );
                op.n1 = Double.parseDouble(op.num1);

                //segundo numero
                op.num2 = (String) JOptionPane.showInputDialog(
                    null,
                    "Digite o segundo número: ",
                    op.modelo,
                    JOptionPane.QUESTION_MESSAGE,
                    icone,
                    null,
                    null
                );
                op.n2 = Double.parseDouble(op.num2);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "ERRO: Insira somente numeros",
                    op.modelo,
                    JOptionPane.ERROR_MESSAGE
                );
                continue;       
            }

            // exbindo 
            JOptionPane.showMessageDialog(
                    null,
                    op.resposta(op.n1, op.n2),
                    op.modelo,
                    JOptionPane.PLAIN_MESSAGE
            );

            // pergunta se gostaria de continuar rodando o programa
            String[] opção = {"Sim", "Não"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Deseja fazer outro calculo?",
                    "Pesquisa",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    icone,
                    opção,
                    opção[0]
            );
            switch (escolha) {
                case 0:
                    continuar = true;
                    break;

                case 1:
                    JOptionPane.showMessageDialog(
                            null,
                            "Encerrando...",
                            op.modelo,
                            JOptionPane.PLAIN_MESSAGE
                    );
                    continuar = false;
                    break;
            }
        }
    }
}