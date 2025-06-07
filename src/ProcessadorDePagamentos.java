import java.util.ArrayList;
import java.util.List;

public class ProcessadorDePagamentos {
    public static void main(String[] args) throws Exception {
        
        List<Transacao> transacoesGerais = new ArrayList<>(); // sintaxe para criação de um ArrayList, chamado de Coleção

        transacoesGerais.add(new Pix(12, "email")); // sintaxe para adicionar uma transação nova para o array transacoesGerais
        transacoesGerais.add(new Debito(5000, "143E5UY"));
        transacoesGerais.add(new Credito(1000, "RT45UH8", 12));
        
        for(Transacao transacao : transacoesGerais){ // Aqui a variável "transacao" é TEMPORÁRIA e será reutilizada em cada iteração do loop
            System.out.println("Transação: " + transacao.getClass());
            transacao.exibirDetalhes();
        };

    }
}
