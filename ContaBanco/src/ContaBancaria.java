class ContaBancaria {
    protected double saldo;
    protected double chequeEspecial;
    protected double dividaChequeEspecial = 0;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponível: R$ " + saldo);
        System.out.println("Dívida do cheque especial: R$ " + dividaChequeEspecial);
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque especial disponível: R$ " + chequeEspecial);
    }

    public void depositar(double valor) {
        if (dividaChequeEspecial > 0) {
            double taxa = dividaChequeEspecial * 0.2;
            double totalDivida = dividaChequeEspecial + taxa;
            if (valor >= totalDivida) {
                valor -= totalDivida;
                dividaChequeEspecial = 0;
                System.out.println("Dívida do cheque especial quitada com taxa de R$ " + taxa);
            } else {
                dividaChequeEspecial -= valor * 0.8;
                valor *= 0.2;
                System.out.println("Parte da dívida do cheque especial foi paga.");
            }
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
        } else if (valor <= saldo + chequeEspecial) {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
            dividaChequeEspecial += restante;
            System.out.println("Saque realizado usando cheque especial! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
    }
}