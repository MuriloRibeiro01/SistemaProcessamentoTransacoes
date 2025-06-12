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
        if(valorTransacao > 5000.0 && parcelas < 12){
            status = "Aprovada";
        } else {
            status = "Rejeitada";
        }

        System.out.println("Status da Transação: " + status);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\n-------Detalhes-Crédito-------\n");
        System.out.println("ID da Transação: " + idTransacao + "\n");
        System.out.println("Valor da Transação: " + valorTransacao + "\n");
        System.out.println("Número de Parcelas: " + parcelas + "\n");
        System.out.println("Data da Transação: " + dataHora + "\n");
        System.out.println("Status da Transação: " + status + "\n");
        System.out.println("Origem da Transação: " + numeroCartao + "\n");
        System.out.println("------------------------------");
    }

}
