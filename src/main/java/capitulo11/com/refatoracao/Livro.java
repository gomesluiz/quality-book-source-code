package capitulo11.com.refatoracao;

/**
 * Um objeto <code>Livro</code> representa as informações e 
 * comportamentos aplicaveis a um livro.
 * 
 * @author Luiz Alberto
 */
public class Livro {
  private String isbn;
  private String titulo;
  private String autor;
  private String editora;
  private double multa;

  /**
   * Construtor da classe <code>Exemplar</code>.
   * 
   * @param isbn    O isbn do livro.
   * @param titulo  O título do livro.
   * @param autor   O autor do livro.
   * @param editora A editora do livro.
   * @param multa   O valor da multa para atraso do livro.
   */
  public Livro(String isbn, String titulo, String autor
      , String editora, double multa) {
    this.setIsbn(isbn);
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setEditora(editora);
    this.setMulta(multa);
  }

  /**
   * Atualizar o isbn do livro. Este método é privado por que 
   * uma vez que o livro tenha sido criado, o seu ISBN não pode
   * mais mudar.
   * 
   * @param isbn
   */
  private void setIsbn(String isbn) {
    this.isbn = isbn;
    
  }
  
  /**
   * Retorna o ISBN do livro.
   * 
   * @return o ISBN do livro.
   */
  public String getIsbn() {
    return this.isbn;
  }

  /**
   * Atualiza o título do livro.
   *
   * @param O novo título do livro.
   */
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  /**
   * Retorna o título do livro.
   * 
   * @return O título do livro.
   */
  public String getTitulo() {
    return this.titulo;
  }

  /**
   * Atualizar o nome do autor do livro.
   * 
   * @param autor O autor do livro.
   */
  private void setAutor(String autor) {
    this.autor = autor;
  }
  
  /**
   * Retorna o nome do autor do livro.
   * 
   * @return O nome do autor do livro.
   */
  public String getAutor() {
    return this.autor;
  }
  
  /**
   * Atualiza a editora do livro.
   * 
   * @param editora A editora do livro.
   */
  public void setEditora(String editora) {
    this.editora = editora;
  }

  /**
   * Retorna a editora do livro.
   * 
   * @return A editora do livro.
   */
  public String getEditora() {
    return this.editora;
  }

  /**
   * Atualiza a multa de um livro.
   * 
   * @param multa O valor da multa
   */
  private void setMulta(double multa) {
    this.multa = multa;
  }

  /**
   * Retorna um valor da multa de um livro.
   * 
   * @return  O valor da multa.
   */
  public double getMulta() {
    return this.multa;
  }
}
