public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", false);
        Factory factory = getFactory(cliente);
        factory.criar(cliente.getSolicitar());
    }

    private static Factory getFactory(Cliente cliente) {
        if(cliente.temContrato()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
