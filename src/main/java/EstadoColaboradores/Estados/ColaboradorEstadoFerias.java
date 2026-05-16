package EstadoColaboradores.Estados;

import EstadoColaboradores.ColaboradorEstado;

public class ColaboradorEstadoFerias implements ColaboradorEstado {

    private ColaboradorEstadoFerias() {};
    private static ColaboradorEstadoFerias instance = new ColaboradorEstadoFerias();
    public static ColaboradorEstadoFerias getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Férias";
    }

}
