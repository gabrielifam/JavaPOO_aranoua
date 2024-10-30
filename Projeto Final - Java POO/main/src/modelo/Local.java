package modelo;

import java.util.ArrayList;
import java.util.List;

public class Local extends Localizacao implements Avaliavel {
    private String nome;
    private String endereco;
    private ZonaCidade zona;
    private List<Avaliacao> avaliacoes;

    public Local(String nome, String endereco, String cidade, String estado, String pais, ZonaCidade zona) {
        super(cidade, estado, pais);
        this.nome = nome;
        this.endereco = endereco;
        this.zona = zona;
        this.avaliacoes = new ArrayList<>();
        zona.adicionarLocal(this);
    }

    public ZonaCidade getZona() {
        return zona;
    }

    @Override
    public void avaliar(int estrelas, String comentario) {
        Avaliacao avaliacao = new Avaliacao(estrelas, comentario);
        avaliacoes.add(avaliacao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Local: " + nome + "\nEndereço: " + endereco);
        System.out.println("Cidade: " + cidade + ", Estado: " + estado + ", País: " + pais);
        System.out.println("Zona da Cidade: " + zona.getZona());
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}
