package capitulo11.com.refatoracao;

/**
 *  Um objeto <code>Exemplar</code> representa as informações 
 *  e comportamentos aplicaveis a um objetos da classe 
 *  <code>Exemplar</code>. 
 * 
 *  @author   Luiz Alberto 
 *  @see      Livro
 */
public class Exemplar {
    private int  numero;
    private Livro livro;
    private boolean estaEmprestado;
    private boolean estaDanificado;

    /**
     * Construtor da classe <code>Exemplar</code>.
     * 
     * @param numero    O numero do exemplar.
     * @param isbn      O isbn do livro.
     * @param titulo    O título do livro.
     * @param autor     O autor do livro.
     * @param editora   O editora do livro.
     * @param multa     O valor da multa para atraso do livro.
     */
    public Exemplar(int numero, String isbn, String titulo
        , String autor,  String editora, double multa) {
            this.livro = new Livro(isbn, titulo, autor
                , editora, multa);
            this.setNumero(numero);
            this.setEmprestado(false);
            this.setDanificado(false);
    }
    
    /**
     * Construtor da classe <code>Exemplar</code>.
     * 
     * @param numero  O número do exemplar.
     * @param livro   O livro associado ao exemplar
     */
    public Exemplar(int numero, Livro livro) {
            this.livro = livro;
            this.setNumero(numero);
            this.setEmprestado(false);
            this.setDanificado(false);
    }
    
    /**
     * Atribui um número a um exemplar. Este método é um método
     * privado por que uma vez que um exemplar tenha sido criado,
     * esse número não pode ser mais alterado.
     * 
     * @param numero O número do exemplar.
     */
    private void setNumero(int numero) {
      this.numero = numero;
    }
    
    /** 
     * Retorna o número do exemplar.
     *
     * @return O número do exemplar.
     */
    public int getNumero(){
        return this.numero;
    }
    
    /**
     * Retorna o título do livro relacionado ao exemplar.
     *
     * @return O título do livro.
     */
    public String getTitulo(){
        return this.livro.getTitulo();
    }
    
    /**
     * Retorna o autor do livro relacionado ao exemplar.
     * 
     * @return O autor do livro.
     */
    public String getAutor() {
      return this.livro.getAutor();
    }

    /**
     * Retorna a editora do livro relacionado ao exemplar.
     * 
     * @return A editora do livro.
     */
    public String getEditora() {
      return this.livro.getEditora();
    }
    
    /**
     * Indica se o <code>Exemplar</code> está danificado 
     * ou não.
     * 
     * @param situacao  TRUE se o livro está danificado ou 
     *                  FALSE se o livro não esta.
     */
    public void setDanificado(boolean situacao) {
      this.estaDanificado = situacao;
      
    }

    /**
     * Indica se o <code>Exemplar</code> está está emprestado 
     * ou não.
     * 
     * @param situacao  TRUE se o livro está emprestado ou 
     *                  FALSE se o livro não está.
     */
    public void setEmprestado(boolean situacao) {
      this.estaEmprestado = situacao;
      
    }

    /**
     * Retorna se o exemplar está emprestado.
     *
     * @return TRUE se o exemplar está disponível, se não FALSE.
     */
    public boolean estaEmprestado(){
        return this.estaEmprestado;
    }

    /**
     * Retorna se o exemplar está danificado.
     *
     * @return TRUE se o exemplar está danificado, se não FALSE.
     */
    public boolean estaDanificado(){
        return this.estaDanificado;
    }

    /**
     * Retorna se o exemplar está disponível. Um exemplar disponível 
     * é aquele que não está emprestado e não está danificado.
     *
     * @return TRUE se o exemplar está disponível, se não FALSE.
     */
    public boolean estaDisponivel(){
        return(!estaEmprestado() && !estaDanificado());
    }

    /**
     * Retorna o valor para atraso na entrega do livro.
     * 
     * @return O valor da multa.
     */
    public double getMulta() {
      return this.livro.getMulta();
    }
}
