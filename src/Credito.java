public class Credito extends Transacao{

    String numeroCartao;
    int parcelas;

    public Credito(double valorTransacao, String numeroCartao, int parcelas){
        super(valorTransacao);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\n-------Detalhes-Crédito-------\n");
        System.out.println("ID da Transação: " + getId() + "\n");
        System.out.println("Valor da Transação: " + this.valorTransacao + "\n");
        System.out.println("Número de Parcelas: " + this.parcelas + "\n");
        System.out.println("Data da Transação: " + getHora() + "\n");
        System.out.println("Status da Transação: " + getStatus() + "...\n");
        System.out.println("Origem da Transação: " + this.numeroCartao + "\n");
    }

    @Override
    public void Processar(){
        if(this.valorTransacao > 5000.0 && parcelas <= 12){
            setStatus("Aprovada");
            System.out.println("\nTransação aprovada!\n");
        } else if(parcelas > 12){
            setStatus("Rejeitada");
            System.out.println("\nTransação rejeitada dada a quantidade superior de parcelas.\n");
        } else if(this.valorTransacao < 5000.0){
            setStatus("Rejeitada");
            System.out.println("\nTransação rejeitada dado ao valor inferior ao requerido.\n");
        } else {
            System.out.println("\nErro.\n");
        }   

    }    

}