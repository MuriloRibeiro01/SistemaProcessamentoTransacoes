public class Pix extends Transacao {

    String chavePix;

    public Pix(double valorTransacao, String chavePix){
        super(valorTransacao);
        this.chavePix = chavePix;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("\n-------Detalhes-Pix-------");
        System.out.println("ID da Transação: " + getId() + "\n");
        System.out.println("Valor da Transação: " + this.valorTransacao + "\n");
        System.out.println("Data da Transação: " + getHora() + "\n");
        System.out.println("Status da Transação: " + getStatus() + "\n");
        System.out.println("Origem da Transação: " + this.chavePix);
    }

    @Override
    public void Processar(){
        setStatus("Aprovada");
        System.out.println("\nTransação aprovada!\n");
    }    

}