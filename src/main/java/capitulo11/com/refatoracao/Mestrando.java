package capitulo11.com.refatoracao;

import java.time.LocalDate;

/**
 * Um objeto da classe <code>Graduando</code> armazena informações 
 * e fornece comportamentos necessários de um usuário mestrando da 
 * biblioteca.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 * 
 */
public class Mestrando extends Usuario {

  private static final int PRAZO_DE_DEVOLUCAO = 14;

  /**
   * Construtor da classe da <code>Mestrando</code>.
   * 
   * @param matricula A matrícula do mestrando.
   * @param nome      O nome do mestrando.
   */
  public Mestrando(String matricula, String nome) {
    super(matricula, nome, CategoriaDoUsuario.MESTRANDO);
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
