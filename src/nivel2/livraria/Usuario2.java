package nivel2.livraria;

import java.util.ArrayList;

public class Usuario2 {


    private String nome;
    private String login;
    private String senha;

    private ArrayList<Livro2> livrosEmprestados;

    public Usuario2() {
        this.livrosEmprestados = new ArrayList<>();
    }

    public Usuario2(String nome,
                    String login,
                    String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.livrosEmprestados = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public ArrayList<Livro2> getLivrosEmprestados() {
        return livrosEmprestados;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setLivrosEmprestados(ArrayList<Livro2> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "Usuario2{" +
                "nome= '" + nome + '\'' +
                ", login= '" + login + '\'' +
                ", senha= '" + senha + '\'' +
                ", livrosEmprestados= " + livrosEmprestados +
                '}';
    }
}
