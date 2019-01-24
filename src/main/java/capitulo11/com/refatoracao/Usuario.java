
package capitulo11.com.refatoracao;

import capitulo11.sem.refatoracao.CategoriaDoUsuario;

/**
 * Um objeto da classe <code>Usuario</code> armazena informações e fornece
 * comportamentos necessários para manter essas informações.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 *
 */
public class Usuario {
  private String matricula;
  private String nome;
  private CategoriaDoUsuario categoria;

  /**
   * Construtor da classe <code>Usuario</code>.
   * 
   * @param matricula A matrícula do usuário na instituição
   * @param nome      O nome completo do usuário.
   * @param categoria A categoria do usuário.
   */
  public Usuario(String matricula, String nome, CategoriaDoUsuario categoria) {
    this.matricula = matricula;
    this.nome = nome;
    this.setCategoria(categoria);
  }

  /**
   * Retorna a matrícula do usuário na instituição.
   * 
   * @return A matrícula do usuário.
   */
  public String getMatricula() {
    return matricula;
  }

  /**
   * Retorna o nome completo do usuário.
   * 
   * @return O nome do usuário.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Atualiza o nome do usuário.
   * 
   * @param nome O novo nome completo do usuário.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Retorna a categoria do usuário.
   * 
   * @return A categoria do usuário.
   */
  public CategoriaDoUsuario getCategoria() {
    return categoria;
  }

  /**
   * Atualiza a categoria do usuário.
   * 
   * @param categoria A nova categoria do usuário.
   */
  public void setCategoria(CategoriaDoUsuario categoria) {
    this.categoria = categoria;
  }

}
