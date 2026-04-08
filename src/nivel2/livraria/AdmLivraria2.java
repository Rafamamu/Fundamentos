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
        return livrosCadastrados;
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

    public ArrayList<Livro2> listarLivros() {
        return livrosCadastrados;

    }

    public ArrayList<Usuario2> listarUsuarios() {
        return usuariosCadastrados;
    }

    public void deletarUsuario(Usuario2 usuario) {
        if (usuariosCadastrados.contains(usuario)) {
            usuariosCadastrados.remove(usuario);
        } else {

            throw new IllegalStateException("Usuário não encontrado! ");
        }
    }

    public void deletarLivro(Livro2 livro) {
        if (livrosCadastrados.contains(livro)) {
            livrosCadastrados.remove(livro);
        } else {

            throw new IllegalStateException("Livro não encontrado!");
        }

    }

    public void emprestarLivro(Usuario2 usuario, Livro2 livro) {
        if (livro.getStatus().estaDisponivel()) {
            livro.setStatus(Status2.EMPRESTADO);
            usuario.getLivrosEmprestados().add(livro);
        } else {

            throw new IllegalStateException("Livro indisponível! ");
        }
    }

    public void devolverLivro(Usuario2 usuario, Livro2 livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            livro.setStatus(Status2.DISPONIVEL);
            usuario.getLivrosEmprestados().remove(livro);
        } else {
            throw new IllegalStateException("Livro não encontrado! ");
        }
    }

    public Livro2 buscarLivroPorNome(String nome) {
        for (Livro2 livro : livrosCadastrados) {
            if (livro.getNome().equalsIgnoreCase(nome)) {

                return livro;

            }

        }

        throw new IllegalStateException("Livro não encontrado! ");
    }


    public Livro2 buscarLivroPorId(int id) {
        for (Livro2 livro : livrosCadastrados) {
            if (livro.getId() == id) {
                return livro;
            }


        }

        throw new IllegalStateException("Id não encontrado!");

    }

    public Usuario2 buscarUsuarioPorId(int id) {
        for (Usuario2 usuario : usuariosCadastrados) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        throw new IllegalStateException("Id de usuário não encontrado! ");
    }


    public boolean validacaoLoginSenha(String loginAdm, String senhaAdm) {
        return  this.loginAdm.equals(loginAdm) && this.senhaAdm.equals(senhaAdm);
    }

}
