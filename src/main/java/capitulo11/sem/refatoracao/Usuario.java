
package capitulo11.sem.refatoracao;

public class Usuario {
  private String matricula;
  private String nome;
  private CategoriaDoUsuario categoria;

  public Usuario(String matricula, String nome, CategoriaDoUsuario categoria) {
    this.matricula = matricula;
    this.nome = nome;
    this.categoria = categoria;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CategoriaDoUsuario getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaDoUsuario categoria) {
    this.categoria = categoria;
  }
}
