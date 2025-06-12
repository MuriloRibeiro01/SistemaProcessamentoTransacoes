import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Transacao {
    protected String nome;
    protected String idTransacao;
    public static int codigo = 0; //Criação de um contador simples (para ser um criador de ID de fato, deve haver local para armazenar o dado)
    protected double valorTransacao;
    protected String status; // Pendente; Paga; Rejeitada
    protected java.time.LocalDateTime dataHora;

    public Transacao(double valorTransacao){
        this.idTransacao = UUID.randomUUID().toString();
        this.valorTransacao = valorTransacao;
        this.dataHora = LocalDateTime.now();
        this.status = "Pendente";
    }

    public abstract void Processar(); //Métodos abstratos NÃO TEM BLOCO DE CÓDIGO

    public abstract void exibirDetalhes(); //Método Abstrato NÃO TEM BLOCO DE CÓDIGO

    public void getValor(){ //Retornar o valor da transação
        System.out.println("Valor da Transição: " + valorTransacao);
    }

    public String getId(){ //Retorna o ID da transação
        return idTransacao;
    }

    public String getStatus(){ //Retorna o Status da transação
        return status;
    }

    public void setStatus(String status){ //Altera o Status da transação
        this.status = status; // Atribui o valor do parâmetro ao atributo 'status' da instância
    }

    public java.time.LocalDateTime getHora(){ //Retorna a data e horário da transação
        return dataHora;
    }

}
