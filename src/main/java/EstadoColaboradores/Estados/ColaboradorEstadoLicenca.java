package EstadoColaboradores.Estados;

import EstadoColaboradores.ColaboradorEstado;

public class ColaboradorEstadoLicenca implements ColaboradorEstado {

    private ColaboradorEstadoLicenca() {};
    private static ColaboradorEstadoLicenca instance = new ColaboradorEstadoLicenca();
    public static ColaboradorEstadoLicenca getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Licença";
    }

}
