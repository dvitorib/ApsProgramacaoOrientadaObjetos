
package Services;

import java.util.ArrayList;

import Domain.*;

public class gerenciaContas {
    private ArrayList<conta> contas;

    public gerenciaContas() {
        contas = new ArrayList<>();
    }

    public void adicionar(conta cont) {
        contas.add(cont);

    }

    public boolean remover(int cont) {
        for (conta c : contas) {
            if (c.getNumero() == cont) {
                return true;
            }
        }
        return false;
    }

    public String listarContas() {
        return "Contas cadastradas: " + contas;

    }

}
