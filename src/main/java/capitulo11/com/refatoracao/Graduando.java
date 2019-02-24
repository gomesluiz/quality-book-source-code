package capitulo11.com.refatoracao;

import java.time.LocalDate;

/**
 * Um objeto da classe <code>Graduando</code> armazena informações 
 * e fornece comportamentos necessários de um usuário graduando da 
 * biblioteca.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 * 
 */
public class Graduando extends Usuario {

  private static final int PRAZO_DE_DEVOLUCAO = 7;

  /**
   * Construtor da classe da <code>Graduando</code>.
   * 
   * @param matricula A matrícula do graduando.
   * @param nome      O nome do graduando.
   */
  public Graduando(String matricula, String nome) {
    super(matricula, nome, CategoriaDoUsuario.GRADUANDO);
  }

  /**
   * Calcula a data de devolucao de um exemplar.
   * 
   * @param dataDoEmprestimo A data do empréstimo do exemplar.
   * 
   * @return A data de devolucao do exemplar.
   */
  @Override
  public LocalDate calculaPrazoDeDevolucao(LocalDate dataDoEmprestimo) {
    return dataDoEmprestimo.plusDays(PRAZO_DE_DEVOLUCAO);
  }

}
