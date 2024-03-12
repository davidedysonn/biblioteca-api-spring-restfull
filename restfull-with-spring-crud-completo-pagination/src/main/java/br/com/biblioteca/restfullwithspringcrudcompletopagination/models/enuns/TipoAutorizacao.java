package br.com.biblioteca.restfullwithspringcrudcompletopagination.models.enuns;

public enum TipoAutorizacao {

    ALUNO("Aluno"),
    PROFESSOR("Professor"),
    BIBLIOTECARIO("Bibliotecário");
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
