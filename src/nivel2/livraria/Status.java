package nivel2.livraria;

public enum Status {

    DISPONIVEL("Este livro está disponível."),
    INDISPONIVEL("Desculpe ,este livro está indisponível no momento."),
    EMPRESTADO("Este livro está emprestado.");

    private String message;

    Status(String message) {
        this.message = message;
    }

    public boolean estaDisponível() {
        return this == DISPONIVEL;
    }
}
