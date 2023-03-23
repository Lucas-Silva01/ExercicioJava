package exercicios.ContaCorrente;
/* Classe Conta Corrente: Crie uma classe para implementar uma conta corrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os 
métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.*/
public class Conta {
    private int numero;
    private String nome;
    private float saldo;

    public Conta(int numero, String nome,float saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0.0f;
    }
    public void setNome(String nome ){
        this.nome = nome;
    }
    public void deposito(float valor){
        this.saldo += valor;
    }
    public void saque(float valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }
    public String toString() {
        return "Conta [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + "]";
        }
        public static void main(String[] args) {
            Conta j = new Conta(123, "Lucas S.", 2200.0f);
            System.out.println(j.toString());
            j.setNome("Lucas S.");
            j.deposito(1050);
            System.out.println(j.toString());
            j.saque(750);
            System.out.println(j.toString());
            }
    }

