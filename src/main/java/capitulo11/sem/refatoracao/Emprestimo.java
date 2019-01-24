package capitulo11.sem.refatoracao;

import java.time.LocalDate;

public class Emprestimo {
	private String codigo;
	private Usuario usuario;
	private LocalDate dataDoEmprestimo;
	private LocalDate dataDeDevolucao;

	public Emprestimo(String codigo, Usuario usuario) {
		this.codigo = codigo;
		this.usuario = usuario;
		this.dataDoEmprestimo = LocalDate.now();

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
		return codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataDoEmprestimo() {
		return dataDoEmprestimo;
	}

	public LocalDate getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public String getNomeDoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
