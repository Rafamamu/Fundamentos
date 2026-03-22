package nivel1.livraria;


import java.util.Arrays;

public class Usuario {

     private  String nome;
     private Livro [] livrosEmprestados;

     public Usuario() {

     }

     public Usuario(String nome) {
         this.nome = nome;
         this.livrosEmprestados = new Livro[3];
     }

     public String getNome() {
         return nome;
     }
     public Livro [] getLivrosEmprestados() {
         return livrosEmprestados;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }
     public void setLivrosEmprestados(Livro [] livrosEmprestados) {
         this.livrosEmprestados = livrosEmprestados;
     }

     public void adicionarLivro(Livro livro) {
         for (int i = 0; i < livrosEmprestados.length; i++) {
             if (livrosEmprestados[i] == null) {
                 livrosEmprestados [i] = livro;
                 break;

             }
         }
     }

     public void removerLivro(Livro livro) {
         for (int i = 0; i < livrosEmprestados.length; i++) {
             if (livrosEmprestados[i] == livro) {
                 livrosEmprestados[i] = null;
                 break;
             }
         }
     }

     @Override
     public String toString() {
         return "Usuário:\n" + nome+" "+
                 "Livros emprestados: " + Arrays.toString(livrosEmprestados);


     }
}
