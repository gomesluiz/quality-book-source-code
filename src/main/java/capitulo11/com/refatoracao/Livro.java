package capitulo11.com.refatoracao;

/**
 * Um objeto <code>Livro</code> representa as informações e comportamentos
 * aplicaveis a um livro.
 * 
 * @author Luiz Alberto (gomes.luiz@gmail.com)
 */
public class Livro {
	private String isbn;
	private String titulo;
	private String autor;
	private String editora;

	/**
	 * Construtor da classe <code>Exemplar</code>.
	 * 
	 * @param numero  O numero do exemplar.
	 * @param isbn    O isbn do livro.
	 * @param titulo  O título do livro.
	 * @param autor   O autor do livro.
	 * @param editora A editora do livro.
	 */
	public Livro(String isbn, String titulo, String autor, String editora) {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditora(editora);
	}

	private void setAutor(String autor2) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Atribui o ISBN ao livro. Este método deve ser mantido privado pois o 
	 * ISBN do livro é imutável.
	 * 
	 * @param isbn O ISBN do livro.
	 */
	private void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Retorna o ISBN do livro.
	 * 
	 * @return O ISBN do livro.
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

}
