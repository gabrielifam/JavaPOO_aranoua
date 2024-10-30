package modelo;

public abstract class Localizacao {
    protected String cidade;
    protected String estado;
    protected String pais;

    public Localizacao(String cidade, String estado, String pais) {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public abstract void exibirDetalhes();
}
