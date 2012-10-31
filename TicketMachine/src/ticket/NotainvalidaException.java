package ticket;

public class NotainvalidaException extends Exception {
    @Override
    public String getMessage() {
        return "ERRO! Papel-moeda inserido � invalido." +
               "Insira valores como: R$ 1,00 | R$ 2,00 | R$ 5,00 | R$ 10,00 | R$ 20,00 |" +
               "R$ 50,00 | R$ 100,00";
    }
}
