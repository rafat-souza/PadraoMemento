package EstadoColaboradores;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {

    private ColaboradorEstado estado;
    private List<ColaboradorEstado> memento = new ArrayList<ColaboradorEstado>();

    public ColaboradorEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ColaboradorEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ColaboradorEstado> getEstados() {
        return this.memento;
    }

}
