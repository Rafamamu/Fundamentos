package nivel1.livraria;

public class Livro {

    private String nome;
    private String autor;
    private Status status;



    public Livro() {

    }

    public Livro(String nome,
                 String autor,
                 Status status) {
        this.nome = nome;
        this.autor = autor;
        this.status = status;

    }

    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return  autor;
    }
    public Status getStatus() {
        return status;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "Nome: "+nome+"\n"+
                "Autor: "+autor+"\n"+
                "Status: "+status;

    }
}
