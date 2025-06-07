public class Debito extends Transacao{
    String numeroCartao;

    public Debito(double valorTransacao, String numeroCartao){
        super(valorTransacao);
        this.numeroCartao = numeroCartao;        
        
    }

    @Override
    public void Processar(){
        super.Processar();
        if(valorTransacao > 1000.0){
            status = "Aprovada";
        } else {
            status = "Rejeitada";
        }

        System.out.println("Status da Transação: " + status);
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("ID da Transação: " + idTransacao);
        System.out.println("Valor da Transação: " + valorTransacao);
        System.out.println("Data da Transação: " + dataHora);
        System.out.println("Status da Transação: " + status);
        System.out.println("Origem da Transação: " + numeroCartao);
    }

}
