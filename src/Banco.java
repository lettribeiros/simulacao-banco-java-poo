import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nomeBanco;
    private List<Conta> listaContas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        listaContas = new ArrayList<Conta>();
    }

    public void adicionarContaBanco(Conta conta){
        listaContas.add(conta);
    }

    public void listarContas(){
        if(listaContas.isEmpty()){
            System.out.println("Não existem contas nesse banco.");
        } else {
            System.out.println(this.listaContas);
        }
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    @Override
    public String toString() {
        return STR."Banco{listaContas=\{listaContas}\{'}'}";
    }
}
