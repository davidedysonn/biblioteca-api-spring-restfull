package br.com.biblioteca.restfullwithspringcrudcompletopagination.models.enuns;

public enum Genero {
    ACAO("AÇÃO"),
    FICCAO("FICÇÃO"),
    FANTASIA("FANTASIA"),
    ROMANCE("ROMANCE"),
    FICCAO_JUVENIL("FICÇÃO JUVENIL"),
    FICCAO_HISTORICA("FICÇÃO HISTÓRICA"),
    AVENTURA("AVENTURA"),
    TRAGEDIA("TRAGÉDIA");

    private String displayName;

    Genero(String displayName) {
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
        return "Genero{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
