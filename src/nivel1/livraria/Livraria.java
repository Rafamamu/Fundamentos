package nivel1.livraria;

import java.util.Arrays;

public class Livraria {

    private Livro[] livrosCadastrados;
    private Usuario[] usuariosCadastrados;

    public Livraria() {
        this.livrosCadastrados = new Livro[100];
        this.usuariosCadastrados = new Usuario[100];
    }


    public void cadastrarLivros(Livro livro) {
        for (int i = 0; i < livrosCadastrados.length; i++) {
            if (livrosCadastrados[i] == null) {
                livrosCadastrados[i] = livro;
                break;
            }
        }

    }

    public void cadastrarUsuario(Usuario usuario) {
        for (int i = 0; i < usuariosCadastrados.length; i++) {
            if (usuariosCadastrados[i] == null) {
                usuariosCadastrados[i] = usuario;
                break;
            }
        }

    }

    public boolean deletarLivro(int id) {

        if (id < livrosCadastrados.length && id >= 0) {
            if (livrosCadastrados[id] == null) {

                System.out.println("Livro não encontrado!");

                return false;
            } else {

                for (int i = id; i < livrosCadastrados.length - 1; i++) {
                    livrosCadastrados[i] = livrosCadastrados[i + 1];

                }

                livrosCadastrados[livrosCadastrados.length - 1] = null;

                return true;

            }

        } else {
            System.out.println("Esse id não existe!");

            return false;
        }


    }


    public boolean deletarUsuario(int id) {
        if (id < usuariosCadastrados.length && id >= 0) {

            if (usuariosCadastrados[id] != null) {

                for (int i = id; i < usuariosCadastrados.length - 1; i++) {

                    usuariosCadastrados[i] = usuariosCadastrados[i + 1];

                }

                usuariosCadastrados[usuariosCadastrados.length - 1] = null;
                System.out.println("Usuário deletado com sucesso!");

                return true;

            } else {

                System.out.println("Este usuário não existe!");

                return false;

            }

        } else {
            System.out.println("Esse id não existe!");

            return false;
        }

    }


    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livro.getStatus().podeEmprestar()) {
            livro.setStatus(Status.EMPRESTADO);
            usuario.adicionarLivro(livro);
        } else {
            System.out.println("Livro indisponível!");
        }

    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (livro.getStatus().podeEmprestar()) {
            System.out.println("Livro ja foi devolvido");
        } else {
            usuario.removerLivro(livro);
            livro.setStatus(Status.DISPONIVEL);
        }

    }

    public void listarUsuarios() {

        for (int i = 0; i < usuariosCadastrados.length; i++) {

            if (usuariosCadastrados[i] != null) {

                System.out.println(usuariosCadastrados[i]);

            }

        }

    }

    public void listarLivros() {

        for (int i = 0; i < livrosCadastrados.length; i++) {

            if (livrosCadastrados[i] != null) {

                System.out.println("id: " + i + "\n" + livrosCadastrados[i]);
                System.out.println("---------------------------------");

            }
        }
    }

    public Livro buscarLivroPorId(int id) {
        return  livrosCadastrados[id];
    }

    public Usuario buscarUsuarioPorId(int id) {
        return usuariosCadastrados[id];
    }


}
