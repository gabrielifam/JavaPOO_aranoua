package modelo;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoLocais {
    private List<Local> locais;

    public GerenciamentoLocais() {
        locais = new ArrayList<>();
    }

    public void adicionarLocal(Local local) {
        locais.add(local);
    }

    public void listarLocaisPorZona(String zona) {
        System.out.println("Locais na zona: " + zona);
        for (Local local : locais) {
            if (local.getZona().getZona().equals(zona)) {
                local.exibirDetalhes();
                System.out.println("Avaliações: ");
                for (Avaliacao avaliacao : local.getAvaliacoes()) {
                    System.out.println("Estrelas: " + avaliacao.getEstrelas() + " - " + avaliacao.getComentario());
                }
            }
        }
    }
}
