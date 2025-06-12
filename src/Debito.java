public class Debito extends Transacao{
    String numeroCartao;

    public Debito(double valorTransacao, String numeroCartao){
        super(valorTransacao);
        this.numeroCartao = numeroCartao;        
        
    }

    @Override
    public void Processar(){
        if(valorTransacao > 1000.0){
            status = "Aprovada";
        } else {
            status = "Rejeitada";
        }

        System.out.println("Status da Transação: " + status);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\n-------Detalhes-Débito-------");
        System.out.println("ID da Transação: " + idTransacao + "\n");
        System.out.println("Valor da Transação: " + valorTransacao + "\n");
        System.out.println("Data da Transação: " + dataHora + "\n");
        System.out.println("Status da Transação: " + status + "\n");
        System.out.println("Origem da Transação: " + numeroCartao + "\n");
        System.out.println("-----------------------------");
    }

}
