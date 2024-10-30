package modelo;

import java.util.ArrayList;
import java.util.List;

public class ZonaCidade {
    private String zona;
    private List<Local> locais;

    public ZonaCidade(String zona) {
        this.zona = zona;
        this.locais = new ArrayList<>();
    }

    public String getZona() {
        return zona;
    }

    public List<Local> getLocais() {
        return locais;
    }

    public void adicionarLocal(Local local) {
        locais.add(local);
    }
}
