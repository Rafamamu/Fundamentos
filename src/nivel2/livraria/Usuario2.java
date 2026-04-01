package nivel2.livraria;

import java.util.ArrayList;

public class Usuario2 {

    private static int contadorId;
    private int id;
    private String nome;


    private ArrayList<Livro2> livrosEmprestados;

    public Usuario2() {
        this.livrosEmprestados = new ArrayList<>();
    }

    public Usuario2(String nome) {
        this.id = ++contadorId;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Livro2> getLivrosEmprestados() {
        return livrosEmprestados;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivrosEmprestados(ArrayList<Livro2> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "Usuario2{" +
                " Id: "+id+
                "nome= '" + nome + '\'' +
                ",livrosEmprestados= " + livrosEmprestados +
                '}';
    }
}
