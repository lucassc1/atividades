public class Main {
    public static void main(String[] args) {
        // Relatório padrão (apenas com título e corpo)
        Relatorio relatorioPadrao = new RelatorioBuilder()
                .setTitulo("Relatório Padrão")
                .setCorpo("Este é o corpo do relatório padrão.")
                .build();
        System.out.println(relatorioPadrao);

        // Relatório completo (com título, corpo e rodapé)
        Relatorio relatorioCompleto = new RelatorioBuilder()
                .setTitulo("Relatório Completo")
                .setCorpo("Este é o corpo do relatório completo.")
                .setRodape("Rodapé do relatório completo.")
                .build();
        System.out.println(relatorioCompleto);
    }
}

class Relatorio {
    private String titulo;
    private String corpo;
    private String rodape;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return "Relatório:\n" +
                "  Título: " + titulo + "\n" +
                "  Corpo: " + corpo + "\n" +
                (rodape != null ? "  Rodapé: " + rodape : "");
    }
}

class RelatorioBuilder {
    private Relatorio relatorio;

    public RelatorioBuilder() {
        relatorio = new Relatorio();
    }

    public RelatorioBuilder setTitulo(String titulo) {
        relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuilder setCorpo(String corpo) {
        relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuilder setRodape(String rodape) {
        relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build() {
        return relatorio;
    }
}
