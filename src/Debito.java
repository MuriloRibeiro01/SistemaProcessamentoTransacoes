public class Debito extends Transacao{
    String numeroCartao;

    public Debito(double valorTransacao, String numeroCartao){
        super(valorTransacao);
        this.numeroCartao = numeroCartao;        
        
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\n-------Detalhes-Débito-------");
        System.out.println("ID da Transação: " + getId() + "\n");
        System.out.println("Valor da Transação: " + this.valorTransacao + "\n");
        System.out.println("Data da Transação: " + getHora() + "\n");
        System.out.println("Status da Transação: " + getStatus() + "...\n");
        System.out.println("Origem da Transação: " + this.numeroCartao + "\n");
        
    }

    @Override
    public void Processar(){
        if(this.valorTransacao > 1000.0){
            setStatus("Aprovada");
            System.out.println("\nTransação aprovada!\n");
        } else {
            setStatus("Rejeitada");
            System.out.println("\nTransação Rejeitada dada ao valor inferior ao requerido.\n");
        }
    }    

}