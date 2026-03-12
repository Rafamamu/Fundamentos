package nivel1.livraria;

public enum Status {


    EMPRESTADO("Este livro está emprestado"),
    DISPONIVEL("Este livro está disponível");

    private String mensagem;

    Status(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public boolean podeEmprestar() {
        return this == DISPONIVEL;
    }
}
