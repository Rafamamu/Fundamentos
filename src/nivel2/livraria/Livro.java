package nivel2.livraria;

public class Livro {


    private String nome;
    private double preco;
    private String autor;
    private Status status;


    public Livro() {

    }

    public Livro(String nome,
                 double preco,
                 String autor,
                 Status status) {

        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
        this.status = status;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }
    public Status getStatus() {
        return status;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "Nome: "+nome+" "+
                "Preço: "+preco+" "+
                "Autor: "+autor+" "+
                "Status: "+status+" ";
    }
}
