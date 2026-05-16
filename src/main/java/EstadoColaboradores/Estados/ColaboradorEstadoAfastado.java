package EstadoColaboradores.Estados;

import EstadoColaboradores.ColaboradorEstado;

public class ColaboradorEstadoAfastado implements ColaboradorEstado {

    private ColaboradorEstadoAfastado() {};
    private static ColaboradorEstadoAfastado instance = new ColaboradorEstadoAfastado();
    public static ColaboradorEstadoAfastado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Afastado";
    }

}
