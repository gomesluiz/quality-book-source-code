package capitulo11.sem.refatoracao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
  private String codigo;
  private Usuario usuario;
  private LocalDate dataDoEmprestimo;
  private LocalDate dataDeDevolucao;
  private List<Exemplar> exemplares;

  public Emprestimo(String codigo, Usuario usuario, Exemplar primeiro) {
    this.codigo = codigo;
    this.usuario = usuario;
    this.dataDoEmprestimo = LocalDate.now();
    this.exemplares = new ArrayList<Exemplar>();
    this.exemplares.add(primeiro);

    switch (usuario.getCategoria()) {
    case FUNCIONARIO:
    case GRADUANDO:
      this.dataDeDevolucao = this.dataDoEmprestimo.plusDays(7);
      break;
    case MESTRANDO:
      this.dataDeDevolucao = this.dataDoEmprestimo.plusDays(14);
      break;
    case DOUTORANDO:
      this.dataDeDevolucao = this.dataDoEmprestimo.plusDays(21);
    default:
      break;
    }
  }

  public String getCodigo() {
    return this.codigo;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public LocalDate getDataDoEmprestimo() {
    return this.dataDoEmprestimo;
  }

  public LocalDate getDataDeDevolucao() {
    return this.dataDeDevolucao;
  }

  public String getNomeDoUsuario() {
    return this.usuario.getNome();
  }
  
  public void registraExemplar(Exemplar exemplar) {
    this.exemplares.add(exemplar);
  }

}
