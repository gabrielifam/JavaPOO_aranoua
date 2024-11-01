package testaAplicacao;

import modelo.Local;
import modelo.Localizacao;
import modelo.ZonaCidade;
import servico.GerenciamentoLocais;

public class main {
    public static void main(String[] args) {
        GerenciamentoLocais gerenciamento = new GerenciamentoLocais();

        // Exemplo 1: Museu da Amazônia
        Localizacao localizacao1 = new Localizacao("Manaus", ZonaCidade.CENTRO);
        Local local1 = new Local("Museu da Amazônia", "Av. Noel Nutels", localizacao1);
        local1.adicionarAvaliacao(5, "Excelente local para aprender sobre a Amazônia!");
        local1.adicionarAvaliacao(4, "Muito interessante, mas poderia ter mais guias.");

        // Exemplo 2: Parque Jefferson Péres
        Localizacao localizacao2 = new Localizacao("Manaus", ZonaCidade.SUL);
        Local local2 = new Local("Parque Jefferson Péres", "Rua 24 de Maio", localizacao2);
        local2.adicionarAvaliacao(4, "Ótimo lugar para relaxar e caminhar.");
        local2.adicionarAvaliacao(3, "Bom ambiente, mas precisa de mais segurança.");
        local2.adicionarAvaliacao(5, "Lindo parque, especialmente ao pôr do sol!");

        // Exemplo 3: Teatro Amazonas
        Localizacao localizacao3 = new Localizacao("Manaus", ZonaCidade.CENTRO);
        Local local3 = new Local("Teatro Amazonas", "Largo de São Sebastião", localizacao3);
        local3.adicionarAvaliacao(5, "Maravilhoso! Um dos pontos turísticos mais bonitos de Manaus.");
        local3.adicionarAvaliacao(4, "Muito bonito, mas um pouco caro para entrar.");
        local3.adicionarAvaliacao(5, "Experiência incrível, recomendo a todos!");

        // Exibindo avaliações para cada local de forma organizada
        System.out.println("========== Avaliações dos Locais ==========");
        gerenciamento.exibirAvaliacoes(local1);
        System.out.println("------------------------------------------");
        gerenciamento.exibirAvaliacoes(local2);
        System.out.println("------------------------------------------");
        gerenciamento.exibirAvaliacoes(local3);
        System.out.println("==========================================");
    }
}
