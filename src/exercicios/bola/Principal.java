package exercicios.bola;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        try {
            String novaCor = " ";
            while (!novaCor.equals("")) {
                // Entrada dados
                novaCor = JOptionPane.showInputDialog("Qual a cor?");
                if (!novaCor.equals("")) {
                    // Criação Objeto
                    Bola bolinha = new Bola();
                    bolinha.trocarCor(novaCor);
                    bolinha.trocarCircunferencia(
                            Double.parseDouble(JOptionPane.showInputDialog("Qual a circunferência?")));
                    bolinha.trocarMaterial(JOptionPane.showInputDialog("Qual a material?"));
                    // Saida dados
                    JOptionPane.showMessageDialog(null, ""
                            + "Cor: " + bolinha.mostrarCor() + "\n"
                            + "Circunferência: " + bolinha.mostrarCircunferencia() + "\n"
                            + "Material: " + bolinha.mostrarMaterial() + "\n");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}