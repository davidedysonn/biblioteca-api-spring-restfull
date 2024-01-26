package br.com.biblioteca.restfullwithspringcrudcompletopagination.models.enuns;

public enum TipoAturizacao {

    ALUNO("Aluno"),
    AGENTE_BIBLIOTECARIO("Agente Bibliotecário");
    private String displayName;

    TipoAturizacao(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "TipoAturizacao{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
