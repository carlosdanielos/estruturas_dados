package ed.II_Unidade.lista;

/**
 * Exceção lançada quando uma operação tenta acessar ou remeover
 * elementos em uma estrutura de dados que está vazia
 *
 * @author Carlos Daniel Oliveira Silva
 * @version 1.0
 * @since 20/10/2025
 */
public class UnderflowException extends RuntimeException {
    /**
     * Construtor que cria uma exceção com a mensagem especificada
     *
     * @param mensagem a mensagem de erro
     */
    public UnderflowException(String mensagem) {
        super(mensagem);
    }
}