package Testes;

import EstadoColaboradores.Colaborador;
import EstadoColaboradores.Estados.ColaboradorEstadoAtivo;
import EstadoColaboradores.Estados.ColaboradorEstadoDesligado;
import EstadoColaboradores.Estados.ColaboradorEstadoFerias;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EstadoColaboradoresTest {

    @Test
    public void deveArmazenarEstados() {
        Colaborador colaborador = new Colaborador();
        colaborador.setEstado(ColaboradorEstadoAtivo.getInstance());
        colaborador.setEstado(ColaboradorEstadoFerias.getInstance());

        assertEquals(2, colaborador.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Colaborador colaborador = new Colaborador();
        colaborador.setEstado(ColaboradorEstadoAtivo.getInstance());
        colaborador.setEstado(ColaboradorEstadoFerias.getInstance());

        colaborador.restauraEstado(0);

        assertEquals(ColaboradorEstadoAtivo.getInstance(), colaborador.getEstado());
    }

    @Test
    public void deveRetornarEstadoIntermediario() {
        Colaborador colaborador = new Colaborador();
        colaborador.setEstado(ColaboradorEstadoAtivo.getInstance());
        colaborador.setEstado(ColaboradorEstadoFerias.getInstance());
        colaborador.setEstado(ColaboradorEstadoAtivo.getInstance());
        colaborador.setEstado(ColaboradorEstadoDesligado.getInstance());

        colaborador.restauraEstado(2);

        assertEquals(ColaboradorEstadoAtivo.getInstance(), colaborador.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        Colaborador colaborador = new Colaborador();
        colaborador.setEstado(ColaboradorEstadoAtivo.getInstance());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            colaborador.restauraEstado(1);
        });

        assertEquals("Índice inválido", exception.getMessage());
    }

}
