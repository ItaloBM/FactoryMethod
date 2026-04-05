package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtestadoFactoryTest {

    @Test
    void deveRetornarAtestadoMatricula() {
        // Repare que o cliente não usa o "new AtestadoMatricula()", ele pede à Fábrica!
        IAtestado atestado = AtestadoFactory.obterAtestado("Matricula");
        assertEquals("Atestado de Matrícula emitido com sucesso.", atestado.emitir());
    }

    @Test
    void deveRetornarAtestadoFrequencia() {
        IAtestado atestado = AtestadoFactory.obterAtestado("Frequencia");
        assertEquals("Atestado de Frequência emitido com sucesso.", atestado.emitir());
    }

    @Test
    void deveRetornarExcecaoParaAtestadoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> AtestadoFactory.obterAtestado("Inexistente"));
    }
}