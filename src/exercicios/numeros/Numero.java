package exercicios.numeros;

public class Numero {
    int valor;

    public String parImpar() {
        if (this.valor % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public String parImpar(int valor) {
        if (valor % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    // 7) Escreva um programa para ler 2 valores (considere que não serão informados
    // valores iguais) e escrever o maior deles.
    public int maiorValor(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        }
        return valor2;
    }

    // 10) Escreva um programa para ler 3 valores inteiros (considere que não serão
    // lidos valores iguais) e escrevê-los em ordem crescente.
    public String ordenarCrescente(int valor1, int valor2, int valor3) {
        // if(valor1 < valor2 && valor2 < valor3){
        // return valor1 + " - " + valor2 + " - " + valor3;
        // }
        // if(valor1 < valor3 && valor3 < valor2){
        // return valor1 + " - " + valor3 + " - " + valor2;
        // }
        // if(valor2 < valor1 && valor1 < valor3){
        // return valor2 + " - " + valor1 + " - " + valor3;
        // }
        // if(valor2 < valor3 && valor3 < valor1){
        // return valor2 + " - " + valor3 + " - " + valor1;
        // }
        // if(valor3 < valor1 && valor1 < valor2){
        // return valor3 + " - " + valor1 + " - " + valor2;
        // }
        // return valor3 + " - " + valor2 + " - " + valor1;

        int temp = 0;
        if (valor1 > valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor2 > valor3) {
            temp = valor3;
            valor3 = valor2;
            valor2 = temp;
        }

        if (valor1 > valor3) {
            temp = valor3;
            valor3 = valor1;
            valor1 = temp;
        }
        return valor1 + " - " + valor2 + " - " + valor3;
    }
}
