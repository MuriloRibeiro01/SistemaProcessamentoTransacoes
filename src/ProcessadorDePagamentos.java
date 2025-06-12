import java.util.ArrayList;
import java.util.List;

public class ProcessadorDePagamentos {
    public static void main(String[] args) throws Exception {
        
        List<Transacao> transacoesGerais = new ArrayList<>(); // sintaxe para criação de um ArrayList, chamado de Coleção

        transacoesGerais.add(new Pix(12, "email")); // sintaxe para adicionar uma transação nova para o array transacoesGerais
        transacoesGerais.add(new Debito(5000, "143E5UY"));
        transacoesGerais.add(new Credito(1000, "RT45UH8", 12));
        
        for(Transacao transacao : transacoesGerais){ // Aqui a variável "transacao" é TEMPORÁRIA e será reutilizada em cada iteração do loop
            transacao.exibirDetalhes();
            transacao.Processar();
            System.out.println("-------------------------");
        };

        int contadorAprovadas = 0;
        int contadorRejeitadas = 0;

        for(Transacao t : transacoesGerais){
            if(t.getStatus().equals("Aprovada")){
                contadorAprovadas++;
            }else if(t.getStatus().equals("Rejeitada")){
                contadorRejeitadas++;
            }
        }

        System.out.println("Transações Aprovadas: " + contadorAprovadas);
        System.out.println("Transações Rejeitadas: " + contadorRejeitadas);

    }
}
