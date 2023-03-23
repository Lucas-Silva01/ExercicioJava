package exercicios.Pessoa;

public class Pessoa {
/* Classe Pessoa: Crie uma classe que modele uma pessoa:
a. Atributos: nome, idade, peso e altura
b. Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que
nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5
cm. */
private String nomedapessoa;
private int idade;
private float peso;
private double altura;
 public Pessoa(String nomedapessoa,int idade,float peso,double altura){
        
        this.nomedapessoa = nomedapessoa;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
 }     
    public void envelhecer(int anos) {
        this.idade += anos;
        if (this.idade < 21)
        crescer(0.05);
}
    public void engordar(float peso) {
        this.peso += peso;
    }
    
    public void emagrecer(float peso) {
        this.peso -= peso;
    }
    public void crescer(double crescer) {
        this.altura += crescer;

    }
    
    public String toString() {
        return "Pessoa [nome=" + nomedapessoa + ", idade=" + idade + ", peso=" + peso + ", altura=" + 
        altura + "]";
        }
        public static void main(String[] args) {
        Pessoa a = new Pessoa("Lucas S.", 14, 49, 1.65);
        System.out.println(a.toString());
        a.envelhecer(1);
        System.out.println(a.toString());
        a.envelhecer(1);
        System.out.println(a.toString());
        a.envelhecer(1);
        System.out.println(a.toString());
        a.envelhecer(1);
        System.out.println(a.toString());
        }
}