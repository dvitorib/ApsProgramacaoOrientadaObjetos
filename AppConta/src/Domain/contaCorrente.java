package Domain;

public class contaCorrente {
    conta conta;

    public boolean validaSaldo(double num) {
        if (conta.getSaldo() >= num) {
            return true;
        }
        return false;
    }

}
