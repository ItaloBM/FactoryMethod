package sempadrao.factorymethod;

public class EmissorAtestado {

    // O problema: A classe EmissorAtestado precisa conhecer todos os tipos de atestado.
    // Viola o princípio Aberto/Fechado (OCP), pois se houver um novo atestado, temos de alterar este código.
    public String emitirDocumento(String tipo) {
        if (tipo.equals("Matricula")) {
            return "Atestado de Matrícula emitido com sucesso.";
        } else if (tipo.equals("Frequencia")) {
            return "Atestado de Frequência emitido com sucesso.";
        } else if (tipo.equals("Conclusao")) {
            return "Atestado de Conclusão emitido com sucesso.";
        }
        throw new IllegalArgumentException("Tipo de atestado inexistente");
    }
}