package nivel2.livraria;

import java.time.LocalDate;

public class Livro2 {


    private String nome;
    private double preco;
    private String autor;
    private LocalDate dataEmprestimo;
    private Status2 status;


    public Livro2() {

    }

    public Livro2(String nome,
                  double preco,
                  String autor,
                  LocalDate dataEmprestimo,
                  Status2 status) {

        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
        this.dataEmprestimo = dataEmprestimo;
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
    public LocalDate getDataemprestimo() {
        return dataEmprestimo;
    }
    public Status2 getStatus() {
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
    public void setDataemprestimo(LocalDate dataemprestimo) {
        this.dataEmprestimo = dataemprestimo;
    }
    public void setStatus(Status2 status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "Nome: "+nome+" "+
                "Preço: "+preco+" "+
                "Autor: "+autor+" "+
                "Data de Empréstimo: "+dataEmprestimo+" "+
                "Status: "+status+" ";
    }
}
