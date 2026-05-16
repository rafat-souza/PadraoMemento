package EstadoColaboradores.Estados;

import EstadoColaboradores.ColaboradorEstado;

public class ColaboradorEstadoDesligado implements ColaboradorEstado {

    private ColaboradorEstadoDesligado() {};
    private static ColaboradorEstadoDesligado instance = new ColaboradorEstadoDesligado();
    public static ColaboradorEstadoDesligado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Desligado";
    }

}
