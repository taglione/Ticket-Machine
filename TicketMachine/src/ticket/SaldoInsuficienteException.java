package ticket;


public class SaldoInsuficienteException extends Exception {
    @Override
    public String getMessage() {
        return "O saldo atual � insuficiente para a opera��o.";
    }
}
