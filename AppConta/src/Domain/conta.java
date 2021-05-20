package Domain;

abstract class conta {
    int numero;
    double saldo;

    public conta(int numero) {
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
