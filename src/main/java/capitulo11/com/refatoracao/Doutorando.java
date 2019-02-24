package capitulo11.com.refatoracao;

import java.time.LocalDate;

/**
 * Um objeto da classe <code>Graduando</code> armazena informações 
 * e fornece comportamentos necessários de um usuário doutorando da 
 * biblioteca.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 * 
 */
public class Doutorando extends Usuario {

  private static final int PRAZO_DE_DEVOLUCAO = 21;

  /**
   * Construtor da classe da <code>Doutorando</code>.
   * 
   * @param matricula A matrícula do doutorando.
   * @param nome      O nome do graduando.
   */
  public Doutorando(String matricula, String nome) {
    super(matricula, nome, CategoriaDoUsuario.DOUTORANDO);
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
