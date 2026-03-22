package nivel2.livraria;

public enum Status2 {

    DISPONIVEL("Este livro está disponível."),
    INDISPONIVEL("Desculpe ,este livro está indisponível no momento."),
    EMPRESTADO("Este livro está emprestado.");

    private String message;

    Status2(String message) {
        this.message = message;
    }

    public boolean estaDisponível() {
        return this == DISPONIVEL;
    }
}
