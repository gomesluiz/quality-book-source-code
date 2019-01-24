package capitulo11.com.refatoracao;

import java.util.List;

/**
 * Um objeto <code>FicharioDeEmprestimos</code> mantém uma coleção de objetos da
 * classe <code>Emprestimo</code>.
 * 
 * @author Luiz Alberto
 * 
 * @see {@link Emprestimo}
 */
public class FicharioDeEmprestimos {

  private List<Emprestimo> emprestimos;

  /**
   * Obtem o nome do usuário que realizou um determinado empréstimo.
   * 
   * @param codigoDoEmprestimo O código do empréstimo.
   *
   * @return O nome do usuário.
   *
   * @throws EmprestimoNaoEncontradoException se o emprestimo não for encontrado.
   *
   */
  public String getNomeDoUsuario(String codigoDoEmprestimo) throws EmprestimoNaoEncontradoException {
    Emprestimo emprestimo = getEmprestimoPeloCodigo(codigoDoEmprestimo);
    return (emprestimo.getNomeDoUsuario());
  }

  /**
   * Remove um objeto <code>Emprestimo</code> pelo código do empréstimo.
   * 
   * @param codigoDoEmprestimo O código do empréstimo.
   *
   * @return nenhum.
   *
   * @throws EmprestimoNaoEncontradoException se o emprestimo não for encontrado.
   *
   */
  public void removeUmEmprestimo(String codigoDoEmprestimo) throws EmprestimoNaoEncontradoException {
    emprestimos.remove(getEmprestimoPeloCodigo(codigoDoEmprestimo));
  }

  /**
   * Encontra um objeto da classes <code>Emprestimo</code> pelo seu código.
   * 
   * @param codigo o código do emprestimo.
   *
   * @return um objeto da classe <code>Emprestimo</code>.
   * 
   * @throws EmprestimoNaoEncontradoException se o empréstimo não for encontrado.
   *
   */
  private Emprestimo getEmprestimoPeloCodigo(String codigo) throws EmprestimoNaoEncontradoException {
    for (Emprestimo emprestimo : emprestimos) {
      if (emprestimo.getCodigo().equals(codigo)) {
        return emprestimo;
      }
    }
    throw new EmprestimoNaoEncontradoException();
  }
}
