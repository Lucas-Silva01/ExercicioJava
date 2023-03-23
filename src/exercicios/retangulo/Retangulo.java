package exercicios.retangulo;

public class Retangulo {
    /*
     * Classe Retangulo:
     * Crie uma classe que modele um retangulo:
     * a. Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a
     * escolher);
     * b. Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e
     * calcular Perímetro;
     * c. Crie um programa que utilize esta classe. Ele deve pedir ao usuário que
     * informe as medidas de um local. Depois, deve criar um objeto com as medidas e
     * calcular a quantidade de pisos e de rodapés necessárias para o local.
     */

    private double ladoA;
    private double ladoB;

    public void setLadoA(double lado) {
        this.ladoA = lado;
    }

    public double getLadoA() {
        return this.ladoA;
    }

    public void setLadoB(double lado) {
        this.ladoB = lado;
    }

    public double getLadoB() {
        return this.ladoB;
    }

    public double calculoArea() {
        return ladoA * ladoB;
    }

}
