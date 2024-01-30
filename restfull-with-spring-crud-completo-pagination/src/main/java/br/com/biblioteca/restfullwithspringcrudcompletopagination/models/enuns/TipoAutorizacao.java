package br.com.biblioteca.restfullwithspringcrudcompletopagination.models.enuns;

public enum TipoAutorizacao {

    ALUNO("Aluno"),
    AGENTE_BIBLIOTECARIO("Agente Bibliotecário");
    private String displayName;

    TipoAutorizacao(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
