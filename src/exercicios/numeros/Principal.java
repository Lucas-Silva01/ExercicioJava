// Comando git para liberar o SSL: 
// git config --global http.sslbackend schannel

package exercicios.numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // int valor = 3;
        // if (valor % 2 == 0){
        // System.out.print("PAR");
        // }else{
        // System.out.print("IMPAR");
        // };
        Scanner scan = new Scanner(System.in);
        Numero numero = new Numero();

        // System.out.print("Digite um numero: ");
        // numero.valor = scan.nextInt();
        // System.out.println(numero.parImpar());

        // System.out.print("Digite o primeiro valor:");
        // int v1 = scan.nextInt();
        // System.out.print("Digite o segundo valor:");
        // int v2 = scan.nextInt();
        // System.out.println(numero.maiorValor(v1, v2));

        // System.out.print("Digite o primeiro valor:");
        // v1 = scan.nextInt();
        // System.out.print("Digite o segundo valor:");
        // v2 = scan.nextInt();
        // System.out.print("Digite o terceiro valor:");
        // int v3 = scan.nextInt();
        // System.out.println(numero.ordenarCrescente(v1, v2, v3));
        try {
            numero.valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero?"));
            JOptionPane.showMessageDialog(null, "O numero é " + numero.parImpar());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros!");
        }
    }
}
