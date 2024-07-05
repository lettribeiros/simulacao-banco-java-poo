

public class Main {
    public static void main(String[] args) {

        Banco bancoSantander = new Banco("Santander");
        Banco bancoBrasil = new Banco("Brasil");
        Cliente cliente1 = new Cliente("Maria", "056457897");
        Cliente cliente2 = new Cliente("José", "56467487");

        Conta contaCorrenteMaria = new ContaCorrente(cliente1, bancoSantander);
        Conta contaPoupancaMaria = new ContaPoupanca(cliente1, bancoBrasil);
        Conta contaPoupancaJose = new ContaPoupanca(cliente2, bancoSantander);

        contaPoupancaJose.depositar(500);
        contaPoupancaMaria.depositar(100);
        contaPoupancaJose.transferir(50, contaCorrenteMaria);

        contaCorrenteMaria.imprimirInfos();
        contaPoupancaMaria.imprimirInfos();
        contaPoupancaJose.imprimirInfos();

        bancoSantander.listarContas();
        bancoBrasil.listarContas();
    }
}