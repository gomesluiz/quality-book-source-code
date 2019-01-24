package capitulo11.sem.refatoracao;

public class Exemplar {
	private int numero;
	private String titulo;
	private String autor;
	private String isbn;
	private String editora;

	private boolean estaEmprestado;
	private boolean estaDanificado;

	public Exemplar(int numero, String titulo, String autor, String isbn
					, String editora) {
		this.setNumero(numero);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setIsbn(isbn);
		this.setEditora(editora);
		this.setEmprestado(false);
		this.setDanificado(false);
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean isEmprestado() {
		return estaEmprestado;
	}

	public void setEmprestado(boolean estaEmprestado) {
		this.estaEmprestado = estaEmprestado;
	}

	public boolean isDanificado() {
		return estaDanificado;
	}

	public void setDanificado(boolean estaDanificado) {
		this.estaDanificado = estaDanificado;
	}

}
