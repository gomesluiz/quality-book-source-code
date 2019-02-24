package capitulo11.com.refatoracao;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;


/**
 * Um objeto da classe <code>Emprestimo</code> armazena informações e fornece
 * comportamentos necessários para mantê-las.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 *
 */
public class Emprestimo {
  private String codigo;
  private Usuario usuario;
  private LocalDate dataDoEmprestimo;
  private LocalDate dataDeDevolucao;
  private List<Exemplar> exemplares;

  /**
   * Construtor da classe <code>Emprestimo</code>.
   * 
   * @param codigo    O código do empréstimo.
   * @param usuario   O usuário que realizou o empréstimo.
   * @param primeiro  O primeiro exemplar do empréstimo
   */
  public Emprestimo(String codigo, Usuario usuario
      , Exemplar primeiro) {
    this.codigo = codigo;
    this.usuario = usuario;
    this.dataDoEmprestimo = LocalDate.now();
    this.dataDeDevolucao = usuario.calculaPrazoDeDevolucao(dataDoEmprestimo);
    this.registraExemplar(primeiro);
  }

  /**
   * Retorna o código do empréstimo.
   * 
   * @return O código do empréstimo.
   */
  public String getCodigo() {
    return this.codigo;
  }

  /**
   * Retorna da data do empréstimo.
   * 
   * @return A data do empréstimo.
   */
  public LocalDate getDataDoEmprestimo() {
    return this.dataDoEmprestimo;
  }

  /**
   * Retorna da data de devolução do empréstimo
   * 
   * @return A data de devolução.
   */
  public LocalDate getDataDeDevolucao() {
    return this.dataDeDevolucao;
  }

  /**
   * Retorna o nome do usuário do empréstimo.
   * 
   * @return O nome do usuário.
   */
  public String getNomeDoUsuario() {
    return this.usuario.getNome();
  }
  
  /**
   * Registra um <code>Exemplar</code> no empréstimo
   * 
   * @param exemplar O exemplar a ser registrado.
   */
  public void registraExemplar(Exemplar exemplar) {
    this.exemplares.add(exemplar);    
  }
  
  /**
   * Retorna da data de devolução do empréstimo
   * 
   * @return A data de devolução.
   */
  public int getDiasDeAtraso() {
    int diasDeAtraso = Period.between(LocalDate.now()
        , this.dataDeDevolucao).getDays();
    return diasDeAtraso;
  }

  /**
   * Retorna a multa total para um empréstimo em atraso.
   * 
   * @return O valor da multa total.
   */
  public double calculaMultaPorAtraso() {
    double multaTotal   = 0.0;
    int    diasDeAtraso = this.getDiasDeAtraso(); 
    for (Exemplar exemplar:exemplares){
      multaTotal += multaTotal + diasDeAtraso * exemplar.getMulta();
    }
    return multaTotal;
  }

}
