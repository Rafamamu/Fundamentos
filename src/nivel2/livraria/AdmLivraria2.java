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

    public void listarUsuarios() {
        for (Usuario2 usuario : usuariosCadastrados) {
            System.out.println("Usuários cadastrados: "+usuario);
        }
    }

    public void deletarUsuario(Usuario2 usuario) {
        if (usuariosCadastrados.contains(usuario)) {
            usuariosCadastrados.remove(usuario);
        } else {
            System.out.println("Usuário não existe! ");
        }
    }

    public void deletarLivro(Livro2 livro) {
        if (livrosCadastrados.contains(livro)) {
            livrosCadastrados.remove(livro);
        }else {
            System.out.println("Livro não encontrado! ");
        }

    }

    public void emprestarLivro(Usuario2 usuario, Livro2 livro ) {
        if (livro.getStatus().estaDisponivel()) {
            livro.setStatus(Status2.EMPRESTADO);
            usuario.getLivrosEmprestados().add(livro);
        }else {

            throw  new IllegalStateException("Livro indisponível! ");
        }
    }
}
