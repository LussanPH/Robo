package exception;

public class MovimentoInvalidoException extends Exception{
	public MovimentoInvalidoException() {
		super("Movimento Invalido");
	}
	
	public MovimentoInvalidoException(String message) {
		super("Movimento Invalido: " + message);
	}
	

}
