package modelo;

import interfaces.Avaliavel;
import java.util.ArrayList;
import java.util.List;

public class Local extends Lugar implements Avaliavel {
    private Localizacao localizacao;
    private List<Avaliacao> avaliacoes;

    public Local(String nome, String endereco, Localizacao localizacao) {
        super(nome, endereco);
        this.localizacao = localizacao;
        this.avaliacoes = new ArrayList<>();
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    @Override
    public void adicionarAvaliacao(int nota, String comentario) {
        avaliacoes.add(new Avaliacao(nota, comentario));
    }
}
