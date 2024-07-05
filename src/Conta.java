public abstract class Conta{
    private static int NUMERO_CONTA_SEQUENCIAL = 1;
    private static final int AGENCIA = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA;
        this.numeroConta = NUMERO_CONTA_SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        banco.adicionarContaBanco(this);
    }

    public void depositar(int valorDeposito){
        saldo += valorDeposito;
    }

    public void sacar(int valorSaque){

        if (valorSaque <= saldo){
            saldo -= valorSaque;
        } else {
            System.out.println("Operação não realizada, saldo insuficiente para saque!");
        }

    }

    public void transferir(int valorTransferir, Conta contaDestino){

        if (valorTransferir <= saldo){
            sacar(valorTransferir);
            contaDestino.depositar(valorTransferir);
        } else {
            System.out.println("Operação não realizada, saldo insuficiente para transferência!");
        }
    }

    protected void imprimirInfos(){
        System.out.println(String.format("Banco: %s", this.banco.getNomeBanco()));
        System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
        System.out.println(String.format("CPF do Titular: %s", this.cliente.getCpfCliente()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
