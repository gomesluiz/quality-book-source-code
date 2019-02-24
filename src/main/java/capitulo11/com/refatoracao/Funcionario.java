package capitulo11.com.refatoracao;

import java.time.LocalDate;

import capitulo11.com.refatoracao.CategoriaDoUsuario;

/**
 * Um objeto da classe <code>Funcionario</code> armazena informações 
 * e fornece comportamentos necessários de um usuário funcionário da 
 * biblioteca.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 *
 */
public class Funcionario extends Usuario {

  private static final int PRAZO_DE_DEVOLUCAO = 7;

  /**
   * Construtor da classe da <code>Funcionario</code>.
   * 
   * @param matricula A matrícula do funcionário
   * @param nome      O nome do funcionário.
   */
  public Funcionario(String matricula, String nome) {
    super(matricula, nome, CategoriaDoUsuario.FUNCIONARIO);
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
