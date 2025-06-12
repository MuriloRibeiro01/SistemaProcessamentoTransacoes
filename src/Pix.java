public class Pix extends Transacao {

    String chavePix;

    public Pix(double valorTransacao, String chavePix){
        super(valorTransacao);
        this.chavePix = chavePix;
    }

    @Override
    public void Processar(){
        status = "Aprovada";

        System.out.println("Transação: " + status + "!");
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\n-------Detalhes-Pix-------");
        System.out.println("ID da Transação: " + idTransacao + "\n");
        System.out.println("Valor da Transação: " + valorTransacao + "\n");
        System.out.println("Data da Transação: " + dataHora + "\n");
        System.out.println("Status da Transação: " + status + "\n");
        System.out.println("Origem da Transação: " + chavePix);
        System.out.println("--------------------------");
    }

}
