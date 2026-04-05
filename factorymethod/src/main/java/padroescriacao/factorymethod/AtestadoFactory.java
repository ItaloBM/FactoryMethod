package padroescriacao.factorymethod;

public class AtestadoFactory {

    // Este é o Factory Method. Ele encapsula a complexidade de criação.
    public static IAtestado obterAtestado(String tipo) {
        if (tipo.equalsIgnoreCase("Matricula")) {
            return new AtestadoMatricula();
        } else if (tipo.equalsIgnoreCase("Frequencia")) {
            return new AtestadoFrequencia();
        }
        throw new IllegalArgumentException("Atestado inexistente");
    }
}