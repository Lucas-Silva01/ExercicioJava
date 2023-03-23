package exercicios.bola;

public class Bola {
    private String cor;
    private double circunferencia; // 10.5
    private String material;

    public void trocarCor(String cor) {
        if (!cor.equals("")) {
            this.cor = cor;
        }
    }

    public String mostrarCor() {
        return cor;
    }

    public void trocarCircunferencia(double circunferencia) {
        if (circunferencia >= 0) {
            this.circunferencia = circunferencia;
        }
    }

    public void trocarMaterial(String material) {
        this.material = material;
    }

    public double mostrarCircunferencia() {
        return circunferencia;
    }

    public String mostrarMaterial() {
        return material;
    }
}
