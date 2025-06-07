public class Credito extends Transacao{

    String numeroCartao;
    int parcelas;

    public Credito(double valorTransacao, String numeroCartao, int parcelas){
        super(valorTransacao);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void Processar(){
        super.Processar();
        if(valorTransacao > 5000.0 && parcelas < 12){
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
        System.out.println("Número de Parcelas: " + parcelas);
        System.out.println("Data da Transação: " + dataHora);
        System.out.println("Status da Transação: " + status);
        System.out.println("Origem da Transação: " + numeroCartao);
    }

}
