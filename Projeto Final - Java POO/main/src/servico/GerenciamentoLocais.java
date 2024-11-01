package servico;

import modelo.Local;
import modelo.Avaliacao;
import java.util.List;

public class GerenciamentoLocais {

    public void exibirAvaliacoes(Local local) {
        List<Avaliacao> avaliacoes = local.getAvaliacoes();

        System.out.println("Local: " + local.getNome());
        System.out.println("Endereço: " + local.getEndereco());
        System.out.println("Cidade: " + local.getLocalizacao().getCidade());
        System.out.println("Zona: " + local.getLocalizacao().getZonaCidade());
        System.out.println("Avaliações:");

        if (avaliacoes.isEmpty()) {
            System.out.println("  Nenhuma avaliação disponível.");
        } else {
            for (Avaliacao avaliacao : avaliacoes) {
                System.out.println("  - Nota: " + avaliacao.getNota() + " | Comentário: " + avaliacao.getComentario());
            }
        }
    }
}
