import java.util.Scanner;

class Cliente {
    private String nome;
    private ContaBancaria conta;

    public Cliente(String nome, double depositoInicial) {
        this.nome = nome;
        this.conta = new ContaBancaria(depositoInicial);
    }

    public String getNome() {
        return nome;
    }

    public ContaBancaria getConta() {
        return conta;
    }
}
