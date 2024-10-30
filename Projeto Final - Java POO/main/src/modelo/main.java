package modelo;

public class main {
    public static void main(String[] args) {
        // Criação de zonas
        ZonaCidade zonaCentro = new ZonaCidade("Centro");

        // Criação de locais
        Local local1 = new Local("Biblioteca Central", "Av. Central, 123", "Manaus", "Amazonas", "Brasil", zonaCentro);
        Local local2 = new Local("Parque das Flores", "Rua das Flores, 456", "Manaus", "Amazonas", "Brasil", zonaCentro);

        // Gerenciamento de locais
        GerenciamentoLocais gerenciamento = new GerenciamentoLocais();
        gerenciamento.adicionarLocal(local1);
        gerenciamento.adicionarLocal(local2);

        // Avaliação dos locais
        local1.avaliar(5, "Excelente ambiente para estudo.");
        local2.avaliar(4, "Ótimo lugar para passeios.");

        // Exibição dos locais na zona "Centro"
        gerenciamento.listarLocaisPorZona("Centro");
    }
}
