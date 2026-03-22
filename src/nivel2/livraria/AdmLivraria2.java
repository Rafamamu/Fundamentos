package nivel2.livraria;

import java.util.ArrayList;

public class AdmLivraria2 {


    private String loginAdm;
    private String senhaAdm;

    private ArrayList<Livro2> livrosCadastrados;
    private ArrayList<Usuario2> usuariosCadastrados;

    public AdmLivraria2() {
        this.livrosCadastrados = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }

    public AdmLivraria2(String loginAdm,
                        String senhaAdm) {

        this.loginAdm = loginAdm;
        this.senhaAdm = senhaAdm;
        this.livrosCadastrados = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }

    public String getLoginAdm() {
        return loginAdm;
    }
    public String getSenhaAdm() {
        return senhaAdm;
    }
    public ArrayList<Livro2> getLivrosCadastrados() {
        return  livrosCadastrados;
    }
    public ArrayList<Usuario2> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }
    public void setLivrosCadastrados(ArrayList<Livro2> livrosCadastrados) {
        this.livrosCadastrados = livrosCadastrados;
    }
    public void setUsuariosCadastrados(ArrayList<Usuario2> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }


    public void cadastrarLivro(Livro2 livro) {
        livrosCadastrados.add(livro);
    }

    public void cadastrarUsuario(Usuario2 usuario) {
        usuariosCadastrados.add(usuario);
    }

    public void listarLivros() {
        for (Livro2 livro : livrosCadastrados) {
            System.out.println("Livros cadastrados: "+livro);
        }
    }
}
