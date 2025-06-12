import java.time.LocalDateTime;

public abstract class Transacao {
    String nome;
    int idTransacao;
    public static int codigo = 0; //Criação de um contador simples (para ser um criador de ID de fato, deve haver local para armazenar o dado)
    double valorTransacao;
    String status; // Pendente; Paga; Rejeitada
    java.time.LocalDateTime dataHora;

    public Transacao(double valorTransacao){
        this.idTransacao = Transacao.codigo++;
        this.valorTransacao = valorTransacao;
        this.dataHora = LocalDateTime.now();
        this.status = "Pendente";
    }

    public abstract void Processar(); //Métodos abstratos NÃO TEM BLOCO DE CÓDIGO

    public abstract void exibirDetalhes(); //Método Abstrato NÃO TEM BLOCO DE CÓDIGO

    public void getValor(){ //Retornar o valor da transação
        System.out.println("Valor da Transição: " + valorTransacao);
    }

    public void getId(){ //Retorna o ID da transação
        System.out.println("ID da Transição: " + idTransacao);
    }

    public void getStatus(){ //Retorna o Status da transação
        System.out.println("Status: " + status);
    }

    public void getStatus(String status){ //Altera o Status da transação

    }

    public void getHora(){ //Retorna a data e horário da transação
        System.out.println("Horário da Transição: " + dataHora);
    }


}
