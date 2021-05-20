package Domain;

public abstract class conta {
    private int numero;
    private double saldo;

    public conta(int numero) {
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double num) {
        return false;
    }

    public boolean sacar(double num) {
        return false;
    }

    public String ToString() {
        return null;

    }

}
