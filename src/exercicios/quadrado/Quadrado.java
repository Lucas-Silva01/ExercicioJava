package exercicios.quadrado;

import java.io.ObjectStreamClass;

public class Quadrado {
    /*
     * Classe Quadrado: Crie uma classe que modele um quadrado:
     * a. Atributos: Tamanho do lado
     * b. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área
     */
    private float lado;

    public float getLado() {
        return this.lado;
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public float calcularArea() {
        return lado * lado;
    }

}
