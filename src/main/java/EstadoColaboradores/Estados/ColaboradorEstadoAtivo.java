package EstadoColaboradores.Estados;

import EstadoColaboradores.ColaboradorEstado;

public class ColaboradorEstadoAtivo implements ColaboradorEstado {

    private ColaboradorEstadoAtivo() {};
    private static ColaboradorEstadoAtivo instance = new ColaboradorEstadoAtivo();
    public static ColaboradorEstadoAtivo getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ativo";
    }

}
