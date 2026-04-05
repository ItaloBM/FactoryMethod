package sempadrao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmissorAtestadoTest {

    @Test
    void deveEmitirAtestadoMatricula() {
        EmissorAtestado emissor = new EmissorAtestado();
        assertEquals("Atestado de Matrícula emitido com sucesso.", emissor.emitirDocumento("Matricula"));
    }

    @Test
    void deveRetornarErroParaAtestadoInexistente() {
        EmissorAtestado emissor = new EmissorAtestado();
        assertThrows(IllegalArgumentException.class, () -> emissor.emitirDocumento("Transferencia"));
    }
}