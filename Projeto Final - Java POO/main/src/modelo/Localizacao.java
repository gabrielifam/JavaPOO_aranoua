package modelo;

public class Localizacao {
    private String cidade;
    private ZonaCidade zonaCidade;

    public Localizacao(String cidade, ZonaCidade zonaCidade) {
        this.cidade = cidade;
        this.zonaCidade = zonaCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public ZonaCidade getZonaCidade() {
        return zonaCidade;
    }
}
