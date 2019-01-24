package capitulo11.sem.refatoracao;

import java.util.List;

public class FicharioDeEmprestimos {
	private List<Emprestimo> emprestimos;

	public String getNomeDoUsuario(String codigoDoEmprestimo) 
									throws EmprestimoNaoEncontradoException {
		Emprestimo encontrado = null;
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getCodigo().equals(codigoDoEmprestimo)) {
				encontrado = emprestimo;
			}
		}
		if (encontrado == null) {
			throw new EmprestimoNaoEncontradoException();
		}
		return encontrado.getNomeDoUsuario();
	}

	public void removeUmEmprestimo(String codigoDoEmprestimo) 
									throws EmprestimoNaoEncontradoException {
		Emprestimo encontrado = null;
		for (Emprestimo emprestimo : emprestimos) {
			if (emprestimo.getCodigo().equals(codigoDoEmprestimo)) {
				encontrado = emprestimo;
			}
		}
		if (encontrado == null) {
			throw new EmprestimoNaoEncontradoException();
		}
		emprestimos.remove(encontrado);
		return;
	}
}
